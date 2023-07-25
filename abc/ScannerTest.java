package abc;

public class ScannerTest {
    int x;
    int y;
    int z;

    public ScannerTest(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void printInfo(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

}
