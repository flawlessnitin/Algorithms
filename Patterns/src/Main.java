public class Main {
    public static void main(String[] args) {
        int number = 10899;
        int reverse = 0;
        for(int i = 0; number > 0; i++) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println(reverse
        );
    }
}