public class TemperatureAnalysis {

    // Method to calculate the average temperature
    public double calculateAverageTemperature(double[] temperatures) {
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.length;
    }

    // Method to count the number of days above the average temperature
    public int countDaysAboveAverage(double[] temperatures, double averageTemperature) {
        int count = 0;
        for (double temp : temperatures) {
            if (temp > averageTemperature) {
                count++;
            }
        }
        return count;
    }
}
