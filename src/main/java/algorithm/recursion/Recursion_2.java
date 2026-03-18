package algorithm.recursion;

public class Recursion_2 {

    private static int n = 5;

    static void main(String[] args) {

        recursion(n);

    }

    private static void recursion(int n) {
        if(n == 0) return;
        System.out.println(n);
        recursion(n - 1);
    }
}
