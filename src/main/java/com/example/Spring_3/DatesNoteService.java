package com.example.Spring_3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Service
public class DatesNoteService
{

    DatesRepository datesRepository;

    DatesNoteService()
    {
        datesRepository = new DatesRepository();
        System.out.println("DatesNoteService created");
    }

    public HashMap<String,String> getDates()
    {
        return datesRepository.getDates();
    }

    public String getDateByName(String name)
    {
       return datesRepository.getDateById(name);
    }

    public void addDate(String name)
    {
        HashMap<String,String> dateHashMap = this.getDates();
        Date date = new Date();
        dateHashMap.put(name,date.toString());
        datesRepository.setDates(dateHashMap);

        System.out.println(name + " " + datesRepository.getDateById(name));

    }

}
