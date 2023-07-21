import java.security.Principal;

class College{

    static final String principal;
    static {
       principal="mk singh";
       //computation
       a=45*89;
       a=90;
       a=467;
       final int c=90;

    }

    static int a;
    final String name;
    String courses[];
    boolean Naac;
    int size;
    int building;

    College(String name){
        this.name=name;
    }

    //you cannot initialize final data member anywhere else except for
    // at the declaration or in the construct
}
public class finalKey {
    public static void main(String[] args){
        final int d=90;
        System.out.println(College.principal);
       College clg1 = new College("IIT powai");
       //clg1.name="iit delhi";
        System.out.println(clg1.name);
       College clg2= new College("IIt madras");
        System.out.println(clg2.name);
    //    clg.name="IIT powai";
        // int arr[];
        // float arr2[];
        // College carr[]=new College[40];
    } 
}
