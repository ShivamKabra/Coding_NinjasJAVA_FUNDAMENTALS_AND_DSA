import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

class Solution {


    public static void main (String[] args) {
        String a="coding";
        for(int i=2;i<5;i++)
        {
            System.out.print(a.substring(i-2,i+1));
        }
    }
}
