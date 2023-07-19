
class Computer {
    int processor;
    private int memory;
    private int camera;

    Computer() {

    }
    // getters setters

    Computer(int pro) {
        this.processor = pro;
    }

    Computer(int a, int b, int c) {
        this.processor = a;
        this.memory = b;
        this.camera = c;
    }

    public void setProcessor(int x) {
        this.processor = x;
    }

    public int getProcessor() {
        return processor;
    }

    public void setMemory(int m) {

        this.memory = m;

    }

    public int getMemory() {
        return this.memory;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

}

class SuperComputer extends Computer {
    int x;
    int y;

    SuperComputer(int a, int b, int c) {
        // super(90,56,45);
        // this.processor=a;
        super(a);
        this.x = b;
        this.y = c;
    }
}

class Super {
    public static void main(String[] args) {
        SuperComputer sp = new SuperComputer(34, 546, 657);
        Computer obj = new Computer();
        Computer obj2 = new Computer(34, 56, 67);
        Computer obj3 = new Computer(879, 86, 6987);
        // obj.memory=90;
        obj.setMemory(78);
        System.out.println(obj.getMemory());
    }
}
