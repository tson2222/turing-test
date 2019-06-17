class Test {

    public static void main(String[] args) {
        DummyObject d = new DummyObject(1, "Object1");
        manipulateReference(d);
        System.out.println(d.getId() + "" + d.getName());
        int g = 7;
        manipulatePrimitiveType(g);
        System.out.println(g);
        String immutable = "i am immutable";
        manipulateString(immutable);
        System.out.println(immutable);
        Integer i = 5 ;
        manipulateWrapperClass(i);
        System.out.println(i);
    }

    static void manipulateReference(DummyObject doge) {
        DummyObject doge2 = doge;
        doge2.id = 2;
        doge2.setName("Object12");
    }

    static void manipulatePrimitiveType(int g) {
        g = 22222;
    }

    static void manipulateString(String g) {
        g = g + "test";
    }

    static void manipulateWrapperClass(Integer number) {
        number = number + 4;
    }

}