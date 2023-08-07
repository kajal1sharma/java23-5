public class StringFunction2 {
    public static void main(String[] args) {


        String s="abcddcba";
        int i=0;
        int j=s.length()-1;

        while(i<=j){
            boolean flag =true;
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                flag=false;
                break;
            }
        }
        

        
        // String s="abc,yuba";
        // String rev="";

        // for(int i=s.length()-1;i>=0;i--){
        //     rev=rev+s.charAt(i);
        // }

        // System.out.println(rev.equals(s));

        // String s="red";
        // String s2="red";
        // String s3 = new String("red");
        // System.out.println(s.equals(s3));


    //     String s ="red";

    //     String s2="red";
    //     String s3="red";
    //     String s4 = new String("red");
    //     String s5=new String("red");
    //    if(s4==s5){
    //     System.out.println("these are equal");
    //    }
    //    else{
    //     System.out.println("not equal");
    //    }
    }
}
