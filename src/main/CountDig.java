public class CountDig {

    public static int nbDig(int n, int d) {
        int a = (char)0;
        boolean t = false;
        for(int k = 0; k <=n; k++) {
            char[] b = String.valueOf(k*k).toCharArray();
            for(int i = 0; i < b.length; i++){
                if((int)b[i] == 48+d ){
                    a++;
                }
            }
        }
        return a;
    }
}