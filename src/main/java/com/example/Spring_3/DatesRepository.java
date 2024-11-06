package com.example.Spring_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Repository
public class DatesRepository
{

    private HashMap<String,String> dates;

    public DatesRepository() {
        dates = new HashMap<>();
        System.out.println("DatesRepository created");
    }

    public HashMap<String,String> getDates() {
        return dates;
    }

    public void setDates(HashMap<String,String> dates) {
        this.dates = dates;
    }

    public String getDateById(String name)
    {
        return dates.get(name);
    }
}
