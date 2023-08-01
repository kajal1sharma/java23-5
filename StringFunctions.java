 class StringFunctions{
 
public static void main(String[] args) {
    String str1="tree";//string literals

    String str="kfdksdf sdfjsdklfs dgojdlkgjlkdfg dlsgjlkdf";
    // System.out.println(str.charAt(4));
    // System.out.println(str.substring(3));
    // System.out.println(str.length());
    System.out.println(str.concat(str1));
    String arr[]=str.split(" ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" , ");
    }
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