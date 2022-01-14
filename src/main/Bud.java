import java.util.Arrays;
import java.util.stream.Stream;

public class Bud {
    public static String computerToPhone(String number){
        char[] chararr =number.toCharArray();
        String output = "";
        for(int i = 0; i < chararr.length; i++) {
            if(chararr[i]=='1'||chararr[i]=='2'||chararr[i]=='3'){
                output += (char)((int)chararr[i]+6);
            }else if(chararr[i]=='7'||chararr[i]=='8'||chararr[i]=='9'){
                output += (char)((int)chararr[i]-6);
            }else{
                output += chararr[i];
            }
        }
        return output;
    }
}