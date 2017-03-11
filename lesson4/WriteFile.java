/*
Александр Плотников
Практика
  */
import java.util.*;
import java.io.*;
import java.lang.*;
  
public class WriteFile {
    public static void main(String[] args){
        
        //write to file 
        try {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Dropbox\\geekbrains\\Java\\java1\\lesson4\\vasya.txt"));
        String text = "Мама мыла раму, раму мыла мама";
        bw.append('E');
        bw.write(text);
        bw.flush();
        bw.close();
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        } 
        
        //read from file
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\Dropbox\\geekbrains\\Java\\java1\\lesson4\\vasya.txt")))
        {
           /*// читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                 
                System.out.print((char)c);
            } */
            String line = null;
            while ((line = br.readLine()) != null)
                System.out.println(line);
            
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   
        
    }
}
