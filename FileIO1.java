import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO1 {
    public static void main(String[] args)  throws FileNotFoundException , IOException{
        File f1 = new File("abc.txt");
        FileReader f = new FileReader(f1);//It is used to transfer charactters
        
        int ch = f.read();
       
        while(ch!=-1){
            System.out.print((char)ch);
            ch=f.read();
        }


        f.close();

        


        // if(f1.exists()){

        // }
        // else{
        //     try {
        //         f1.createNewFile();
        //     } catch (IOException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
        // }
    }
}
