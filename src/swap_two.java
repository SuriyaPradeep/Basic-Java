public class swap_two {
    public static void main(String[] args) {
        int num1=10;
        int num2=5;
        System.out.println("Before Swapping:\n"+num1+"\n"+num2);
        //Swap Using Third variable
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping:\n"+num1+"\n"+num2);
        //Without using third variable
        num1+=num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Swapping:\n"+num1+"\n"+num2);
    }
}
