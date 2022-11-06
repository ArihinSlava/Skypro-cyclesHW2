public class Main {

    public static void main(String[] args) {

        /// Домашнее задание 1
        ///// Задача 1
        System.out.println(" Домашнее заданий 1 ");
        System.out.println(" Задача 1 ");
        int savings = 15000;
        int total = 0;
        int mouth = 1;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + savings;
            System.out.println(" Месяц " + mouth + " сумма накоплений равна " + total + " рублей ");
            mouth++;
        }

        ///// Задача 2
        System.out.println(" Задача 2 ");

        int numeralNumber = 0;
        while (numeralNumber < 10) {
            numeralNumber++;
            System.out.print(numeralNumber + " ");
        }
        System.out.println(" ");
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }

        ///// Задание 3
        System.out.println(" Задача 3 ");
        int population = 12_000_000;
        int birthRate = population / 1000 * 17;
        int deathRate = 8;
        for (int c = 1; c <= 10; c++) {
            population = population + birthRate - deathRate;
            System.out.println(" Год " + c + " численность населения составляет " + population);
        }
        System.out.println(" ");
        /// Домашнее задание - 2
        ///// Задание 1-2-3
        System.out.println(" Домашнее задание - 2 ");
        System.out.println(" Задание 1-2-3 ");


        int amount = 15000;
        int mount1 = 0;
        for (; mount1 < 108; mount1++) {
            amount = amount + amount / 100 * 7;
            if (mount1 % 6 == 0) {
                System.out.println(" Месяц " + mount1 + " Сумма накоплений равна " + amount + " Рублей ");
            }
        }


            System.out.println(" ");
            //// Задача 4
            System.out.println(" Задача 4 ");

            int friday = 1;
            for (; friday < 31; friday = friday + 7) {
                System.out.println(" Сегодня пятница " + friday + "-е число. Необходимо сдать отчет");
            }

        System.out.println(" ");
            /// Домашнее задание - 3 ///
        ///// Задание 1 /////
        System.out.println(" Домашнее задание - 3 ");
        System.out.println(" Задание 1 ");

        int nowYear = 2022;
        int earlyYear = nowYear - 200;
        int laterYear = nowYear + 100;
        int year = 0;
        while (year <= laterYear) {
            year += 79;
            if (year >= earlyYear && year <= laterYear) {
                System.out.println(year);
            }
        }
        System.out.println(" ");
        ///// Задание 2 /////
        System.out.println(" Задание 2 ");

        for (int a = 1; a <= 10; a++) {
            System.out.println("2 * " + a + " = " + 2*a);
        }
    }
}















