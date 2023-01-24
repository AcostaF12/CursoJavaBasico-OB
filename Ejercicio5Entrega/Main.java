package Ejercicio5Entrega;

public class Main {
    
    public static void main(String[] args) {
        
        CocheCRUD cocheCRUD = new CocheCRUD();

        cocheCRUD.delete();
        cocheCRUD.findAll();
        cocheCRUD.save();
    }
}
