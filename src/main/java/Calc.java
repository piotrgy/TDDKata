import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;
import static java.lang.Integer.parseInt;

/**
 * Created by piotr_gy on 28.05.17.
 */
public class Calc {
    private String findSeparator(String input){

        List<Character> tempString = new ArrayList<>();
        char[] tempChar = input.toCharArray();
        for (char oneChar : tempChar){
            if (oneChar<'0'||oneChar>'9')
                tempString.add(oneChar);
        }

        String outString = tempString.stream().map(e->e.toString()).collect(Collectors.joining());

        return outString;

        //Poprzednio
        /*if((input.split("\n")).length > 1)
            return "\n";
        else if ((input.split("\\$")).length > 1)
            return "\\$";
        else if ((input.split(" ")).length > 1)
            return " ";*/
    }

    int add(String input){
        String[] inputParams = input.split(findSeparator(input));

        /*int param1 = parseInt(params[0]);
        int param2 = parseInt(params[1]);*/

        List <Integer> params = new ArrayList<Integer>();
        for(String in : inputParams){
            Integer param = parseInt(in);
            if (param >1000){
                param = 0;
                System.out.println("Liczba większa od 1000");
            }
            params.add(param);

        }
        int result = 0;
        for(Integer param : params){
            result = result+param;
        }
        if (result <0)
            throw new IllegalArgumentException("nie możemy przekraczać 0 , kolego!");

        //int result = param1 + param2;

        return result;

        }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String");
        String s = input.readLine();
    }
}
