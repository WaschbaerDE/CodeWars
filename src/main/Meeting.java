import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
class Meeting {

    public static String meeting(String s) {
        List<String[]> list = new ArrayList<>();
        char[] chararr = s.toUpperCase().toCharArray();
        String vorname = "";
        String nachname = "";
        Boolean istNachname = Boolean.TRUE;
        String output = "";
        for(int i = 0; i < chararr.length; i++){
            if(chararr[i] == ':'){
                istNachname = Boolean.FALSE;
                vorname = "";

            }else if(chararr[i] == ';'){
                istNachname = Boolean.TRUE;
                list.add(new String[]{vorname,nachname});

                nachname = "";

            }else{
                if(istNachname == Boolean.TRUE){
                    nachname += chararr[i];
                }else if(istNachname == Boolean.FALSE){
                    vorname += chararr[i];
                }
            }

        }
        list.add(new String[]{vorname,nachname});

        Collections.sort(list);//https://www.happycoders.eu/de/algorithmen/sortieren-in-java/
        for(int i = 0; i < list.size(); i++){
            output += "(";
            output += list.get(i)[0];
            output += ", ";
            output += list.get(i)[1];
            output += ")";
        }
        return output;
    }
}
*/