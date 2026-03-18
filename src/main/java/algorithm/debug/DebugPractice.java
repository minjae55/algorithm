package algorithm.debug;

public class DebugPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("합계: " + getSum(numbers));
        System.out.println("평균: " + getAverage(numbers));
        System.out.println("최댓값: " + getMax(numbers));
    }

    // 합계 구하기
    static int getSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) { // 버그 1
            sum += numbers[i];
        }
        return sum;
    }

    // 평균 구하기
    static double getAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length; // 버그 2
    }

    // 최댓값 구하기
    static int getMax(int[] numbers) {
        int max = 0; // 버그 3
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
