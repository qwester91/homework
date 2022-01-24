package home_work5.service;

import home_work5.service.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    /**
     * Метод ищет слова в тексте
     * @param text строка, в которой будем искать
     * @param word строка, которую будем искать
     * @return возвращает количество найденных совпадений (Long)
     */
    @Override
    public long search(String text, String word) {

        char[] arr = new char[]{' ',',','.','!','"','?',':',';','(',')','\\','\n','\r','\t','\f'};
        Long count = 0L;
        int index = 0;
        while (text.indexOf(word, index)>=0){
            if (text.indexOf(word, index) >= index) {
                for (char c : arr) {
                    if ((text.indexOf(word, index) == 0) || (text.charAt(text.indexOf(word, index) - 1) == c)) {
                        for (char c1 : arr) {
                            if((((text.indexOf(word,index)+ word.length())) == text.length())||(text.charAt(text.indexOf(word,index)+ word.length())) == c1){
                                count++;
                                break;

                            }
                        }
                        break;
                    }
                }
            }
            index = text.indexOf(word, index)+word.length();
        }
        return count;
    }
}
