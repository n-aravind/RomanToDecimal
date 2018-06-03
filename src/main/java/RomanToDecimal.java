import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RomanToDecimal {

    private HashMap<String,Integer> romans = new HashMap<String, Integer>();

    public RomanToDecimal() {
        romans.put("I",1);
        romans.put("V",5);
        romans.put("X",10);
    }

    private List<String> subtractGroup = Arrays.asList("IV","IX");

    public int computeDecimalValue(String romanNumber) {
       int value = 0;
       for (int i = 0; i< romanNumber.length(); i++){
           String eachChar = getEachChar(romanNumber, i);
           value += getValueOfChar(eachChar);
       }

       for (String sub : subtractGroup){
           if (romanNumber.contains(sub)){
               String subChar = getEachChar(sub, 0);
               value -= 2* getValueOfChar(subChar);

           }
       }

      return value;
    }

    private Integer getValueOfChar(String eachChar) {
        return romans.get(eachChar);
    }

    private String getEachChar(String romanNumber, int i) {
        return Character.toString(romanNumber.charAt(i));
    }
}
