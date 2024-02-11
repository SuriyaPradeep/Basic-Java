package OverloadCounter;

public class Counter {
    private int count;
    //Constructor Overloading
    //Constructor 1
    //Overloading with two different parameters
    public Counter(int startValue){
        this.count=startValue;
    }
    //Constructor 2
    public Counter(){
        this(0);
        //Constructor 2 calling 1
    }
    public int value(){
        return this.count;
    }
    //Method Overloading

    //Overloading with two different parameters
    public void increase(){
        this.count++;
    }
    public void increase(int increaseBy){
        //Does not change for negative or zero
        if(increaseBy>0)
            this.count+=increaseBy;
    }
    public void decrease(){
        this.count--;
    }
    public void decrease(int decreaseBy){
        if(decreaseBy>0)
            this.count-=decreaseBy;
    }
}
