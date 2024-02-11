package Search;

import java.util.Scanner;

public class BinarySearch {
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
        int begin=0;
        int end=array.length-1;
        int mid;
        while(begin<=end){
            mid=(begin+end)/2;
            if(array[mid]==num){
                return mid;
            } else if(array[mid]>num){
                begin=mid+1;
            } else{
                end=mid-1;
            }
        }
        return -1;
    }
}
