import java.util.Scanner;

public class Reverse_Each_Word {
    public static StringBuilder reverseEachWord(String str) {
        //Your code goes here
        String[] words = str.split(" ");

        StringBuilder reverseStr = new StringBuilder();

        // Iterate over String array
        for (String word : words) {
            // reverse each word by calling reverseWithStringConcat method
            StringBuilder temp = new StringBuilder(word);
            reverseStr.append(temp.reverse());
            reverseStr.append(" ");
        }


        return new StringBuilder(reverseStr.substring(0, reverseStr.length()));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverseEachWord(str));
    }
}
