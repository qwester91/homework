package home_work5.service;

import home_work5.service.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        boolean existWord = true;
        Long count = 0L;
        int index = 0;
        int lastindex = 0;
        while (existWord){
            existWord = false;
        if (text.indexOf(word, index) >= index) {
            index = text.indexOf(word, index)+1;
            existWord = true;
            count++;
        }


//        while (existWord){
//            existWord = false;
//            index = text.indexOf(word, index + 1);
//            if (index != lastindex){
//
//            }
        }
        return count;
    }
}
