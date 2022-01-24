package home_work5.Test;

import home_work5.service.EasySearch;
import home_work5.service.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EasySearchTest{

    private EasySearch easySearch = new EasySearch();

    @Test
    void easySearch(){
        String test = "Волшебник вол-шебник волШебник волшебник, волшебникволшебник волшебник! волшебник;волшебник";
        Assertions.assertEquals(4, easySearch.search(test, "волшебник"));
    }
}
