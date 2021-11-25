public class HalvingSum {
    int halvingSum(int n) {
        int summe = 0;
        while(n >=1){
            summe += n;
            n = n/2;
        }
        return summe;
    }
}