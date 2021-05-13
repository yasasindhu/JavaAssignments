package com.company.assignment2;
import java.lang.String;
public class Pangram {
    public boolean pangramCheck(String inputString){
        //This array is used to mark character
        boolean[] checkArray=new boolean[26];
        for(int index=0;index<inputString.length();index++){
            char element=inputString.charAt(index);
            if(element>='A' && element<='Z')
                checkArray[element-'A']=true;
            else if(element>='a' && element<='z')
                checkArray[element-'a']=true;
        }
        for(int index=0;index<26;index++){
            if(checkArray[index]==false)
                return false;
        }

        return true;
    }
}
//Time Complexity:O(N) here N is length of the inputString
//Space Complexity:O(26) as it is constant so we can say as O(1)