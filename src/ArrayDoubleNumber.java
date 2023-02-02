import java.util.Scanner;

public class ArrayDoubleNumber {

    double sum = 0;
    double average;

    public void counting() {

        System.out.println(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте длинну массива");
        int size = scanner.nextInt();
        double[] numbers = new double[size];

        System.out.println("Введите числа массива");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double max = numbers[0];
        double min = numbers[0];

        for (double number : numbers) {
            sum = sum + number;
        }

        average = sum / numbers.length;
        String result = String.format("%.3f", average);

        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
            System.out.println(min);
        }

        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Сумма чисел массива равна - " + sum);
        System.out.println("Среднее арифметическое равно - " + result);
        System.out.println("Разница между максимальным и минимальным равна - " + (max - min));

    }
}