import javax.swing.*;
import java.util.ArrayList;

public class Ejericio_04 {

    public static void main(String[] args) {
        /*  Lista de Reproducción Musical: Imagina que estás creando una aplicación para
         gestionar listas de reproducción musicales. Cada canción es representada
        simplemente por su nombre. El programa debe permitir:
         Añadir y remover canciones de la lista de reproducción.
         Mostrar la canción actual y las siguientes en la lista.
         Saltar a la siguiente canción.*/

        //Creamos nuestro arrayList para guardar las canciones

        ArrayList<String> playlist = new ArrayList<>();

        String option = "";
        //Variable para guardar el indice de la canción actual
        int cancionActual = 0;

        do {

            option = JOptionPane.showInputDialog("PLAYSLIST \n" +
                    "1. Añadir una canción a la paylist.\n" +
                    "2. Remover una canción \n" +
                    "3. Mostrar la canción actual y las siguientes en la lista\n" +
                    "4. Saltar a la siguiente canción \n" +
                    "5. Salir \n" +
                    "Ingrese una opción: ");

            switch (option) {
                case "1": // Añadir una canción a la playlist
                    int repeat = 0;

                    while (repeat == 0) {

                        String nuevaCancion = JOptionPane.showInputDialog("Ingrese el nombre de la canción a agregar 🎶");

                        playlist.add(nuevaCancion.toLowerCase());

                        JOptionPane.showMessageDialog(null, nuevaCancion +
                                " Agregada correctamente. 👍");

                        repeat = JOptionPane.showConfirmDialog(null, "Deseas agregar otra canción?");
                    }
                    break;


                case "2": //Remover una canción

                    //Variable para guardar la lista de canciones en String
                    String totalPlayList = " PLAYLIST 🎶🎶\n";
                    int index = 1;


                    for (String temp : playlist) {
                        totalPlayList += index + ". " + temp + "\n";
                        index++;
                    }
                    int indiceEliminar = 0;
                    boolean valido = true;
                    String input = "";

                    do {
                        try {
                            valido=true;
                           input = JOptionPane.showInputDialog
                                    (totalPlayList + "\nIngrese el número de la canción que deseas eliminar: ");

                           if (input == null){
                               break;
                           }else{
                               indiceEliminar = Integer.parseInt(input);

                               //Validamos que indice ingresado corresponda a algún item
                               if (indiceEliminar<=0 || indiceEliminar > playlist.size()){
                                   JOptionPane.showMessageDialog(null,"Indice no válido");
                               }else{
                                   playlist.remove(indiceEliminar-1);
                                   JOptionPane.showMessageDialog(null, "Canción eliminada correctamente.👍");
                               }
                           }
                        }catch (Exception e){
                           valido= false;
                        }
                    }while (!valido);

                    break;

                case "3": // Mostrar la canción actual y las siguientes en la lista
                    //Si la lista está vacia salir
                    if (playlist.isEmpty()){
                        JOptionPane.showMessageDialog(null,
                                "La playlist está vacía.");
                        break;
                    }

                    //Creamos la variable que guardará la información y la inicializamos con el indice de la canción actual
                    String mensaje = "Canción Actual: \n"+ playlist.get(cancionActual)+
                            "\n\n\nLista de reproducción: \n";

                    //Este ciclo intera desde una posición más de la canción actual hasta el final de la lista
                    for (int i=cancionActual; i < playlist.size() -1 ;i++){
                        mensaje += playlist.get(i+1) + "🎶🎶\n";
                    }
                    //Finalmente imprimimos el mensaje
                    JOptionPane.showMessageDialog(null,mensaje);
                    break;
                case  "4": //Pasar a la siguiente canción

                    if (playlist.isEmpty()) {
                        JOptionPane.showMessageDialog(null,"No hay canciones");
                        break;
                    }
                    //Validar que la lista tenga una canción y que si intento pasar
                     //A la siguiente si exista, de lo contrario vuelva a reproducir toda la playlist
                    if (cancionActual+1 < playlist.size()){
                            cancionActual++;
                    }else {
                        cancionActual=0;
                    }

                    JOptionPane.showMessageDialog(null,
                            "🎶🎶Reproduciendo canción: "+playlist.get(cancionActual));
                    break;
            }


        } while (!option.equals("5"));
    }
}
