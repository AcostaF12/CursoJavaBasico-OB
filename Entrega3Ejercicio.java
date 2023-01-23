public class Entrega3Ejercicio {
    
    public static void main(String[] args) {
        
        String[] nombres = {"Juan Gomez", "Manuel Fernandez", "Geronimo Lo Celso"};
        String nombresConcatenados = "";

        for (String nombre : nombres) {
            nombresConcatenados = nombresConcatenados + nombre + " ";
        }
        System.out.println(nombresConcatenados);
    }
}
