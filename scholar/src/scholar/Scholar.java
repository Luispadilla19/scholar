

package scholar;


public class Scholar {

  
    public static void main(String[] args) {
        empleados empleado1=new empleados();
        empleado1.nombre="Luis Andrés ";
        empleado1.apellido="Padilla Romero ";
        
        empleado1.printName();
        
        estudiante estudiante1=new estudiante();
        estudiante1.nombre="Luis Andrés";
        estudiante1.apellido="Padilla Romero";
        
               
        //System.out.println("nombre del estudiante :" + estudiante1.nombre + estudiante1.apellido) ;
      //System.out.println ("nombre del empleado :" + empleado1.nombre + empleado1.apellido);
    }
    
}
