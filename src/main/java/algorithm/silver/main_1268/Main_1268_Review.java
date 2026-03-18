package java.algorithm.silver.main_1268;

import java.util.Scanner;

public class Main_1268_Review {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[][] arr = new int[number][5]; //고정 배열 사용

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt(); //int로 배열 넣기
            }
        }

        int max = 0;
        int answer = 0;

        for (int i = 0; i < number; i++) { //학생 A
            int count = 0;
            for (int j = 0; j < number; j++) { //학생 B
                if ( i == j) continue; //같은 학생일 경우 무시

                for (int k = 0; k < 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        //A학생과 B학생의 모든 학년을 비교, 한 번이라도 같으면 count++, 비교 멈춤
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;    //맥스 값 갱신
                answer = i;     //맥스가 바뀌면 학생 번호 바꿈
                //맥스랑 동일한 값이 여러개이면 번호 작은 사람 출력
                //비교 자체를 앞에서부터 하고 있으니 따른 예외 처리 필요 없음
            }
        }

        System.out.println(answer + 1);
    }
}
