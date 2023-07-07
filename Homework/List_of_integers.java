package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_of_integers {

    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumbersList(20, 1, 50);
        System.out.println("Исходный список чисел: " + numbers);

        removeEvenNumbers(numbers);
        System.out.println("Список после удаления чётных чисел: " + numbers);

        int minValue = findMinValue(numbers);
        System.out.println("Минимальное значение: " + minValue);

        int maxValue = findMaxValue(numbers);
        System.out.println("Максимальное значение: " + maxValue);

        double averageValue = findAverageValue(numbers);
        System.out.format("Среднее значение: " + "%.2f" ,averageValue);
    }

    // Метод для генерации случайного списка чисел
    private static List<Integer> generateRandomNumbersList(int size, int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            numbers.add(randomNumber);
        }

        return numbers;
    }

    // Метод для удаления чётных чисел из списка
    private static void removeEvenNumbers(List<Integer> numbers) {
        numbers.removeIf(number -> number % 2 == 0);
    }

    // Метод для поиска минимального значения в списке
    private static int findMinValue(List<Integer> numbers) {
        int minValue = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }

        return minValue;
    }

    // Метод для поиска максимального значения в списке
    private static int findMaxValue(List<Integer> numbers) {
        int maxValue = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }

        return maxValue;
    }

    // Метод для вычисления среднего значения списка
    private static double findAverageValue(List<Integer> numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }
}
    

