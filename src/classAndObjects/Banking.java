package classAndObjects;

public class Banking {
    //Private makes it only accessible to the class
    private double balance;
    //final will not let the value change
    private final String name;

    //Creating a constructor
    public Banking(String name, double startingBalance) {
        this.balance = startingBalance;
        this.name = name;
        //Here this means current object
    }
    public String deposit(double amt){
        if(amt>0){
            this.balance+=amt;
            return amt+" has been deposited.";
        } else{
            return amt+" cannot be deposited.";
        }
    }
    public String withdrawal(double amt){
        if(amt>this.balance){
            return "Insufficient Balance\nWithdrawal Cancelled";
        } else if(amt<=0){
            return amt+" cannot be withdrawn.";
        } else{
            this.balance=this.balance-amt;
            return amt+" has been withdrawn\nCurrent Balance: "+this.balance;
        }
    }
    //If you want to represent any object as a string, toString() method comes into existence.
    //If you print any object, Java compiler internally invokes the toString() method on the object.
    // So overriding the toString() method, returns the desired output, it can be the state of an object etc.
    @Override
    public String toString(){
        return this.name+":"+this.balance;
    }
}
