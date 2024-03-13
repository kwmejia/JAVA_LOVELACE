import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instacias
        Scanner objScan = new Scanner(System.in);
        GestionCurso objGestion = new GestionCurso();

        int option = 0;
        do {
            System.out.println("""
                    MENU DE OPCIONES
                    1. Administrar Estudiantes
                    2. Administrar Cursos
                    3. Salir
                                        
                    Ingrese una opción: 
                    """);
            option = objScan.nextInt();

            switch (option) {

                case 1:
                    int option3 = 0;
                    do {
                        System.out.println("""
                                MENU DE ESTUDIATES
                                1. Agregar estudiante a un curso
                                2. Listar todos los estudiantes de un curso
                                3. Eliminar estudiante de un curso
                                4. Salir
                                                                
                                Ingresa una opción: 
                                """);
                        option3 = objScan.nextInt();
                        switch (option3) {
                            case 1:
                                objGestion.listarTodosLosCursos();
                                System.out.println("Ingre el código del curso donde" +
                                        " ingresaras el nuevo estudiante 😇");
                                String codigo = objScan.next();

                                Curso objCurso = objGestion.buscarCursoPorCodigo(codigo);

                                if (objCurso == null) {
                                    System.out.println("El código ingresado no es válido");
                                } else {
                                    objCurso.agregarEstudiante(objScan);
                                }
                                break;

                            case 2:

                                objGestion.listarTodosLosCursos();
                                System.out.println("Ingrese el código del curso donde" +
                                        " ingresaras el nuevo estudiante 😇");
                                codigo = objScan.next();

                                objCurso = objGestion.buscarCursoPorCodigo(codigo);

                                if (objCurso == null) {
                                    System.out.println("El código ingresado no es válido");
                                } else {
                                    objCurso.listarEstudiantes();
                                }
                                break;

                            case 3: //Eliminar estudiantes a un curso en especifico

                                //1. Listar los cursos
                                objGestion.listarTodosLosCursos();

                                //2. Preguntar el codigo del curso
                                System.out.println("Ingresa el código del curso donde deseas eliminar el estudiante: ");
                                codigo = objScan.next();
                                //3 . Buscar el Curso que tenga ese código
                                Curso objcurso = objGestion.buscarCursoPorCodigo(codigo);
                                if (objcurso == null) {
                                    System.out.println("El código ingresado no coincide con ningún curso");
                                } else {
                                    //4. Eliminar el estudiante de ese curso encontrado
                                    objcurso.eliminarEstudiante(objScan);
                                }
                                break;
                        }

                    } while (option3 != 4);
                    break;
                case 2:
                    int option2 = 0;
                    do {
                        System.out.println("""
                                MENU DE CURSOS
                                1. Agregar curso.
                                2. Listar cursos.
                                3. Buscar por código.
                                4. Salir
                                                                
                                Ingrese una opción:
                                """);
                        option2 = objScan.nextInt();

                        switch (option2) {
                            case 1:
                                objGestion.agregarCurso(objScan);
                                break;
                            case 2:
                                objGestion.listarTodosLosCursos();
                                break;
                            case 3:
                                System.out.println("Ingresa el código del curso a buscar: ");
                                String codigo = objScan.next();

                                Curso objCurso = objGestion.buscarCursoPorCodigo(codigo);
                                if (objCurso == null) {
                                    System.out.println("No existe ningún curso con este código 😒");
                                } else {
                                    System.out.println(objCurso.toString());
                                }


                                break;
                        }
                    } while (option2 != 4);

                    break;
            }

        } while (option != 3);


    }
}