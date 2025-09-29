/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cricketrunsreport;

import java.util.Scanner;

public class CricketRunsReport {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Batsmen and stadiums
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
        String[] stadiums = {"KINGSMEAD", "ST GEORGE", "WANDERERS"};

        // 2D Array to store runs [stadium][batsman]
        int[][] runs = new int[stadiums.length][batsmen.length];

        System.out.println("SA Cricket Application");

        // Input runs for each stadium and batsman
        for (int i = 0; i < stadiums.length; i++) {
            for (int j = 0; j < batsmen.length; j++) {
                System.out.print("Enter the number of runs scored by " 
                        + batsmen[j] + " at " + stadiums[i] + ": ");
                runs[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nRUNS SCORED REPORT");

        // Display runs per batsman and stadium
        for (int j = 0; j < batsmen.length; j++) {
            for (int i = 0; i < stadiums.length; i++) {
                System.out.println(batsmen[j] + " runs scored at " + stadiums[i] + ": " + runs[i][j]);
            }
        }

        // Totals for each stadium
        int[] stadiumTotals = new int[stadiums.length];
        for (int i = 0; i < stadiums.length; i++) {
            int total = 0;
            for (int j = 0; j < batsmen.length; j++) {
                total += runs[i][j];
            }
            stadiumTotals[i] = total;
        }

        System.out.println("\nTOTAL RUNS SCORED AT STADIUMS");
        for (int i = 0; i < stadiums.length; i++) {
            System.out.println(stadiums[i] + ": " + stadiumTotals[i]);
        }

        // Find stadium with most runs
        int maxIndex = 0;
        for (int i = 1; i < stadiumTotals.length; i++) {
            if (stadiumTotals[i] > stadiumTotals[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("\nSTADIUM WITH THE MOST RUNS: " + stadiums[maxIndex]);

        // Total runs scored by each batsman 
        System.out.println("\nTOTAL RUNS SCORED BY EACH BATSMAN");
        for (int j = 0; j < batsmen.length; j++) {
            int total = 0;
            for (int i = 0; i < stadiums.length; i++) {
                total += runs[i][j];
            }
            System.out.println(batsmen[j] + ": " + total);
        }

        sc.close();
    }
}

