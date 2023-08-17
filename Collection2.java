import java.lang.Integer;
import java.util.ArrayList;
import java.util.Stack;

class Test10{
    int a;
    int b;
    Test10(int a, int b){
        this.a=a;
        this.b=b;
    }
}

//all the classes of lang package are by default imported into your program 
class Collection2{
    public static void main(String[] args) {
        Test10 a= new Test10(10, 20);
        Test10 b= new Test10(30, 40);
        Test10 c= new Test10(50, 60);
        Test10 d= new Test10(70, 80);

        Stack<Test10> st = new Stack<Test10>();
        st.push(a);
         st.push(b);
          st.push(c);
           st.push(d);

           Test10 ref = st.peek();
           System.out.println(ref.a+"   "+ref.b);

        //Car /Huma
        // Stack<Integer> st = new Stack<Integer>();
        // st.push(34);
        // st.push(45);
        // st.push(67);
        // st.push(90);
        // st.pop();
        // st.pop();
        // System.out.println(st.peek());
        // System.out.println(st);
       // int []arr=new int[10];
        // ArrayList<Integer> arrlist = new ArrayList<Integer>();
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(11);
        // list.add(12);
        // list.add(13);
        // arrlist.add(23);
        // arrlist.add(34);
        // arrlist.add(45);
        // arrlist.add(56);
        // arrlist.add(34);
        // System.out.println(arrlist.get(3));
        // System.out.println(arrlist.)
        // System.out.println(arrlist);
        // System.out.println(arrlist.size());
        // System.out.println(arrlist.remove(2));
        // System.out.println(arrlist.addAll(2,list ));
        // System.out.println(arrlist);


        // //wrapper classes=> primitives(int, float , long double/.........)
        // int i=10;
        // //i is not an object 
        // //hence it does not contain any properties and methods
        // //wrapper classes can convert primitives into objects
        // int b=90;
        // // System.out.println(b.hashCode());
        // //Integer is a wrapper class of int primitive data type

        // Integer obj = b;
        // Integer obj2 = new Integer(90);
        // Integer obj3 =100;
        // System.out.println(obj3);

        // Float f= 23.34f;
        // Double d = 24.56;
        // Boolean g =true;
   

    }
}