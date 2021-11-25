public class Friends {
    public static int friends(int n) {
        int friends = (int)Math.round(Math.sqrt(n))-1;
        if(friends < 0 ) {
            friends = 0;
        }
        return friends;
    }
}