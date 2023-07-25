package abc;

public class ScannerTest {
    private int x;
    int y;
    protected int z;
    public int w;

     public ScannerTest(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
     int add(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    void printInfo(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

}
