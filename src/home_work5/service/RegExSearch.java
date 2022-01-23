package home_work5.service;

import home_work5.service.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    private boolean isCaseInsensitive;

    public RegExSearch() {
        isCaseInsensitive = false;
    }

    public RegExSearch(boolean isCaseInsensitive) {
        this.isCaseInsensitive = isCaseInsensitive;
    }

    @Override
    public long search(String text, String word) {
        Long count = 0L;
        Pattern p;
        if (isCaseInsensitive) {
             p = Pattern.compile("(\\p{Punct}+|\\s+)" + (word) + "(\\p{Punct}+|\\s+)",Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE);
        } else {
             p = Pattern.compile("(\\p{Punct}+|\\s+)" + (word) + "(\\p{Punct}+|\\s+)");
        }
        Matcher matcher = p.matcher(text);
       while (matcher.find()){
           count++;
                   }
        return count;
    }

}
