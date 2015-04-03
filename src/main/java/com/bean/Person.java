package com.bean;


import com.adapter.CustomJson;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;

public class Person {
    private String name;
    private String surname;

    @JsonSerialize(using = CustomJson.Serializer.class)
    private Date customDate;

    public Person() {
    }

    public Person(String name, String surname, Date customDate) {
        this.name = name;
        this.surname = surname;
        this.customDate = customDate;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCustomDate() {
        return customDate;
    }

    public void setCustomDate(Date customDate) {
        this.customDate = customDate;
    }


}
