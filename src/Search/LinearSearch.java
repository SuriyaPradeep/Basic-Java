package Search;

import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array={1,6,7,9,10,22,26,25,55};
        int numToSearched=Integer.parseInt(scanner.nextLine());
        int index=search(array,numToSearched);
        if(index==-1){
            System.out.println("Number not found");
        } else{
            System.out.println("Number found at index "+index);
        }
    }
    public static int search(int[] array,int num){
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                return i;
            }
        }
        return -1;
    }
}
