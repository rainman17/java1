/*
Александр Плотников
Домашнее Задание 3 - 1
Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
  */
import java.util.*;
  
public class GuessNumber {
    public static void main(String[] args){
        int choose;
        Scanner sc = new Scanner(System.in);
        do {
            guessNumber();
            System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
            System.out.print("> ");
            choose = sc.nextInt();
            while (choose != 0 && choose != 1) {
                System.out.println("Попробуйте что-нибудь ввести еще раз.");
                System.out.print("> ");
                choose = sc.nextInt();
            }
        }    
        while (choose == 1);
    }
    
    static void guessNumber(){
        System.out.println("Вводим границы игры");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int range = b - a;
        int number = (int)(Math.random()*range);
        number = number + a;
        int count = 1;
        System.out.println("Отгадываем число от " + a + " до " + b + ". У вас 3 попытки." );
        while (true) {
            System.out.println("Попытка номер " + count + ".");
            System.out.print("> ");
            int guess = sc.nextInt();
            if (guess > number) {
                System.out.println("Загаданное число меньше");
            } else if (guess < number) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Поздравляю! Вы победили!! Число попыток " + count + ".");
                break;
            }
            if (count == 3) {
                System.out.println("Игра окончена.");
                break;
            }
            count++;
        }
    }
}