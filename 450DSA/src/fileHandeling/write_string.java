package fileHandeling;

import java.io.FileOutputStream;
public class write_string {

    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("D:\\str.txt");
            String s="Welcome to Fundamentals of JAVA programming course";
            byte b[]=s.getBytes();//converting string into
            fout.write(b);
            fout.close();
            System.out.println("successfully completed");
        }catch(Exception e){System.out.println(e);}
    }
}
