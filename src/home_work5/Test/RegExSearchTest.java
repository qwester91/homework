package home_work5.Test;

import home_work5.service.EasySearch;
import home_work5.service.RegExSearch;
import home_work5.service.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearchTest  {
    private RegExSearch regExSearch = new RegExSearch();

    @Test
    void easySearch(){
        String test = "Волшебник вол-шебник волШебник волшебник, волшебникволшебник волшебник! волшебник;волшебник";
        Assertions.assertEquals(4, regExSearch.search(test, "волшебник"));
    }
}
