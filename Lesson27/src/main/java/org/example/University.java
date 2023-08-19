package org.example;

import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;


@NoArgsConstructor
@Embeddable
public class University {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }
}
