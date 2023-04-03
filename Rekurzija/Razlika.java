public class Razlika {

    // Razlika dveh števil, rekurzivno:
    public static int razlika(int a, int b) {
        if (a==b) {
            return 0;
        }
        else return razlika(a-1, b) + 1;
    }

    public static void main(String[] args) {
        System.out.println("Razlika: " + razlika(9, 4));
    }
}
