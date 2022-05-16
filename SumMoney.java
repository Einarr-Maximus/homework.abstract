import java.util.Random;

public class SumMoney {

    public static void main(String[] args) {

        /* Имеется целое число (любое), это число - сумма денег
        в рублях. Вывести это число, добавив к нему слово "рублей"
        в правильном падеже */

        /*
        1 рубль
        2-4 рубля
        5-0 рублей
        */

        Random random = new Random();
        int money = random.nextInt (1000000);
        String word;
        if (money % 10 == 1)
            word = "рубль";
        else if (money % 10 >= 2 && money % 10 <= 4)
            word = "рубля";
        else if (money % 10 >= 5 && money % 10 <= 9)
            word = "рублей";
        else
            word = "рублей";

        System.out.println(money + " " + word);
    }
}
