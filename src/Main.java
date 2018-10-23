class Parent{
    public static void foo(){System.out.println("I'm foo in Parent");}
    public void bar(){System.out.println("I'm bar in Parent");}
}
class Child extends Parent{
    public static void foo(){System.out.println("I'm foo in Child");}
    public void bar(){System.out.println("I'm bar in Child");}
}

public class Main {

    public static void main(String[] args) {
        Parent par = new Child();
        Child chi = new Child();

        par.foo();
        chi.foo();

        par.bar();
        chi.bar();
    }
}
