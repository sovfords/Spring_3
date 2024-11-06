package com.example.Spring_3;

import org.springframework.stereotype.Component;

@Component
public class Calc
{
    private int firstNum;
    private int secondNum;

    Calc()
    {
        System.out.println("Calc created");
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }
}
