import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from the user for the number of days
        System.out.println("Enter the number of days: ");
        int numberOfDays = scanner.nextInt();

        // Step 2: Create an array to store temperature values
        double[] temperatures = new double[numberOfDays];

        // Step 3: Prompt the user to enter temperature values
        System.out.println("Enter the temperatures for " + numberOfDays + " days:");
        for (int i = 0; i < numberOfDays; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Step 4: Use TemperatureAnalysis class to calculate average temperature
        TemperatureAnalysis analysis = new TemperatureAnalysis();
        double averageTemperature = analysis.calculateAverageTemperature(temperatures);

        // Step 5: Count how many days are above the average temperature
        int daysAboveAverage = analysis.countDaysAboveAverage(temperatures, averageTemperature);

        // Display the average temperature and number of days above average
        System.out.println("Average temperature: " + averageTemperature);
        System.out.println("Number of days above average temperature: " + daysAboveAverage);

        // Close the scanner
        scanner.close();
    }
}
