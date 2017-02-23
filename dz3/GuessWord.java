/*
��������� ���������
�������� ������� 3 - 2
2 * ������� ������ �� ���� String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
"cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
"pineapple", "pumpkin", "potato"};
��� ������� ��������� ��������� ���������� �����, ����������� ����� � ������������,
���������� ��� � ���������� ������ � �������� ��������� �� ������� ������������. ���� ����� �� �������,
��������� ���������� ����� ������� ����� �� ����� ������.
apple � ����������
apricot - ����� ������
ap############# (15 ��������, ����� ������������ �� ��� ������ ����� �����)
��� ��������� ���� ���� �����������, ����� ������������:
String str = "apple";
str.charAt(0); - �����, ������ char, ������� ����� � ����� str �� ������ �������
������ �� ��� ���, ���� ����� �� �������� �����
���������� ������ ��������� �����
  */
import java.util.*;
import java.awt.Toolkit;
  
public class GuessWord {
    public static void main(String[] args) throws InterruptedException {
        String words[] = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
        "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
        "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        int w = (int)(Math.random() * words.length);
        System.out.println("���������� ������� ���������� ����� �� ������ ����(^^^).");
        String guess = "";
        do {
            System.out.print("> ");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextLine().toLowerCase();
            if (guess.equals(words[w])) {
                System.out.println("��������-��-��!! �� ��������!");
                Runnable sound1 =
                (Runnable)Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exit");
                if(sound1 != null) sound1.run();
                Thread.sleep(1000);
                break;
            }
            if (guess.length() >= words[w].length()) {
                for (int i = 0; i < words[w].length(); i++) {
                    if (guess.charAt(i) == words[w].charAt(i)) {
                        System.out.print(guess.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                for (int i = guess.length(); i < 15; i++) {
                    System.out.print("#");
                }
            } else {
                for (int i = 0; i < guess.length(); i++) {
                    if (guess.charAt(i) == words[w].charAt(i)) {
                        System.out.print(guess.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                for (int i = words[w].length(); i < 15; i++) {
                    System.out.print("#");
                }                
            }
            System.out.println();
        }    
        while (!guess.equals(words[w]));
    }
}