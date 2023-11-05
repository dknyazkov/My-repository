package com.example.lesson53;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class SearchServiceTest {
    @Test
    public void testSearchIndex() {
        SearchService searchService = new SearchService();
        String first = new String("Hello");
        String second = new String("El");
        Integer integer = searchService.searchIndex(first, second);
        Assertions.assertEquals(1, integer);


    }
}
