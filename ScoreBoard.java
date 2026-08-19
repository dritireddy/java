//package sportsday;

import java.util.Scanner;

public class ScoreBoard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] houses = {"Red", "Blue", "Green", "Yellow"};
        int[] total = new int[4];

        
        for (int event = 1; event <= 5; event++) {
            System.out.println("\nEnter points for Event " + event + ":");

            for (int house = 0; house < 4; house++) {
                System.out.print(houses[house] + " House: ");
                int points = sc.nextInt();
                total[house] += points;
            }
        }

        
        System.out.println("\n--- Total Points ---");
        for (int i = 0; i < 4; i++) {
            System.out.println(houses[i] + " House = " + total[i]);
        }

        int winner = 0;

        for (int i = 1; i < 4; i++) {
            if (total[i] > total[winner]) {
                winner = i;
            }
        }
        System.out.print("\nWinning House: ");

        switch (winner) {
            case 0:
                System.out.println("Red House");
                break;
            case 1:
                System.out.println("Blue House");
                break;
            case 2:
                System.out.println("Green House");
                break;
            case 3:
                System.out.println("Yellow House");
                break;
            default:
                System.out.println("No Winner");
        }

        System.out.println("Total Score = " + total[winner]);

        sc.close();
    }
}