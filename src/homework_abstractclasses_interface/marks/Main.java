package homework_abstractclasses_interface.marks;

abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    private double sub1;
    private double sub2;
    private double sub3;

    public A(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public double getPercentage() {
        return (sub1 + sub2 + sub3) / 3;
    }
}

class B extends Marks {
    private double sub1;
    private double sub2;
    private double sub3;
    private double sub4;

    public B(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    public double getPercentage() {
        return (sub1 + sub2 + sub3 + sub4) / 4;
    }
}
public class Main {
    public static void main(String[] args) {
        A objA = new A(80, 90, 95);
        B objB = new B(85, 90, 92, 88);

        System.out.println("Percentage Student A: " + objA.getPercentage() + "%");
        System.out.println("Percentage Student B: " + objB.getPercentage() + "%");
    }
}
