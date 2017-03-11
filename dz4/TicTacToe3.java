/*
Александр Плотников
Домашнее Задание 4 - 3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5
и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;

  */
import java.util.*;
import java.awt.Toolkit;
  
public class TicTacToe3 {
    public int field_size = 5;
    public char empty_dot = '.';
    public char X_dot = 'X';
    public char O_dot = 'O';
    public char map[][] = new char[field_size][field_size];
    
    public static void main(String[] args)  {
        TicTacToe3 game = new TicTacToe3();
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
        //Горизонталь
        for (int i = 0; i < field_size; i++) {
            if(map[i][0] == symb && map[i][1] == symb && map[i][2] == symb && map[i][3] == symb) return true;
            if(map[i][1] == symb && map[i][2] == symb && map[i][3] == symb && map[i][4] == symb) return true;
        }
        //Вертикаль
        for (int i = 0; i < field_size; i++) {
            if(map[0][i] == symb && map[1][i] == symb && map[2][i] == symb && map[3][i] == symb) return true;
            if(map[1][i] == symb && map[2][i] == symb && map[3][i] == symb && map[4][i] == symb) return true;
        }
        //Диагональ
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb && map[3][3] == symb) return true;
        if(map[1][1] == symb && map[2][2] == symb && map[3][3] == symb && map[4][4] == symb) return true;
        //Диагональ2
        if(map[4][0] == symb && map[3][1] == symb && map[2][2] == symb && map[1][3] == symb) return true;
        if(map[3][1] == symb && map[2][2] == symb && map[1][3] == symb && map[0][4] == symb) return true;
        return false;
    }
}