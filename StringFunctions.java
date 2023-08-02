 class StringFunctions{
 



    static boolean checkPalindrome(String str){
        String rev ="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        if(rev.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }


public static void main(String[] args) {


    String str ="abcdscba";

    boolean ans= checkPalindrome(str);
    System.out.println(ans);


    boolean ans2 = checkPalindrome2(str);
    System.out.println(ans2);
   // String str1="tree";//string literals

    // String str="gjk,1jgnajdgkd,,kfaaabjf,,gkdf9kcffg";
    // String []arr = str.split(",,");
    // for(int i=0;i<arr.length;i++){
    //     System.out.println(arr[i]);
    // }
    //  String strarr[]={"text.py", "abc.java","index.html","test.java", "script.js"};
     
    //     int size=0;
    //     for(int i=0;i<strarr.length;i++){
    //         if(strarr[i].endsWith(".java")){
    //             size++;
    //         }
    //     }
    //     int j=0;
    //     String ans[] = new String[size];
    //     for(int i=0;i<strarr.length;i++){
    //          if(strarr[i].endsWith(".java")){
    //             ans[j]=strarr[i];
    //             j++;
    //         }
    //     }
    //     for(int i=0;i<ans.length;i++){
    //         System.out.println(ans[i]);
    //     }


   // String ans[] =new String[strarr.length];
   // int j=0; 
    // for(int i=0;i<strarr.length;i++){
    //     if(strarr[i].endsWith(".java")){
    //         ans[j]=strarr[i];
    //         // System.out.println(ans[j]);
    //         j=j+1;
            
    //     }
    //  }
     
    //  for(int i=0;i<j;i++){
    //     System.out.println(ans[i]);
    //  }


        //System.out.println(strarr[0]);

        // String str= "abc";
        // String str2= new String("sjhfsdkjh");
        // System.out.println(str2);

    // System.out.println(str.endsWith("lkdf"));
    // System.out.println(str.charAt(4));
    // System.out.println(str.substring(3));
    // System.out.println(str.length());
    // System.out.println(str.concat(str1).concat(str1));
    // String arr[]=str.split("[/.s]");
    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" , ");
    // }
    // for(String s:arr){
    //     System.out.println(s);
    // }
    // String str2 = new String("jdfjdsjndjngjfds");


}

}

// class StringFunctions{
   
//     StringFunctions(){
//         System.out.println("hello iam default constructor");
//     }
//     StringFunctions(int a){
//         System.out.println("hello iam number 2 constructor");
//     }
   
//     StringFunctions(int a , float b){
//         this();
//         System.out.println("hello this is function 3" );
//     }
//     public static void main(String[] args) {
//         StringFunctions str = new StringFunctions(23,23.245f);
//     }
// }