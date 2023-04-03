public class HanojskiStolpici {
    private static void hanoi (int n, char a, char b, char c) {
        if (n==1) {
            System.out.println("Prevstavi obroč s palice " + a + " na palico " + c);
        }
        else {
            hanoi(n-1, a, c, b);
            hanoi(1, a, b, c);
            hanoi(n-1, b, a, c);
        }
    }
    
    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }
}
