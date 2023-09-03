import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException  {


        File f6= new File("javaTutorial", "temp.java");
        FileWriter fw= new FileWriter(f6);
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedWriter bw2 = new BufferedWriter(bw, 10);
        
        // FileWriter fw = new FileWriter("javaTutorial/temp.java");
        // fw.write(97);
        // fw.write(98);
        // fw.write(48);
        // fw.write("uyuyhjhgfdserrtuyio");
        // fw.close();
        FileReader fr = new FileReader(f6);
        
        int ch = fr.read();
        while(ch!=-1){
            System.out.print((char)ch);
            ch = fr.read();
        }
        fr.close();
        // System.out.println(f6.exists());
        // System.out.println(f6.);
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter value of a ");
        // int a= sc.nextInt();
        // System.out.println(a);

        //persistent memory
        

        // File f4= new File("C:/Users/ashis/Desktop/java23_5/javaTutorial");
        // File f5= new File(f4, "text.java" );
        // f5.createNewFile();

        // File f3= new File("C:/Users/ashis/Desktop/java23_5/javaTutorial", "temp.java");
        // f3.createNewFile();




        // File f2 = new File("../java23_5/temp.txt");
        // f2.createNewFile();



            // File f = new File("javaTutorial");


            // System.out.println(f.exists());
            // f.mkdir();

            // System.out.println(""+f.exists());
            // if(f.exists()==false){
            //     f.createNewFile();
            // }
            // else{
            //     System.out.println("the file already exists");
            // }
       

    }
}
