package com.company.assignment9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
    public boolean patternCheck(String input){
        String pattern = "[A-Z]";
        Pattern r = Pattern.compile("[A-Z].");
        Matcher m = r.matcher(input);
        if (m.find( )) {
           return true;
        }
        return false;
    }
}
