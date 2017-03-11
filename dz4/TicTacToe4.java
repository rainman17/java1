/*
Александр Плотников
Домашнее Задание 4 - 4. 
*** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
  */
import java.util.*;
import java.awt.Toolkit;
  
public class TicTacToe4 {
    public int field_size = 3;
    public char empty_dot = '.';
    public char X_dot = 'X';
    public char O_dot = 'O';
    public char map[][] = new char[field_size][field_size];
    
    public static void main(String[] args)  {
        TicTacToe4 game = new TicTacToe4();
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
        int x,y;
        do {
            x = -2;
            y = -2;
            for (int i = 0; i < field_size; i++) {
                if(map[i][0] == X_dot && map[i][1] == X_dot && isDotValid(i,2)) {x = i; y = 2; break;}
                if(map[i][1] == X_dot && map[i][2] == X_dot && isDotValid(i,0)) {x = i; y = 0; break;}
            }
            for (int i = 0; i < field_size; i++) {
                if(map[0][i] == X_dot && map[1][i] == X_dot && isDotValid(2,1)) {x = 2; y = i; break;}
                if(map[1][i] == X_dot && map[2][i] == X_dot && isDotValid(0,1)) {x = 0; y = i; break;}
            }
            if(map[0][0] == X_dot && map[1][1] == X_dot && isDotValid(2,2)) {x = 2; y = 2; break;}
            if(map[1][1] == X_dot && map[2][2] == X_dot && isDotValid(0,0)) {x = 0; y = 0; break;}

            if(map[2][0] == X_dot && map[1][1] == X_dot && isDotValid(0,2)) {x = 0; y = 2; break;}
            if(map[0][2] == X_dot && map[1][1] == X_dot && isDotValid(2,0)) {x = 2; y = 0; break;}
            if (x == -2 && y == -2) {
                x = (int) (Math.random() * field_size);
                y = (int) (Math.random() * field_size);
            }
            if (isDraw()) {
                System.out.println("Ничья! Игра окончена");
                printField();
                System.exit(0);
            }
        } while (!isDotValid(x,y));
        map[x][y] = O_dot;
    }
    
    boolean isDraw() {
        for (int i = 0; i < field_size; i++) {
            for (int j = 0; j < field_size; j++) {
                if (map[i][j] == '.') return false;
            }
        }
        return true;
    }
    
    boolean isWin(char symb) { 
        for (int i = 0; i < field_size; i++) {
            if(map[i][0] == symb && map[i][1] == symb && map[i][2] == symb) return true;
        }
        for (int i = 0; i < field_size; i++) {
            if(map[0][i] == symb && map[1][i] == symb && map[2][i] == symb) return true;
        }
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }
}