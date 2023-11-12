package com.example.lesson53;

import org.springframework.stereotype.Service;

@Service
public class SearchService {

    public Integer searchIndex(String first, String second) {
        return first.toLowerCase().indexOf(second.toLowerCase());


    }
}
