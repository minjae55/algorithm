package java.algorithm.silver.main_1120;

import java.util.Scanner;

public class Main_1120 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String smallStr = scanner.next();
        String longStr = scanner.next();

        int lengthSubtract = longStr.length() - smallStr.length();
        int overlapCount = 0;
        int minOverlapCount = Integer.MAX_VALUE;

        for (int i = 0; i <= lengthSubtract; i++) {
            overlapCount = 0;
            for (int j = 0; j < smallStr.length(); j++) {
                if(smallStr.charAt(j) != longStr.substring(i, smallStr.length() + i).charAt(j)) {
                    overlapCount++;
                }
            }
            if(minOverlapCount > overlapCount) {
                minOverlapCount = overlapCount;
            }
        }
        System.out.println(minOverlapCount);
    }
}
/**
 * 찾기 로직 = 작은 문자열 길이 - (큰 문자열 길이 - 겹치는 길이 부분)
 * 새로 추가하는 문자열들을 굳이 구할 필요 없음.
 * 1. smallStr의 부분문자열이 longStr에 포함이 되는지 체크
 * 2. 포함 된다면 부분문자열에 포함되지 않는 갯수가 result
 *
 * //다시 생각한 찾기 로직 = 작은 문자열을 왼쪽으로 미루고, 오른쪽으로 미뤄서 일치하는지 계산
 * // 왼쪽이 더 작다면 왼쪽 겹치지 않는 값 + ( 큰 문자열 길이 - 작은 문자열 길이)
 * **/
