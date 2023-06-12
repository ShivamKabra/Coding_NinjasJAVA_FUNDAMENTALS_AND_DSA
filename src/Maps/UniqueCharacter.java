package Maps;

import java.util.HashMap;

public class UniqueCharacter {
    public static String uniqueChar(String str){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Character, Boolean> hashmap = new HashMap<>();
        String ans="";
        for(int i=0;i<str.length();i++){
            if(hashmap.containsKey(str.charAt(i))){
                continue;
            }
            ans=ans+str.charAt(i);
            hashmap.put(str.charAt(i), true);

        }

        return ans;

    }
}
