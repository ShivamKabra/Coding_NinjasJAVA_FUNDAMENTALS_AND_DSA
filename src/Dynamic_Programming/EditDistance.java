package Dynamic_Programming;

public class EditDistance {
    public static int editDistanceRec(String s, String t){
        if(s.length()==0){
            return t.length();
        }
        if(t.length()==0){
            return s.length();
        }

        if(s.charAt(0)==t.charAt(0)){
            return editDistanceRec(s.substring(1), t.substring(1));
        }
        else{
            // insertion
            int op1 = editDistanceRec(s, t.substring(1));
            //deletion
            int op2 = editDistanceRec(s.substring(1), t);
            // substitution
            int op3 = editDistanceRec(s.substring(1), t.substring(1));

            return 1+Math.min(op1, Math.min(op2,op3));
        }
    }

    public static int editDistanceMemo(String s, String t){
        int[][] storage = new int[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++){
            for(int j=0;j<=t.length();j++){
                storage[i][j] = -1;
            }
        }
        return editDistanceMemo(s,t,storage);
    }

    private static int editDistanceMemo(String s, String t, int[][] storage) {
        int m=s.length();
        int n = t.length();

        if(storage[m][n]!=-1){
            return storage[m][n];
        }
        if(m==0){
            storage[m][n] = n;
        }
        if(n==0){
            storage[m][n] = m;
        }
        if(s.charAt(0)==t.charAt(0)){
            storage[m][n] = editDistanceMemo(s.substring(1), t.substring(1), storage);
        }else{
            // insertion
            int op1 = editDistanceMemo(s, t.substring(1),storage);
            //deletion
            int op2 = editDistanceMemo(s.substring(1), t,storage);
            // substitution
            int op3 = editDistanceMemo(s.substring(1), t.substring(1),storage);
            storage[m][n] = 1+ Math.min(op1, Math.min(op2,op3));
        }

        return storage[m][n];
    }

    public static int editDistanceDP(String s, String t){
        int m=s.length();
        int n = t.length();
        int[][] storage = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            storage[i][0] = i;
        }
        for(int j=0;j<=n;j++){
            storage[0][j] = j;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(m-i)==t.charAt(n-j)){
                    storage[i][j] = storage[i-1][j-1];
                }else{
                    storage[i][j] =1+ Math.min(storage[i-1][j-1], Math.min(storage[i-1][j], storage[i][j-1]));
                }
            }
        }
        return storage[m][n];
    }
}
