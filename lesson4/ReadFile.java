/*
��������� ���������
��������
  */
import java.util.*;
import java.io.*;
import java.lang.*;
  
public class ReadFile {
    public static void main(String[] args){
        try { 
            FileReader file = new FileReader("oscar.txt");
            BufferedReader buffer = new BufferedReader(file) ;

            
        }
        catch ( IOException e ) {
                System.out.println( "��������� ������ ������" ) ;
        }
        String line = "" ;
        while ( ( line = buffer.readLine() ) != null ) {
        System.out.println( line ) ; 
        buffer.close();
        }
        //Files.lines(Paths.get("oscar.txt"), StandardCharsets.UTF_8).forEach(System.out::println);
    }
}
