public class BitsOfInteger{
    public static int reverse_bits(int n){
        char[] chararr = Integer.toBinaryString(n).toCharArray();
        int summe = 0;
        for (int i = chararr.length - 1; i >= 0; i--) {
            if (chararr[i] == '1') {
                summe += Math.pow(2,i);
            }
        }
        return summe;
    }
}