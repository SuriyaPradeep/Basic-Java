import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        //Declaring ArrayList variables
        //<> We specify the arraylist type
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        //To add Elements inside arraylist we use add()
        for (int i = 0; i <= 10; i++) {
            numbers.add(i);
        }
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        //To Check the length of the arraylist we use size()
        System.out.println("Length of numbers:"+numbers.size());
        System.out.println("Length of list:"+list.size());
        //To display elements in specific index use get()
        //Indexing starts from 0 and goes on
        System.out.println("Value in Index 0(numbers):"+numbers.get(0));
        System.out.println("Value in Index 2(list):"+list.get(2));
        //Traversing Using For Loop
        System.out.println("Traversing numbers:");
        for(int i=0;i< numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        //Traversing Using For-Each Loop
        System.out.println("Traversing list:");
        for(String str:list){
            System.out.println(str);
        }
        //To remove Elements use remove()
        //For remove function we can either give index value to remove
        numbers.remove(0);
        //Or actual value to remove
        list.remove("One");
        //But to remove by object in integer arraylist we cant directly pass it
        numbers.remove(Integer.valueOf(5));
        //In above it remove object 5 not index 5
        System.out.println("numbers:"+numbers);
        System.out.println("list:"+list);
        //To insert and element in specified place
        list.add(1,"One");
        numbers.add(4,5);
        //add(index,value)
        System.out.println("numbers:"+numbers);
        System.out.println("list:"+list);
        //To check whether the arraylist contains certain elements using contains
        //It returns Boolean value
        System.out.println(list.contains("Five"));
        System.out.println(numbers.contains(25));
        System.out.println("Sum of numbers in list:"+sum(numbers));
    }
    //Giving arraylist as a parameter
    public static int sum(ArrayList<Integer> numbers){
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        return sum;
    }
}
