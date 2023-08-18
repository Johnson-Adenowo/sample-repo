package org.interswitch;

public class LowerToUpper {
    public String responseInUpperCase(String word){
        if (word != null && word.isEmpty()){
            String[] words = word.split(" ");
            return words[0].toUpperCase();
        }
        throw new IllegalArgumentException("Word cannot be empty");
    }

    public String responseInLowerCase(String word){
        if (word != null && word.isEmpty()){
            String[] words = word.split(" ");
            return words[0].toLowerCase();
        }
        throw new IllegalArgumentException("Word cannot be empty");
    }
}


