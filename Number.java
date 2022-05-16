import java.util.Random;

public class Number {

    public static void main(String[] args) {

        //Создайте число. Определите, является ли последняя цифра числа семеркой

        Random random = new Random();
        int x = random.nextInt(1000000);
        System.out.println(x);
        int y = x % 10;
        if (y == 7)
            System.out.println("Последняя цифра числа " + x + " является 7");
            else
                System.out.println("Последняя цифра числа " + x + " не является 7");

    }
}
