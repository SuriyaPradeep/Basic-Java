public class Switch {
    public static void main(String[] args) {
        String str = "N";
        int num=10;
        switch (str){
            //A break can save a lot of execution time because it "ignores" the
            // execution of all the rest of the code in the switch block.
            case "S":
                System.out.println("The given word is N not S");
                break;
            case "B":
                System.out.println("The given word is N not B");
                break;
            case "N":
                System.out.println("The given word is N");
                break;
            //It executes default when all cases are false
            default:
                System.out.println("The letter is not present in the case");
        }
        switch (num){
            case 1:
                System.out.println("Wrong Number");
                break;
            default:
                System.out.println("Default Case:number not present");

        }
    }
}
