
abstract class Book {
    int page;
    int cost;
    String title;

    void getInfo() {
        System.out.println(this.page);
        System.out.println(this.cost);
        System.out.println(this.title);
    }

    abstract void aboutTheBook();

    abstract void getcost();
}

abstract class Novel extends Book {
    int x;
}

class Fantacy extends Novel {

    void aboutTheBook() {

    }

    void getcost() {

    }
}

class Reference extends Book {
    void aboutTheBook() {

    }

    void getcost() {

    }
}

class ScienceAndTech extends Book {
    int x;
    int y;

    void aboutTheBook() {
        System.out.println("abnout the book");
    }

    void getcost() {
        System.out.println("get the cost");
    }

}

public class abstractKey {
    public static void main(String[] args) {
        // Book b=new Book();
        ScienceAndTech sc = new ScienceAndTech();
        sc.aboutTheBook();
        sc.cost = 90;
        sc.getInfo();

    }
}
