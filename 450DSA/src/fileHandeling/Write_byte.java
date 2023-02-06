package fileHandeling;
import java.io.FileOutputStream;
public class Write_byte
{
    public static void main(String args[]){
        try{
            FileOutputStream fout=new
                    FileOutputStream("D:\\test.txt");
            fout.write(65);
            fout.write(66);
            fout.write(97);
            fout.close();
            System.out.println("successfully completed");
        }catch(Exception e){System.out.println(e);}
    }
}

