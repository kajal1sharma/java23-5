public class IfElse {
    public static void main(String[] args) {
        
        //nested if-else
        boolean rain=true;
        boolean raincoat =false;
        boolean umbrella =true;

        if(rain==true){

            if(umbrella==true){
                System.out.println("can go out");
            }
            else{
                if(raincoat==true){
                    System.out.println("can go out");
                }
                else{
                    System.out.println("cannot go out");
                }
            }
        }
        else{
            System.out.println("can go out");
        }


    }
}
