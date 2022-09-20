
public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        int sumPay = 0;
        for (int j : arr) {
            sumPay += j;
        }
        System.out.println("Сумма трат за месяц составила " + sumPay + " рублей.");

        //Максимальная и минимальная траты
        int maxPay = -1;
        int minPay = 200_001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPay) {
                maxPay = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPay) {
                minPay = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей \n", minPay, maxPay);

        // Средние траты за месяц
        double averageSum = (double)(sumPay/30);
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char symbol = 0;
        for (int i = reverseFullName.length-1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
    //Генерация массива со случайными значениями в заданном диапазоне
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}