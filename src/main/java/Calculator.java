public class Calculator {

    public static int countEvenNumbers(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6};

        int result = countEvenNumbers(numbers);

        System.out.println("So luong so chan: " + result);
    }
}
