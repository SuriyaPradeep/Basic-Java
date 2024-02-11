import classAndObjects.Banking;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        //Declaring Array
        int[] numbers=new int[10];
        String[] list={"First","Second","Third"};
        //Initializing array
        //We can initialize using index value of an array
        numbers[0]=5;
        //We can also update the value by assigning new value to the index
        for(int i=0;i<10;i++){
            numbers[i]=i;
        }
        //.length can be used to find length of an array
        //To Check the length of the arraylist we use size()
        System.out.println("Length of numbers:"+numbers.length);
        System.out.println("Length of list:"+list.length);
        //Traversing
        //For-loop
        System.out.println("Traversing list:");
        for(int i=0;i< list.length;i++){
            System.out.println(list[i]);
        }
        //for each
        System.out.println("Traversing numbers:");
        for(int num:numbers){
            System.out.println(num);
        }
        System.out.println("Sum of numbers in list:"+sum(numbers));

    }
    //Passing array as parameter
    public static int sum(int[] numbers){
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        return sum;
    }
}
