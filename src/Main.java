import java.util.Scanner;

public class Main {

    public static void task1() {
        //суммирует введенные числа пока не введешь ENTER
        Scanner scan = new Scanner(System.in);
        boolean isExit = false;
        int i, sum = 0;
        while (!isExit) {
            if (scan.hasNextInt()) {
                i = scan.nextInt();
                sum += i;
            }
            if (scan.hasNextLine() && scan.nextLine().equals("ENTER")) {
                isExit = true;
            }
            System.out.println(sum);
        }

    }

    public static void task2() {
        //выводит в консоли прямоугольник 10*5 заполненый буквами Q
        char q = 'Q';

        for (int k = 0; k < 5; k++) {


            for (int i = 0; i < 10; i++) {
                System.out.print(q);
                if (i == 9) {
                    System.out.println();

                }
            }
        }
    }

    public static void task3() {
        //рисует в консоли прямоугольник 20*10 из букв Б
        int wight = 0;
        int lenght = 0;
        while (wight < 20 && lenght < 1) {
            System.out.print("Б");
            wight++;
            if (wight == 20) {
                System.out.println();
                lenght++;
                wight = 0;

            }
            while (lenght >= 1 && lenght < 9) {
                wight++;
                if (wight == 1) {
                    System.out.print("Б");
                } else if (wight > 1 && wight <= 19) {
                    System.out.print(" ");
                }
                if (wight == 20) {
                    System.out.println("Б");
                    lenght++;
                    wight = 0;
                }
            }
        }
        while (wight < 20) {
            System.out.print("Б");
            wight++;
            if (wight == 20) {
                System.out.println();
            }
        }
    }

    public static void task4() {
        //берет значения с консоли находит наименьшее -выходит по слову exit
        Scanner scan = new Scanner(System.in);
        boolean isExit = false;
        int min = Integer.MAX_VALUE;
        while (!isExit) {
            if (scan.hasNextInt()) {
                int i = scan.nextInt();
                if (i < min) {
                    min = i;
                }
            }
            if (scan.hasNextLine()) {
                String exit = scan.nextLine();
                if (exit.equals("exit")) {
                    isExit = !isExit;
                }
                System.out.println("минимальное значение " + min);
            }


        }
    }

    public static void task5()   {
//берет значения с консоли находит наибольшее -выходит по слову exit

        Scanner scan = new Scanner(System.in);
        boolean isExit = false;
        int max = Integer.MIN_VALUE;
        while (!isExit) {
            if (scan.hasNextInt()) {
                int i = scan.nextInt();
                if (i > max) {
                    max = i;
                }
            }
            if (scan.hasNextLine()) {
                String exit = scan.nextLine();
                if (exit.equals("exit")) {
                    isExit = !isExit;
                }
                System.out.println("максимальное значение " + max);
            }


        }
    }


    public static void main(String[] args) {
//В этой задаче нужно:
//Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
//Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
//Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры. Если таких чисел несколько, то необходимо вывести любое из них.
//Минимальных чисел тоже может быть несколько.
        Scanner scan = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            if (!scan.hasNextInt()) {
                ыщге
                break;
            }
        }
    }
}
