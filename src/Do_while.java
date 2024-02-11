public class Do_while {
    public static void main(String[] args) {
        int num=11;
        do{
            System.out.println(num);
            num++;
        }while(num<10);
        //It executes the statement even though condition is false
        //Because in do while it first executes the statement then checks for condition
    }
}
