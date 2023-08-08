public class StringFunction2 {
    public static void main(String[] args) {


        String str1="run";
        String str2 ="orn";
        boolean flag=false;;


        if(str1.length()==str2.length()){
        for(int i=0;i<str1.length();i++){
            boolean found=false;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                     found=true;
                }
            }
            if(found==false){

                flag=false;
                break;
            }
            else{
                flag=true;
            }

        }
    }
    System.out.println(flag);



        //palindrome 
        // String s="this is the first String";
        // String arr[]=s.split(" ");
        // String ans="";
        // for(int i=arr.length-1;i>=0;i--){
        //     ans=ans+arr[i]+" ";
        // }
        // System.out.println(ans);



        // int i=0;
        // int j=s.length()-1;

        // while(i<=j){
        //     boolean flag =true;
        //     if(s.charAt(i)==s.charAt(j)){
        //         i++;
        //         j--;
        //     }
        //     else{
        //         flag=false;
        //         break;
        //     }
        // }
        

        
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
