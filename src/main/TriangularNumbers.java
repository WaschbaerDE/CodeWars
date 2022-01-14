public class TriangularNumbers
{
    public static int sumTriangularNumbers(int n)
    {
        if(n <= 0){
            return 0;
        }
        int returnint = 0;
        int currentint = 0;
        for(int i = 0, j = 1; i <n; i++){
            currentint = currentint +j++;
            returnint += currentint;
        }
        return returnint;
    }
}