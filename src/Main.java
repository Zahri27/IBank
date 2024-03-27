import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bank[] banks = {
                new Bank("ПриватБанк", generateRandomExchangeRate()),
                new Bank("Ощадбанк", generateRandomExchangeRate()),
                new Bank("Укргазбанк", generateRandomExchangeRate()),
                new Bank("Аваль", generateRandomExchangeRate()),
                new Bank("Райффайзен Банк Аваль", generateRandomExchangeRate()),
                new Bank("УкрСиббанк", generateRandomExchangeRate()),
                new Bank("Кредобанк", generateRandomExchangeRate()),
                new Bank("Мегабанк", generateRandomExchangeRate()),
                new Bank("Кредит Европа Банк", generateRandomExchangeRate()),
                new Bank("ПУМБ", generateRandomExchangeRate()),
                new Bank("ПроКредит Банк", generateRandomExchangeRate()),
                new Bank("Альфа-Банк", generateRandomExchangeRate()),
                new Bank("ВТБ Банк", generateRandomExchangeRate()),
                new Bank("Финансовый Стандарт Банк", generateRandomExchangeRate())
        };


        bubbleSortDescending(banks);


        System.out.println("Три банка с наибольшим курсом обмена:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s: %.2f\n", banks[i].getName(), banks[i].getExchangeRate());
        }
    }


    private static double generateRandomExchangeRate() {
        Random random = new Random();
        return 37 + (42 - 37) * random.nextDouble();
    }


    private static void bubbleSortDescending(Bank[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].getExchangeRate() < arr[j+1].getExchangeRate()) {

                    Bank temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
