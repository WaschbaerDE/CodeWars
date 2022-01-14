import java.util.Arrays;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols)
    {
        char[] charArr = text.toCharArray();
        char[] commentSymbolsArr = new char[commentSymbols.length];
        boolean write = true;
        String result = "";


        for(int i = 0; i < commentSymbols.length; i++){
            commentSymbolsArr[i] = commentSymbols[i].charAt(0);
        }


        for(int i = 0; i < charArr.length; i++){
            if(Arrays.asList(commentSymbolsArr).contains(charArr[i])){
                write = false;
            }else if(charArr[i] == '\\' && charArr[i+1] == 'n'){
                write = true;
            }
            if(write){
                result += charArr[i];
            }
        }
        return result;
    }

}
