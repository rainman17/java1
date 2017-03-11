/*
Александр Плотников
Домашнее Задание 4 - 1
1. Полностью разобраться с кодом, попробовать переписать с нуля,
стараясь не подглядывать в методичку, избавиться от static методов;
  */
import java.util.*;
import java.awt.Toolkit;
  
public class TicTacToe {
    public int field_size = 3;
    public char empty_dot = '.';
    public char X_dot = 'X';
    public char O_dot = 'O';
    public char map[][] = new char[field_size][field_size];

    public static void main(String[] args)  {
        TicTacToe game = new TicTacToe();
        game.initField();
        while (true) {
            game.printField();
            game.turnMan();
            if (game.isWin(game.X_dot))  {
                System.out.println("Победил человек разумный!!");
                game.printField();
                break;
            }
            game.turnComtuper();
            if (game.isWin(game.O_dot))  {
                System.out.println("Победил интеллект железно-разумный!!");
                game.printField();
                break;
            }
        }
    }
   
    void initField() {
        for (int i = 0; i < field_size; i++) {
            for (int j = 0; j < field_size; j++){
                map[i][j] = empty_dot;
            }
        }
    }
    
    void printField()  {
        for (int i = 0; i <= field_size; i++) {
            System.out.print(i + " " );
        }
        System.out.println();
        for (int i = 0; i < field_size; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < field_size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    boolean isDotValid(int x_, int y_) {
        if (x_ < 0 || x_ >= field_size || y_ < 0 || y_ >= field_size) return false;
        if (map[x_][y_] == empty_dot) return true;
        return false;
    }
    
    void turnMan() {
        int x, y;
        do {Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш ход в формате Х У");
        x = sc.nextInt() - 1;
        y = sc.nextInt() - 1;
        } while (!isDotValid(x,y));
        map[x][y] = X_dot;
    }

    void turnComtuper() {
        int x, y;
        do {
            x = (int)(Math.random() * field_size);
            y = (int)(Math.random() * field_size);
        } while (!isDotValid(x,y));
        map[x][y] = O_dot;
    }
    
    boolean isWin(char symb) { 
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false; 
    }
}