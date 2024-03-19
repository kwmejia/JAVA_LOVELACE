package model;

import database.CRUD;
import database.ConfigDB;
import entity.Coder;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CoderModel implements CRUD {

    @Override
    public Object insert(Object obj) {

        //1. Abrimos la conexión
        Connection objConnection = ConfigDB.openConnection();

        //2. Convertir el obj que llegó a Coder
        Coder objCoder =(Coder) obj;

        try {
            //3. Escribir el SQl
            String sql = "INSERT INTO coder (name,age,clan) VALUES (?,?,?);";

            //4. Preparar el Statement, además agregar la propiedad  RETURN_GENERATED_KEYS que hace que la sentencia SQL nos retorne los id generados por la Base de datos
            PreparedStatement objPrepare = objConnection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);

            //5. Asignar valor a los ? ? ?
            objPrepare.setString(1,objCoder.getName());
            objPrepare.setInt(2,objCoder.getAge());
            objPrepare.setString(3,objCoder.getClan());

            //6. Ejecutar el Query
            objPrepare.execute();

            //7. Obtener el resultado con los id (LLaves generadas)
            ResultSet objRest = objPrepare.getGeneratedKeys();

            //8. Iterar mientras haya un registro
            while (objRest.next()){
                //Podemos obtener el valor tambien con indices
                objCoder.setId(objRest.getInt(1));
            }

            JOptionPane.showMessageDialog(null, "Coder insertion was  successful.");

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());

        }

        ConfigDB.closeConnection();

        return objCoder;
    }

    @Override
    public List<Object> findAll() {
        // 1. Crear lista para guardar lo que nos devuelve la base de datos
        List<Object> listCoders = new ArrayList<>();

        // 2. Abrir la conexión
        Connection objConnection = ConfigDB.openConnection();

        try {
            // 3. Escribimos el query en Sql
            String sql = "SELECT * FROM coder;";

            //4. Usar el prepareStatement
            PreparedStatement objPrepare = objConnection.prepareStatement(sql);

            //5. Ejecutar el query y obtener el resultado (ResulSet)

            ResultSet objResult = objPrepare.executeQuery();

            // 6. Mientras haya un resultado siguiente hacer:
            while (objResult.next()){

                // 6.1 Crear un coder
                Coder objCoder = new Coder();

                //6.2 Llenar el objeto con la información de la base de datos del objeto ques está iterando
                objCoder.setName(objResult.getString("name"));
                objCoder.setAge(objResult.getInt("age"));
                objCoder.setId(objResult.getInt("id"));
                objCoder.setClan(objResult.getString("clan"));

                //6.3 Agregamos el Coder a la lista
                listCoders.add(objCoder);
            }

        }catch (SQLException error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
        //Paso 7. Cerrar la conexión
        ConfigDB.closeConnection();

        return listCoders;
    }

    @Override
    public boolean update(Object obj) {
        return false;
    }

    @Override
    public boolean delete(Object obj) {
        return false;
    }
}
