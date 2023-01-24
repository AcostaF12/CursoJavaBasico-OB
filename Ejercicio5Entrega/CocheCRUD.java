package Ejercicio5Entrega;

public class CocheCRUD implements CocheCRUDImpl {

    public CocheCRUD() {
    }

    @Override
    public void save() {
       System.out.println("Un saludo desde el metodo save");
    }

    @Override
    public void delete() {
        System.out.println("Un saludo desde el metodo delete");
    }

    @Override
    public void findAll() {
        System.out.println("Un saludo desde el metodo findAll");
    }

    @Override
    public String toString() {
        return "CocheCRUD []";
    }
    
}
