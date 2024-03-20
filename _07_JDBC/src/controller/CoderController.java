package controller;

import entity.Coder;
import model.CoderModel;

import javax.swing.*;

public class CoderController {

    public static void getAll() {
        CoderModel objModel = new CoderModel();
        String listCoders = "🤷‍♂️ CODER LIST \n";

        for (Object iterador : objModel.findAll()) {
            //Convertimos del Object a Coder
            Coder objCoder = (Coder) iterador;
            listCoders += objCoder.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, listCoders);
    }

    public static String getAllString() {
        CoderModel objModel = new CoderModel();
        String listCoders = "🤷‍♂️ CODER LIST \n";

        for (Object iterador : objModel.findAll()) {
            //Convertimos del Object a Coder
            Coder objCoder = (Coder) iterador;
            listCoders += objCoder.toString() + "\n";
        }

        return listCoders;
    }

    public static void create() {
        //Usamos el modelo
        CoderModel objCoderModel = new CoderModel();

        //Pedimos los datos al usuario
        String name = JOptionPane.showInputDialog("Insert name");
        String clan = JOptionPane.showInputDialog("Insert clan");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Insert age"));

        //Creamos una instacia de coder
        Coder objCoder = new Coder();
        objCoder.setClan(clan);
        objCoder.setAge(age);
        objCoder.setName(name);

        //Llamamos al método de insercción y guardamos el objeto que retorna en coder previamente instanciado, debemos castearlo.
        objCoder = (Coder) objCoderModel.insert(objCoder);

        JOptionPane.showMessageDialog(null, objCoder.toString());
    }

    public static void delete() {
        CoderModel objCoderModel = new CoderModel();

        String listCoders = getAllString();

        int idDelete = Integer.parseInt(JOptionPane.showInputDialog(listCoders + "\n Enter the Id the coder to delete: "));

        Coder objCoder = objCoderModel.findById(idDelete);


        if (objCoder== null){
            JOptionPane.showMessageDialog(null,"Coder not found");
        }else {
            int confirm = JOptionPane.showConfirmDialog(null,"Are you sure want  to delete the  coder ? \n"+ objCoder.toString());

            if (confirm == 0) objCoderModel.delete(objCoder);

        }
    }

    public static void getByName(){
        String name = JOptionPane.showInputDialog("Insert name ");
        CoderModel objModel = new CoderModel();

        String listaString = "COINCIDENCIAS \n";
        for (Coder iterador: objModel.findByName(name)){
            listaString += iterador.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, listaString);

    }
}
