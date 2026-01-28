// Java Example
public class Practical2 {
    public static void main(String[] args) {
        // == != > < >= <=
        // && (AND) 
        // || (OR) 
        // ! (NOT)
        String a = "10";
        String b = "20";

        if(!a.equals("5")) {
            System.out.println("a bukan 5");
        }

        if(a.equals("10") && b.equals("20")) {
            System.out.println("a ialah 10 dan b ialah 20");
        }

        if(a.equals("10") || b.equals("30")) {
            System.out.println("Salah satu benar");
        }
    }
}
