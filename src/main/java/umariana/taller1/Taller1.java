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
            if (misTareas.isEmpty()){
                System.out.println("No se han registrado tareas en el sistema");
            }else{
                System.out.println("==========Tareas Registradas==========");
                
                for (int i = 5; i >= 1; i--){
                    for (Tarea tarea : misTareas){
                        if (tarea.getPrioridad() == i){
                            
                            System.out.println("Id: "+ tarea.getIdTarea());
                            System.out.println("Descripción: "+ tarea.getDescripcion());
                            System.out.println("Prioridad: "+ tarea.getPrioridad());
                        }
                    }
                }
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