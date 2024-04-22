package qa.learn;

public class App 
{
    public static void main( String[] args )
    {

        // Задание №1
        hi();

        // Задание №2

        int c = division(10,  2);
        System.out.println( "с = " + c);

        // Задание №3

        evenNumber(9);

        // Задание №4

        hi(1, 12, 35, "Ivan");
    }

    // Задание №1
    static void hi () {
        System.out.println("Hello World!");
    }

    // Задание №2

    public static int division (int a, int b) {
        return a / b;
    }

    // Задание №3

    public static void evenNumber (int number) {
        if (number % 2 == 0) {
            System.out.println(String.format("Чсило %s четное", number));
        } else System.out.println(String.format("Чсило %s не четное", number));
    }

    // Задание №4
    public static void hi (int hour, int minutes, int seconds, String nameUsers) {
        if (hour >= 5 && hour < 12) {
            System.out.println(String.format("Доброе утро, %s ", nameUsers));
        } else if (hour >= 12 && hour <= 16) {
            System.out.println(String.format("Добрый день, %s ", nameUsers));
        } else if (hour >= 16 && hour <= 23) {
            System.out.println(String.format("Добрый вечер, %s ", nameUsers));
        } else  {
            System.out.println(String.format("Доброй ночи, %s ", nameUsers));
        }
    }
}
