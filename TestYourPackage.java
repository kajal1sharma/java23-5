import abc.ScannerTest;
import abc.inheritance.Base;





public class TestYourPackage extends Base {
    ScannerTest st=new ScannerTest(0, 0, 0);
    
    void printInfo(){
        //System.out.println(st.z);
        // System.out.println(a);
       // System.out.println(b);
       System.out.println(c);
       System.out.println(d);
    }
    public static void main(String[] args) {


        ScannerTest st= new ScannerTest(12,13,14);
        //st.x=90;
        // st.y=67;
        //st.z=78;
        st.w=60;


        // ScannerTest st= new ScannerTest(23, 45, 34);
        // st.printInfo();
        // st.add(89,67);
    }
}
