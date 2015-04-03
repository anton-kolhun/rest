package com.bean;


import com.adapter.CustomJson;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


import java.util.Date;

public class Person {
    private String name;
    private String surname;

    @JsonSerialize(using = CustomJson.Serializer.class)
    private Date customDate;


    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern= "yyyy-MM-dd\'T\'HH:mm:ssZZ",timezone="EST")
    private Date customDate2;

    public Person() {
    }

    public Person(String name, String surname, Date customDate, Date customDate2) {
        this.name = name;
        this.surname = surname;
        this.customDate = customDate;
        this.customDate2 = customDate2;
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

    public Date getCustomDate2() {
        return customDate2;
    }

    public void setCustomDate2(Date customDate2) {
        this.customDate2 = customDate2;
    }


}
