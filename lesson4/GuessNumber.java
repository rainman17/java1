/*
��������� ���������
�������� ������� 3 - 1
�������� ���������, ������� ���������� ��������� ����� �� 0 �� 9, � ������������ ������ 3 ������� ������� ��� �����.
��� ������ ������� ��������� ������ �������� ������ �� ��������� ������������� ����� ��� ����������, ��� ������.
����� ������ ��� ��������� ��������� ������ � ���������� ���� ��� ���? 1 � �� / 0 � ���(1 � ���������, 0 � ���).
  */
import java.util.*;
  
public class GuessNumber {
    public static void main(String[] args){
        int choose;
        Scanner sc = new Scanner(System.in);
        do {
            guessNumber();
            System.out.println("��������� ���� ��� ���? 1 - �� / 0 - ���");
            System.out.print("> ");
            choose = sc.nextInt();
            while (choose != 0 && choose != 1) {
                System.out.println("���������� ���-������ ������ ��� ���.");
                System.out.print("> ");
                choose = sc.nextInt();
            }
        }    
        while (choose == 1);
    }
    
    static void guessNumber(){
        System.out.println("������ ������� ����");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int range = b - a;
        int number = (int)(Math.random()*range);
        number = number + a;
        int count = 1;
        System.out.println("���������� ����� �� " + a + " �� " + b + ". � ��� 3 �������." );
        while (true) {
            System.out.println("������� ����� " + count + ".");
            System.out.print("> ");
            int guess = sc.nextInt();
            if (guess > number) {
                System.out.println("���������� ����� ������");
            } else if (guess < number) {
                System.out.println("���������� ����� ������");
            } else {
                System.out.println("����������! �� ��������!! ����� ������� " + count + ".");
                break;
            }
            if (count == 3) {
                System.out.println("���� ��������.");
                break;
            }
            count++;
        }
    }
}