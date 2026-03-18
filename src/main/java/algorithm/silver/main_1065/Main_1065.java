package java.algorithm.silver.main_1065;

import java.util.Scanner;

public class Main_1065 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int standardNum = scanner.nextInt();
        int sequenceQuantity = 0;

        if(standardNum >= 100) {
            sequenceQuantity = 99;
        } else {
            sequenceQuantity = standardNum;
        }


        for (int i = 100; i <= standardNum; i++) {
            if(i >= 100 && i < 1000) {
                int firstPlace = i / 100;
                int secondPlace = (i / 10) % 10;
                int lastPlace = i % 10;


                int subtract =  firstPlace - secondPlace;
                if(subtract == secondPlace - lastPlace)  {
                    sequenceQuantity++;
                }
            } else if(i >= 1000) {
                int firstPlace = i / 1000;
                int secondPlace = (i / 100) % 10;
                int thirdPlace = (i % 100) / 10;
                int lastPlace = i % 10;

//				System.out.println("firstPlace = " + firstPlace);
//				System.out.println("secondPlace = " + secondPlace);
//				System.out.println("thirdPlace = " + thirdPlace);
//				System.out.println("lastPlace = " + lastPlace);


                int subtract =  firstPlace - secondPlace;
//				System.out.println("subtract = " + subtract);

                if(subtract == secondPlace - thirdPlace &&
                        subtract == thirdPlace - lastPlace) {
                    sequenceQuantity++;
//					System.out.println("quantity = " + sequenceQuantity);
                }
            }
        }

        System.out.println(sequenceQuantity);
    }

}
