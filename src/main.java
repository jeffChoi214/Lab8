import java.util.Scanner;

/*
 * Lab 8 by Jeff Choi 2/6/2017
*/

public class main {
    public static void runLoop(Scanner sc, int numBatters, double[] battingAvgs, double[] slugPcs) {
        int hitCounter = 0;
        int totalCounter = 0;
        int arraySize;

        for (int i = 0; i < numBatters; ++i) {
            System.out.print("Enter number of times at bat for batter " + i + ": ");
            arraySize = sc.nextInt();
            sc.nextLine();

            int[] results = new int[arraySize];
            int[][] results2 = new int[numBatters][arraySize];

            System.out.println("");
            System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");

            for (int j = 0; j < arraySize; ++j) {
                while (true) { 
                    System.out.print("Result for batter " + numBatters + " at-bat " + j + ": ");
                    results2[i][j] = sc.nextInt();
                    sc.nextLine();
                   
                    if (results2[i][j] >= 0 && results2[i][j] <= 4) {
                        break;
                    }
                    else {
                        System.out.println("Please enter a number between 0 and 4");
                    } 

                }

                totalCounter += results2[i][j];

                if (results2[i][j] > 0) {
                    hitCounter += 1;
                }
            }
            battingAvgs[i] = (double) hitCounter / (double) arraySize;
            slugPcs[i] = (double) totalCounter / (double) arraySize;

            hitCounter = 0;
            totalCounter = 0;
        }
    }

    public static void printStats(int numBatters, double[] battingAvgs, double[] slugPcs) {
        for (int i = 0; i < numBatters; ++i) {
            System.out.println("Batter " + i + " batting average: " + String.format("%.3f", battingAvgs[i]));
            System.out.println("Batter " + i + " slugging Percentage: " + String.format("%.3f", slugPcs[i]));
        }

    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBatters;
        char toContinue;

        System.out.println("Welcome to the Batting Average Calculator!");
        System.out.println("");

        while (true) {
            // loop begins here
            System.out.print("Enter the number of batters: " ); 
            numBatters = sc.nextInt();
            sc.nextLine();
            
            double[] battingAvgs = new double[numBatters];
            double[] slugPcs = new double[numBatters];

            runLoop(sc, numBatters, battingAvgs, slugPcs);
            printStats(numBatters, battingAvgs, slugPcs);

            // could put the below in a method if i used boolean variables for the while loops
            while (true) {
                System.out.print("Another round? (y/n): ");
                toContinue = sc.next().charAt(0);
                if (toContinue == 'y' || toContinue == 'Y' || toContinue == 'n' || toContinue == 'N') {
                    break;
                }
            }

            if (toContinue == 'n' || toContinue == 'N') {
                break;
            }
        }
    }

}
