package home_work5.service;

import home_work5.service.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    /**
     * метод ищет точное совпадение переданного слова с последовательностью символов в тексте,
     * это может быть как отдельное слово, так и часть его.
     * @param text строка, в которой будем искать
     * @param word строка, которую будем искать
     * @return возвращает количество найденных совпадений (Long)
     */
    @Override
    public long search(String text, String word) {
        boolean existWord = true;
        Long count = 0L;
        int index = 0;
        while (existWord){
            existWord = false;
            if (text.indexOf(word, index) >= index) {
                index = text.indexOf(word, index)+1;
                existWord = true;
                count++;
            }

        }
        return count;
    }
}
