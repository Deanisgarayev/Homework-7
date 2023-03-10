public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int cash = 15000;
        int total = 0;
        int month = 1;
        do {
            System.out.println("Месяц " + month + " сумма накоплений ровна " + total + " рублей");
            month++;
            total = total + cash;
        } while (total <= 2_459_000);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a <= 9) {
            a++;
            System.out.println(a);
        }
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int growthRate = birthRate - deathRate;
        System.out.println("Прирост состовляет " + growthRate + " на 1000 людей");
        int people = 1000;
        int year = 0;
        do {
            System.out.println("Год " + year + " численность населения составляет " + population);
            year++;
            population = population + (population / people * growthRate);
        } while (year <= 10);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int month = 0;
        int cash = 15000;
        int total = 0;
        do {
            System.out.println("Месяц " + month + " сумма накоплений ровна " + total + " рублей");
            month++;
            total = total + total / 100 * 7;
            total = total + cash;
        } while (total <= 12_000_000);
    }

    public static void task5() {
        System.out.println("Задача 5");
        int cash = 22023;
        int total = 0;
        for (int a = 6; a <= 24; a = a + 6) {
            total = total + (cash * 6);
            System.out.println("Месяц " + a + " сумма накоплений ровна " + total + " рублей");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int month = 0;
        int cash = 15000;
        int total = 0;
        do {
            System.out.println("Месяц " + month + " сумма накоплений ровна " + total + " рублей");
            month = month + 6;
            total = total + total / 100 * 7;
            total = total + cash * 6;
        } while (month <= 108);
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int friday = 3; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int a = 0;
        int comet = 79;
        int zero = 0;
        int centuryAgo = 1923;
        int time = centuryAgo / comet;
        System.out.println("Количество раз " + time);
        int date = comet * time;
        System.out.println("Дата " + date);
        do {
            System.out.println("В " + date + " год над Землей пролетает комета");
            date = date + comet;
        } while (date <= 2123);
        }
    }
