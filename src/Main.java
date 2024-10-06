public class Main {

    public static void main(String[] args) {
        // Создаем массив дробных чисел размером 15 элементов
        double[] numbers = {1.5, 2.8, -3.4, 4.1, 5.6, -2.2, 7.8, -1.5, 9.3, 10.0, -4.6, 12.2, -8.9, 3.3, 5.4};

        // Флаги для нахождения первого отрицательного числа и подсчета суммы положительных чисел после него
        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        // Цикл for each для подсчета суммы положительных чисел после первого отрицательного
        for (double number : numbers) {
            if (number < 0) {
                foundNegative = true;
            } else if (foundNegative && number > 0) {
                sum += number;
                count++;
            }
        }

        // Выводим среднее арифметическое, если есть положительные числа после первого отрицательного
        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("Нет положительных чисел после первого отрицательного.");
        }
    }
}
