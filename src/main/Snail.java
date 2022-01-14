import java.util.Arrays;

public class Snail {

    public static int[] snail(int[][] array) {
        if(array[0].length==0)
        {
            return new int[0];
        }

        int size = array.length;
        int[] intarr = new int[size*size];
        int schleifenDurchlauf = 0;

        int richtung = 0;
        // 0 rechts
        // 1 runter
        // 2 links
        // 3 oben

        for(int i = 0, x = 0, y = 0; i < intarr.length; i++){
            if(richtung == 0) {
                if(x<size-schleifenDurchlauf) {
                    intarr[i] = array[y][x++];
                }else{
                    richtung = 1;
                    x--;
                    y++;
                    intarr[i] = array[y++][x];

                }
            }
            else if(richtung == 1) {
                if(y<size-schleifenDurchlauf) {
                    intarr[i] = array[y++][x];
                }else{
                    richtung = 2;
                    y--;
                    x--;
                    intarr[i] = array[y][x--];
                }
            }
            else if(richtung == 2) {
                if(x>=schleifenDurchlauf) {
                    intarr[i] = array[y][x--];
                }else{
                    richtung = 3;
                    x++;
                    y--;
                    intarr[i] = array[y--][x];
                }
            }
            else if(richtung == 3) {
                if(y>=schleifenDurchlauf+1) {
                    intarr[i] = array[y--][x];
                }else{
                    richtung = 0;
                    schleifenDurchlauf++;
                    x++;
                    y++;
                    intarr[i] = array[y][x++];
                }
            }
            System.out.println(intarr[i]);
        }
        return intarr;
    }
}