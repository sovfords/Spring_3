package com.example.Spring_3;

import com.example.Spring_3.Calc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcService
{


    CalcService()
    {
        System.out.println("CalcService created");
    }

    public int sum(int firstNum, int secondNum)
    {
        return firstNum + secondNum;
    }

    public int sub(int firstNum, int secondNum)
    {
        return firstNum - secondNum;
    }

    public int multiply(int firstNum, int secondNum)
    {
        return firstNum * secondNum;
    }

    public int dev(int firstNum, int secondNum)
    {
        return firstNum / secondNum;
    }
}
