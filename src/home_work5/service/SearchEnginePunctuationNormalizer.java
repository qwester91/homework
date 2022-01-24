package home_work5.service;

import home_work5.service.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine engine;

    public SearchEnginePunctuationNormalizer(ISearchEngine engine) {
        this.engine = engine;
    }

    @Override
    public long search(String text, String word) {
        String newText = punctuationNormalizer(text);
        return engine.search(newText, word);
    }


    private String punctuationNormalizer (String text){
        Pattern p = Pattern.compile("\\p{Punct}+|\\s+");
        Matcher m = p.matcher(text);
        String newText  = m.replaceAll(" ");
        return newText;

    }
}
