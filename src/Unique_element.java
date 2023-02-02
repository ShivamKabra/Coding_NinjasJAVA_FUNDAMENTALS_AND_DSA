public class Unique_element {
    public static int findUnique(int[] arr) {
        //Your code goes here
       /* int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        c++;
                        // arr[i]=0;
                        // arr[j]=0;
                    }
                } else {
                    continue;
                }
            }
            if (c == 0) {
                return arr[i];

            }

            c = 0;
        }

        return -1;*/

            //Your code goes here
            int ans =arr[0];
            for(int i=1;i<arr.length;i++){
                ans=ans^arr[i];
            }
            return ans;
        
    }
}
