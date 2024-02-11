public class String_manipulation {
    public static void main(String[] args) {
        //Check Whether 2 string are same
        System.out.println("__________________________________________");
        System.out.println("Check Whether 2 string are same");
        //We check Them using equals
        String str1="Hello";
        String str2="Hello!!";
        System.out.println(str1.equals(str2));
        //It returns a boolean values
        System.out.println("__________________________________________");
        //Find whether given string is empty
        System.out.println("Find whether given string is empty");
        //isEmpty() it gives the boolean value
        str1 = "Hi";
        System.out.println(str1.isEmpty());
        System.out.println("__________________________________________");
        //To print some specific character from string
        System.out.println("To print some specific character from string");
        //We can use chatAt() and pass index to it
        str1="Hello World!!";
        System.out.println(str1.charAt(6));//Prints W
        System.out.println("__________________________________________");
        //Convert to Uppercase and Lowercase
        System.out.println("Convert to Uppercase and Lowercase");
        str1="hi";
        str2="HELLO";
        System.out.println("To Uppercase:"+str1.toUpperCase());
        System.out.println("To Lowercase:"+str2.toLowerCase());
        System.out.println("__________________________________________");
        //Split a string
        System.out.println("Split a string");
        str1="Hey, How are you?";
        //It splits the string with given parameter
        String[] splitted=str1.split(" ");
        //in above it splits with space
        for(String str:splitted){
            System.out.println(str);
        }
        System.out.println("__________________________________________");
        //Length of a string
        System.out.println("Length of a string");
        //We can use length() method
        str1="Hey, How are you?";
        System.out.println("Length:"+str1.length());
        System.out.println("__________________________________________");
        //Check whether a string contains av
        System.out.println("Check whether a string contains av");
        str1="Java";
        str2="Av";
        //We can use contains() method
        System.out.println(str1.contains("av"));//Gives true or false
        System.out.println(str2.contains("av"));
        //It should be identical upper and lower case difference shouldn't be there
        System.out.println("__________________________________________");
        //Capitalize fist letter of every word
        System.out.println("Capitalize fist letter of every word");
        String name="gojo satoru";
        System.out.println("Before Capitalizing");
        System.out.println(name);
        String[] split=name.split(" ");
        for(int i=0;i< split.length;i++){
            //Get First letter using substring
            //substring(begin_index,end_index)
            String f_letter=split[i].substring(0,1).toUpperCase();
            String rest_word=split[i].substring(1);
            split[i]=f_letter+rest_word;
        }
        //Join split array
        name=String.join(" ",split);
        //join(how to join,array_name)
        System.out.println("After Capitalizing");
        System.out.println(name);
        System.out.println("__________________________________________");

    }
}
