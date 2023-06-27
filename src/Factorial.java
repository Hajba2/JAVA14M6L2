public class Factorial {

    public static int calcFact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calcFact(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("calcFact(5) = " + calcFact(11));
    }
}
