import java.util.Scanner;

/*
 * Lab 8 by Jeff Choi 2/6/2017
*/

public class main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize;
        int hitCounter = 0;
        int totalCounter = 0;
        double battingAvg;
        double slugPc;
        char toContinue;

        System.out.println("Welcome to the Batting Average Calculator!");
        System.out.println("");

        while (true) {
            // loop begins here
            System.out.print("Enter number of times at bat: ");
            arraySize = sc.nextInt();
            sc.nextLine();

            int[] results = new int[arraySize];
            
            System.out.println("");
            System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");

            for (int i = 0; i < arraySize; ++i) {
                System.out.print("Result for at-bat " + i + ": ");
                results[i] = sc.nextInt();
                sc.nextLine();
                totalCounter += results[i];

                if (results[i] > 0) {
                    hitCounter += 1;
                }
            }

            battingAvg = (double) hitCounter / (double) arraySize;
            slugPc = (double) totalCounter / (double) arraySize;
            System.out.println("Batting average: " + String.format("%.3f", battingAvg));
            System.out.println("Slugging Percentage: " + String.format("%.3f", slugPc));

            while (true) {
                System.out.print("Another batter? (y/n): ");
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
