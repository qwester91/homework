package home_work5.service;

import home_work5.service.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngineCaseInsensitive implements ISearchEngine {
    private ISearchEngine engine;

    public SearchEngineCaseInsensitive(ISearchEngine engine) {
        this.engine = engine;
    }

    @Override
    public long search(String text, String word) {
        String newText;
        String newWord;

        if (engine instanceof EasySearch){
           newText =  text.toLowerCase();
            newWord = word.toLowerCase();
            return engine.search(newText,newWord);
        } else {
            RegExSearch search = new RegExSearch(true);
            return search.search(text,word);
        }
    }
}
