class A {
    int v = 10;
}

class B extends A {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.v);
    }
}
