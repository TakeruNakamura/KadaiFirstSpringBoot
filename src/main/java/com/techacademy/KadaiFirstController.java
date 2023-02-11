package com.techacademy;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {


    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {
        String s = val1.substring(0, 4);
        String t = val1.substring(4, 6);
        String r = val1.substring(6, 8);

        int year = Integer.parseInt(s);
        int month = Integer.parseInt(t);
        int day = Integer.parseInt(r);

        LocalDate date = LocalDate.of(year, month, day);
        String week = date.getDayOfWeek().toString();

        return week;

    }

    @GetMapping("/plus/{val1}/{val2}")
        public String calcPlus(@PathVariable String val1, @PathVariable String val2) {
            String str = "";
            str = val1 + val2;
            return str;
        }

    @GetMapping("/minus/{num1}/{num2}")
    public int calcMinus(@PathVariable int num1, @PathVariable int num2) {
        int num = 0;
        num = num1 - num2;
        return num;
    }

    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int num = 0;
        num = val1 * val2;
        return num;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int num = 0;
        num = val1 / val2;
        return num;
    }

}
