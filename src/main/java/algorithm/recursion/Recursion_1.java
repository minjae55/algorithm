package algorithm.recursion;

public class Recursion_1 {

    private static int n = 5;

    static void main(String[] args) {

        recursion(0);

    }

    private static void recursion(int i) {
        if(i > n) return;

        System.out.println(i);

        recursion(i + 1);
    }
}
