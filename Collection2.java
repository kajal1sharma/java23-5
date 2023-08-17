class Collection2{
    public static void main(String[] args) {
        //wrapper classes=> primitives(int, float , long double/.........)
        int i=10;
        //i is not an object 
        //hence it does not contain any properties and methods
        //wrapper classes can convert primitives into objects
        int b=90;
        // System.out.println(b.hashCode());
        //Integer is a wrapper class of int primitive data type

        Integer obj = b;
        Integer obj2 = new Integer(90);
        Integer obj3 =100;
        System.out.println(obj3);

        Float f= 23.34f;
        Double d = 24.56;
        Boolean g =true;
   

    }
}