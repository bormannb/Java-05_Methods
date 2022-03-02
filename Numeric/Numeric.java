public class Numeric {

  
    // a. ) write a method to detect if an integer value is odd
    // Schreiben Sie eine Methode, um zu erkennen, ob ein ganzzahliger Wert ungerade ist
    
    static boolean isnotOdd (int n) {    
        return (n % 2 != 0);
    }

    // b) write a method to detect if an integer value is even
    static boolean isOdd (int m) {    
        return (m % 2 == 0);
    }

    // c.) Berechnung Methode Quadrat
    static int square (int x) {
        return x * x;
    }

    // d.) Berechnung Methode Kubik
    static int cubic (int y) {
        return (y * y) * y;
    }



    // Ausgabe Quadrat
    public static void main(String[] args) {
    // 1.Wert
        int x = square (5);
        System.out.println("Quadrat: " + x);
    // 2. Wert 
        int x2 = square (7);
        System.out.println("Quadrat: " + x2);
    
        // 1.Wert
        int y = cubic (5);
        System.out.println("Kubik: " + y);
    // 2.Wert
        int y2 = cubic (8);
        System.out.println("Kubik: " + y2);
    
    // 1.Wert
        boolean n = isnotOdd(2);
        System.out.println("Zahl: 2 ist ungerade: " + n);
    // 2.Wert  
        boolean n2 = isnotOdd(3);
        System.out.println("Zahl: 3 ist ungerade: " + n2);
    
    // 1.Wert 
        boolean m = isOdd(2);
        System.out.println("Zahl: 2 ist gerade: " + m);
    // 2.Wert
        boolean m2 = isOdd(3);
        System.out.println("Zahl: 3 ist gerade: " + m2);
    }


}