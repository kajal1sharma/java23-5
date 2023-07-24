interface Mammal{
    //final
    int heart=1;
    int ear=2;

    //public abstract 
    void run();
    void eat();
}
interface Abc{
    int heart1=1;
    int ear1=2;
    void run1();
    void eat1();
}

class Child implements Mammal,Abc{
    public void run(){}
    public void eat(){}
    public void run1(){}
    public void eat1(){}
}


// abstract class Mammal{
//     int heart;
//     int ears;
//     int stomach;


//     abstract void run();
//     abstract void eat();

// }


class Human implements Mammal{
    int brain;
    int hand;
    int leg;

    public void run(){
        System.out.println("human beings run with their two legs");
    }
    public void eat(){
        System.out.println("human being have teeth to eat");
    }
}