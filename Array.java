public class Array {
    public static void main(String[] args) {
        
        
        int marksStudent1 = 90;
        int marksStudent2 = 89;
        int marksStudent3 =56;
        int marksStudent4 =67;
        int marksStudent5 =78;
        int marksStudent6 =90;
        int marksStudent7 =45;
        int marksStudent8=33;

        int sumOfAllStudents =marksStudent1+marksStudent2+marksStudent3+marksStudent4+marksStudent5+marksStudent7+marksStudent6+marksStudent8;


        //array can store similar type huge amount of data under one name with the help indices

        int []marks = new int[10];

        marks[0]=90;
        marks[1]=98;
        marks[2]=78;
        marks[3]=89;
        marks[4]=90;
        marks[5]=78;
        System.out.println(marks[4]);
        
         
        int []marks2={98,67,67,34,90,89,87,45,6,87,45,90,99};
        // int sum = marks2[0]+marks2[1]+marks2[2]+marks2[3]+marks2[4];
        // System.out.println(sum);

        int sumofAll =0;

        //for each loop
        for(int item:marks2){
            System.out.println(item);
            sumofAll=sumofAll+item;

        }
        System.out.println(sumofAll);


        





        

    }
}
