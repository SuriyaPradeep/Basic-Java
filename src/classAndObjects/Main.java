package classAndObjects;

public class Main {
    public static void main(String[] args) {
        //Creating Object
        Banking mattAcc=new Banking("Matt",100);
        System.out.println(mattAcc.withdrawal(25));
        System.out.println(mattAcc.withdrawal(100));
        System.out.println(mattAcc.deposit(50));
        System.out.println(mattAcc);
    }
}
