public class Main {
    public static void functionOne() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }
    public static int functionTwo(int a, int b) {
        return a + b;
    }
    public static String functionThree(String firstName, String lastName) {
        return firstName + lastName;
    }
    public static void main(String[] args) {
        functionOne();
        System.out.println(functionTwo(1333, 3320));
        System.out.println(functionThree("Nitin", "Sahu"));
    }
}