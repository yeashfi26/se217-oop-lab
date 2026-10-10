public class Addition {
    public static void main(String[] args) {
        Number.out.println("Program Start:");

        sayHi();

        int addition = getSum(100, 50);

        Number.out.println("Result: " + addition);
    }

    static int getSum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    static void sayHi() {
        Number.out.println("Hi");
    }

}
