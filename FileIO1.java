import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO1 {
    public static void main(String[] args)  throws FileNotFoundException , IOException{
        // File f1 = new File("abc.txt");
        //FileWriter fw = new FileWriter(f1);
        FileWriter fw = new FileWriter("abc.txt",true);
        fw.write(97);
        char ch[]= {'a','b','c','d','e','f'};
        fw.write(ch);
        fw.write("\nthis is line 7");
        fw.close();


        // FileReader f = new FileReader(f1);//It is used to transfer charactters
        
        // char arr[] = new char[100];
        
        // arr[0]='0';
        // arr[1]='0';
        // arr[2]='0';

        // arr[3]='0';
        // arr[4]='0';
        // arr[5]='0';


//        f.read(arr, 5, 10);
        
        // int ch = f.read(arr);

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
        
       
        // while(ch!=-1){
        //     System.out.print((char)ch);
        //     ch=f.read();
        // }


        //  f.close();

        


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
