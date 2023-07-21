class University{
    int x;
    int y;
    int z;
    University(){

    }
    University(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    final void printInfo(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    void readInfo(){
        System.out.print(x);
         System.out.println(y);
        System.out.println(z);
        System.out.println("...........................");
    }
}
final class College extends University{

    static final String principal="mk singh";
    
    // static {
    //    principal="mk singh";
       
    //    //computation
    //    a=45*89;
    //    a=90;
    //    a=467;
    //    final int c=90;

    // }

    static int a;
    final String name;
    String courses[];
    boolean Naac;
    int size;
    int building;

    College(String name){
        this.name=name;
    }
    College(String name, String[] courses, boolean Naac,int size, int building, int x, int y, int z){
        super(x,y,z);
        this.name =name;
        this.courses=courses;
        this.Naac=Naac;
        this.size=size;
        this.building=building;


    }
    // void printInfo(){

    // }
    void readInfo(){
         System.out.println(y);
        System.out.println(z);
        System.out.println(name);
        System.out.println(Naac);
        System.out.println(principal);
    }
    //you cannot initialize final data member anywhere else except for
    // at the declaration or in the construct
}
// class Abc extends College{

// }
public class finalKey {
    public static void main(String[] args){
   
   
        University u = new University(10, 20, 20);
        String courses[]={"cse","it","mechanical", "civil","entc"};

        College c =new College("iitb",courses, true,45000, 5, 10, 20, 30);
       //Parent ref = object of child
        University u1=new College("iitb",courses, true,45000, 5, 10, 20, 30);
       u1.readInfo();
        // u.readInfo();
        // c.readInfo();
        //     final int d=90;
    //     System.out.println(College.principal);
    //    College clg1 = new College("IIT powai");
    //    //clg1.name="iit delhi";
    //     System.out.println(clg1.name);
    //    College clg2= new College("IIt madras");
    //     System.out.println(clg2.name);
    //    clg.name="IIT powai";
        // int arr[];
        // float arr2[];
        // College carr[]=new College[40];
    } 
}
