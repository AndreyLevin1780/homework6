//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Задание N1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Задание N2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Задание N3");
        for (int i = 2; i <= 17; i=i+2) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Задание N4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Задание N5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year);
        }

        System.out.println("");
        System.out.println("Задание N6");
        for (int i = 7; i <= 98; i=i+7) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Задание N7");
        for (int i = 1; i <= 512; i=i*2) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Задание N8");
        int total = 0;
        int saving = 29000;
        for (int i = 1; i <= 12; i++) {
            total = total + saving;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("");
        System.out.println("Задание N9");
        int savingPerMonth = 29000;
        int totalWithPercents = 0;
        for (int i = 1; i <= 12; i++) {
            totalWithPercents = totalWithPercents + totalWithPercents/100;
            totalWithPercents = totalWithPercents + savingPerMonth;
            System.out.println("Месяц " + i + ". Сумма накоплений равна: " + totalWithPercents + " рублей.");
        }

        System.out.println("");
        System.out.println("Задание N10");
        int result=1;
        int const2 = 2;
        for (int i = 1; i <= 10; i++) {
            result = i*2;
            System.out.println(const2 + "*" + i + "=" + result);
        }
    }
}