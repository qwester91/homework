package home_work5.service;

import home_work5.service.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        Long count = 0L;
        Pattern p = Pattern.compile("(\\p{Punct}+|\\s+)" + (word) + "(\\p{Punct}+|\\s+)",Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(text);
       while (matcher.find()){
           count++;
                   }
        return count;
    }
}
