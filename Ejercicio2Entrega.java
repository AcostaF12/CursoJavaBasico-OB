public class Ejercicio2Entrega {
    
    public static void main(String[] args) {
    
        System.out.println(getPriceIVA(200)); 
    }

    private static double getPriceIVA(int price) {
        return price + (price * 0.21);
    }

    
}
