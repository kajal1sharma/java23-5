public class Operators {
    public static void main(String[] args) {
        
        int a=10;
        int b=90;

        int sum = a + b;
        int div = b / a;
        int mul = b * a;
        int sub = b - a;

       // expressions
       // ==========
   
        //  a + (c*d ) +(c*(d/(a+b)))
        //(a<b && c<d ) || ( a<d || a>f && a<b )

        //conditionals

        boolean rain =true;
        boolean umbrella =false;
        boolean raincoat=true;

        if((rain==true && umbrella==false) && (raincoat==false)){
            System.out.println("you can not go out");
            System.out.println("you can not go out");
            System.out.println("you can not go out");
            System.out.println("you can not go out");
            System.out.println("you can not go out");
            System.out.println("you can not go out");
            System.out.println("you can not go out");

        }
        else{
            System.out.println("you can go out");
            System.out.println("you can go out");
            System.out.println("you can go out");
            System.out.println("you can go out");
            System.out.println("you can go out");
            System.out.println("you can go out");
            System.out.println("you can go out");
        }






        //relational operator

        //&&(And) , ||(Or) ,!(Not)

        //  boolean bool1 =false;
        //  boolean bool2 =false;

        //  boolean result = bool1 || bool2;
        //  System.out.println(result);

        //  boolean bool1 = true;
        //  System.out.println(!(!bool1));



        // boolean bool1=false;
        // boolean bool2=false;

        // boolean result  =  bool1 && bool2;
        // System.out.println(result);









        // int a=90;
        // int b=90;
        // boolean result1=a>b;
        // boolean result2=a<b;
        // boolean result3=a==b;
        // boolean result4=a>=b;
        // boolean result5=a<=b;
        // boolean result6 = a!=b;
        // System.out.println(result1);
        // System.out.println(result2);
        // System.out.println(result3);
        // System.out.println(result4);
        // System.out.println(result5);
        // System.out.println(result6);

        //conditionals operators 
        //==, < ,> <= ,>=, !=

        // int a=11;
        // int b=11;

        // // boolean result = a==b;
        // //boolean result = a <= b;
        // boolean result  =  a >= b;
        // System.out.println(result);

        // int a= 19;
        // int b=10;

        // boolean result =a < b; 
        // boolean result2 =a > b;
        // System.out.println(result);
        // System.out.println(result2);
    }
}
