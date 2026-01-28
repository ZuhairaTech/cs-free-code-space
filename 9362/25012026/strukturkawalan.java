
public class strukturkawalan {
    public static void main(String[] args) {
        int age = 14; //INPUT age

        // if (age >= 6) { // JIKA age >= 6
        //     System.out.println("Kanak-kanak"); // PAPAR "Kanak-kanak"
        // } else if (age >= 18) { // JIKA age >= 18
        //     System.out.println("Dewasa"); // PAPAR "Dewasa"
        // } else if (age >= 13) { // JIKA age >= 13
        //     System.out.println("Remaja"); // PAPAR "Remaja"
        // } else {
        //     System.out.println("Bayi"); // PAPAR "Bayi"
        // }

        switch (age) {
            case 13:
                System.out.println("Remaja"); // PAPAR "Remaja"
                break;
            case 14:
                System.out.println("Remaja"); // PAPAR "Remaja"
                break;
            case 18:
                System.out.println("Dewasa"); // PAPAR "Dewasa" 
                break;
            default:
                break;
        }
        
        
        System.out.println("Selesai"); // PAPAR "Selesai"
    }
}
