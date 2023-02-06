package fileHandeling;

import java.io.FileInputStream;
public class read_single_character {

    public static void main(String args[]){
        try
        {
            FileInputStream fin=new FileInputStream("D:\\test.txt");
            int i=fin.read();
            System.out.print((char)i);
            fin.close();
        }
        catch(Exception e)
        { System.out.println(e);}
    }
}

