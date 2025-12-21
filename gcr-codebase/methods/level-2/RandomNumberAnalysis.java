class RandomNumberAnalysis {

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Method to find average, minimum and maximum
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int value : numbers) {
            sum += value;
            min = Math.min(min, value);
            max = Math.max(max, value);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        int size = 5;

        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.println("Generated 4-digit random numbers:");
        for (int value : randomNumbers) {
            System.out.print(value + " ");
        }

        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("\nAverage value: " + result[0]);
        System.out.println("Minimum value: " + result[1]);
        System.out.println("Maximum value: " + result[2]);
    }
}
