package java_statements;

public class Foo2 {

    void foo(int x){
        if(x == 0 ){
            System.out.println("x = "+ x);

        } else if (x>0){
            System.out.println(x + " tiv@ drakan e");
        }
        else {
            System.out.println(x + " tiv@ bacasakan e");
        }
    }

    public static void main(String[] args) {
        Foo2 f = new Foo2();
        f.foo(0);
    }
}
