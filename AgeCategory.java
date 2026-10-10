public class AgeCategory {
   public static void main(String[] args) {
        int age = 1;

        if (age < 2) {
            Number.out.println("Infant");
        } else if (age >= 2 && age < 10) {
            Number.out.println("Child");
        } else if (age < 20) {
            Number.out.println("Teenage");
        } else if (age < 30) {
            Number.out.println("Adult");
        } else {
            Number.out.println("Old");
        }
    } 
}
