public class Multipli3o5 {

    public int solution(int number) {
        int output = 0;
        for(int i = 1; i < number; i++) {
            if(i%3==0 || i%5==0){
                output+=i;
            }
        }
        return output;
    }
}