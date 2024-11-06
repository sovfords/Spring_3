package com.example.Spring_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/datesNote")
public class DatesNoteController
{
    @Autowired
    DatesNoteService datesNoteService;
    public DatesNoteController()
    {
        System.out.println("DatesNoteController created");
    }

    @GetMapping("/get/all")
    public HashMap<String,String> getDates()
    {
       return datesNoteService.getDates();
    }

    @GetMapping("/get/{name}")
    @ResponseBody
    public String getDateByName(@PathVariable String name)
    {
        return datesNoteService.getDateByName(name);
    }

    @PostMapping("/add")
    public void addDate(@RequestBody String name)
    {
        datesNoteService.addDate(name);
    }
}
