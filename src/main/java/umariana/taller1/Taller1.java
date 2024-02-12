package umariana.taller1;

import java.util.ArrayList;
import java.util.Scanner;
import mundo.Tarea;

/**
 *
 * @author Juan Delgado
 */
public class Taller1 {
    
    
    public static void main(String[] args) {
        
    ArrayList<Tarea> misTareas = new ArrayList<>();
    Scanner lector=new Scanner(System.in);
    
    
    boolean activo=true;
    do {
    System.out.println("========== MENÚ DE OPCIONES ==========\n"
            + "1. Agregar Tarea\n"
            + "2. Mostrar Tareas\n"
            + "3. Terminar Programa\n");
    
    int opcion=lector.nextInt();
     switch(opcion){
        case 1 -> {
            System.out.println("Ingresa el Id de la tarea: \n");
            int id=lector.nextInt();    lector.nextLine();
            System.out.println("Ingrese la descripción de la tarea \n");
            String descripcion=lector.nextLine();
            System.out.println("Ingrese la prioridad de 1-5 \n");
            int prioridad=lector.nextInt();
             
            //Creación del objeto y llenar la información
            Tarea nuevaTarea = new Tarea(id, descripcion, prioridad);
            
            //Almacenar el objeto en la contenedora
            misTareas.add(nuevaTarea);
            System.out.println("La tarea fue agregada exitosamente");
            }
           
        case 2 -> {
            System.out.println("==========Tareas Registradas==========");
            for (Tarea t: misTareas)
            {
                System.out.println("Id: "+ t.getIdTarea());
                System.out.println("Descripción: "+ t.getDescripcion());
                System.out.println("Prioridad: "+ t.getPrioridad());
            }
            }
        
        case 3 -> activo=false;
        default -> {
            }
        }
    }
    while (activo); 
    }
}