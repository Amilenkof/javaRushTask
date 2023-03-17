import java.util.Arrays;
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

    public static void task5() {
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
    public static void interesnatask6() {
        //В этой задаче нужно:
//Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
//Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
//Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры. Если таких чисел несколько, то необходимо вывести любое из них.
//Минимальных чисел тоже может быть несколько.
        Scanner scan = new Scanner(System.in);
        boolean isExit = false;
        int max = Integer.MIN_VALUE;
        int maxMinusOne = Integer.MIN_VALUE;
        while (!isExit) {
            if (scan.hasNextInt()) {
                int i = scan.nextInt();
                if (i > max) {
                    maxMinusOne = max;
                    max = i;
                }

            }
            if (scan.hasNextLine()) {
                String exit = scan.nextLine();
                if (exit.equals("exit")) {
                    isExit = !isExit;
                }
                System.out.println("максимальное число "+max+ " предмаксимальное "+maxMinusOne);


            }


        }
    }
    public static void task7 () {
        //Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
//Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
//Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.
        Scanner scan = new Scanner(System.in);
        System.out.println("введите строку");
        String s = scan.nextLine();
        System.out.println("введите число от 0 до 5 ");
        int i = scan.nextInt();
        int k = 0;
        if (i>0 && i<5) {
            do {
                System.out.println(s);
                k++;
            }while (k<i) ;
        }}
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
public static void task8 () {
    //        В методе main(String[]) тебе нужно заполнить массив strings значениями. Если индекс массива чётный — присвоить значение "Чётный" (ноль — цифра чётная), иначе присвоить "Нечётный".
//                Вывод текста в консоль в тестировании не участвует.

    String[] arr = new String[5];
    for (int i = 0; i < arr.length; i++) {
        if (i%2==0) {
            arr[i] = EVEN;
        }else  {
            arr[i] = ODD;
        }
    }
    System.out.println("0");
    System.out.println(arr[0]);
    System.out.println("1");
    System.out.println(arr[1]);
    System.out.println("2");
    System.out.println(arr[2]);
    System.out.println("3");
    System.out.println(arr[3]);
    System.out.println("4");
    System.out.println(arr[4]);

}
public static void task9 () {
    //        Реализуй метод main(String[]), который меняет знак элемента массива array на противоположный, если значение этого элемента чётное.
    int[] arr = {-1, 2, 2, -3, 5};
    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
        if (i%2==0) {
            arr[i] = -arr[i];
        }
    }
    System.out.println(Arrays.toString(arr));
}
    public static void main(String[] args) {

    }}

