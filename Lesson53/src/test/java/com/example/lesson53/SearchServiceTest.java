package com.example.lesson53;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchServiceTest {
    private String first = new String("Hello");
    private SearchService searchService = new SearchService();
    private String second = new String();

    @Test
    public void testSearchIndex() {
        second = "el";
        Integer integer = searchService.searchIndex(first, second);
        Assertions.assertEquals(1, integer);
    }

    @Test
    public void testErrorString() {
        second = "Qw";
        Integer integer = searchService.searchIndex(first, second);
        Assertions.assertEquals(-1, integer);
    }

    @Test
    public void testIgnoreRegister() {
        second = "EL";
        Integer integer = searchService.searchIndex(first, second);
        Assertions.assertEquals(1, integer);
    }
}
