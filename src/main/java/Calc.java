import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;
import static java.lang.Integer.parseInt;

/**
 * Created by piotr_gy on 28.05.17.
 */
public class Calc {
    private String findSeparator(String input){

        if((input.split("\n")).length > 1)
            return "\n";
        else if ((input.split("\\$")).length > 1)
            return "\\$";
        else if ((input.split(" ")).length > 1)
            return " ";
        return null;
    }

    int add(String input){
        String[] inputParams = input.split(findSeparator(input));

        /*int param1 = parseInt(params[0]);
        int param2 = parseInt(params[1]);*/

        List <Integer> params = new ArrayList<Integer>();
        for(String in : inputParams){
            Integer param = parseInt(in);
            params.add(param);
        }
        if (inputParams >1000)
            input
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
