package org.example.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;


public enum TypeOfUser {
    USER,
    ADMIN,
    SUPPORT;

}
