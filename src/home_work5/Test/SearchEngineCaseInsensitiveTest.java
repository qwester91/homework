package home_work5.Test;

import home_work5.service.EasySearch;
import home_work5.service.RegExSearch;
import home_work5.service.SearchEngineCaseInsensitive;
import home_work5.service.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEngineCaseInsensitiveTest{
    private SearchEngineCaseInsensitive regExSearch = new SearchEngineCaseInsensitive( new RegExSearch());
    private SearchEngineCaseInsensitive easySearch = new SearchEngineCaseInsensitive( new EasySearch());

    @Test
    void easySearch(){
        String test = "Волшебник вол-шебник волШебник волшебник, волшебникволшебник волшебник! волшебник;волшебник";
        Assertions.assertEquals(6, easySearch.search(test, "волшебник"));
    }

    @Test
    void regExSearch(){
        String test = "Волшебник вол-шебник волШебник волшебник, волшебникволшебник волшебник! волшебник;волшебник";
        Assertions.assertEquals(6, regExSearch.search(test, "волшебник"));
    }
}
