

package ec.edu.espoch.practicados;


public class PracticaDos {

    public static void main(String[] args) {
       Estudiante estudianteUno=new Estudiante();
       estudianteUno.nombre = "Glenda";
       estudianteUno.indentificacion = "2568";
       estudianteUno.promedio = 7.20;
       System.out.println("nombre " +estudianteUno.nombre);
       System.out.println("identificacion " +estudianteUno.indentificacion);
       System.out.println("promedio " +estudianteUno.promedio);
       
        Estudiante estudianteDos=new Estudiante();
        estudianteDos.nombre = "Juan";
        estudianteDos.indentificacion = "26788";
        estudianteDos.promedio = 9.20;
        System.out.println("nombre " +estudianteDos.nombre);
        System.out.println("identificacion " +estudianteDos.indentificacion);
        System.out.println("promedio " +estudianteDos.promedio);
       
    }
}
