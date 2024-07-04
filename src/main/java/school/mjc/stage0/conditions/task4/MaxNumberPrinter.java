package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        // Использование тройного условия для определения наибольшего числа
        int max = first > second ? (first > third ? first : third): (second > third ? second : third);

        // Вывод наибольшего числа
        System.out.println(max);

    }
}
