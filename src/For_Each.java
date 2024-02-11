import java.util.ArrayList;
public class For_Each {
    public static void main(String[] args) {
        //Creating an arraylist
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);//Adding Elements
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        for(int num:nums){//Here num is elements in nums array list
            System.out.println(num);
            //Loop will continue till all elements are printed
        }
    }
}
