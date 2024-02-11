package Reference_Variable;

public class Main {
    public static void main(String[] args) {
        Count a=new Count(1);
        System.out.println("A(No change):"+a);
        //Copy value a to b
        Count b=a;
        System.out.println("B(No change):"+b);
        b.increase();
        System.out.println("B(Increase 1):"+b);
        System.out.println("A(No change):"+a);
        //Here a is also increased by 1
        a.decrease();
        System.out.println("A(Decrease 1):"+a);
        System.out.println("B(No change):"+b);
        //Here b is also decreased by 1
        System.out.println("A(Before calling method):"+a);
        increase(a);
        System.out.println("A(After calling method):"+a);

    }
    public static void increase(Count c){
        //Here it changes the actual value
        c.increase();
    }
}
