import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args)  throws IOException {
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter value of a ");
        // int a= sc.nextInt();
        // System.out.println(a);

        //persistent memory
        

        File f4= new File("C:/Users/ashis/Desktop/java23_5/javaTutorial");
        File f5= new File(f4, "text.java" );
        f5.createNewFile();

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
