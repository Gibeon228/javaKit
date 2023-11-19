package org.example.task01;


import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        int wins = 0;
        int defeats = 0;
        for (int i = 0; i < 1000; i++) {
            boolean[] booleans = new boolean[3];
            booleans[random.nextInt(0, 3)] = true;
            int ourAnswer = random.nextInt(0, 3);
            int incorrectAnswer = random.nextInt(0, 3);
            while (incorrectAnswer == ourAnswer || booleans[incorrectAnswer] == true) {
                incorrectAnswer = random.nextInt(0, 3);
            }
            int newOurAnswer = -1;
            for (int j = 0; j < 3; j++) {
                if (j != ourAnswer && j != incorrectAnswer) {
                    newOurAnswer = j;
                    break;
                }
            }
            if (booleans[newOurAnswer]) {
                wins++;
            } else {
                defeats++;
            }
        }
        System.out.println("Win - " + wins);
        System.out.println("Defeat - " + defeats);
    }

}


