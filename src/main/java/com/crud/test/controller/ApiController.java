package com.crud.test.controller;

import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
public class ApiController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return "Hello World";
    }

    @RequestMapping(value = "reverse/{str}", method = RequestMethod.GET)
    public String reverse(@PathVariable String str) {
        StringBuilder a = new StringBuilder();
        a.append(str);
        a = a.reverse();
        return a.toString();
    }

    @RequestMapping(value = "calculater/{a}/{b}/{c}", method = RequestMethod.GET)
    public String calculater(@PathVariable Integer a, @PathVariable Integer b, @PathVariable Integer c) {
        if (c == 1) {
            Integer d = b + a;
            return "sum=" + d.toString();
        } else if (c == 2) {

            Integer d = b - a;
            return "sum=" + d.toString();
        } else if (c == 3) {
            Integer d = b * a;
            return "sum=" + d.toString();
        } else {
            Integer d = a / b;
            return "sum=" + d.toString();
        }

    }

    @RequestMapping(value = "plindrome/{str}", method = RequestMethod.GET)
    public String plindrome(@PathVariable String str) {
        StringBuilder a = new StringBuilder(str);
       // StringBuilder b = new StringBuilder();

       // a.append(str);
         a.reverse();

        String rev=a.toString();
       // return rev;
        if(str.equals(rev))
        return "Plindrome";
        else
            return "not a plindrome";
    }
    @RequestMapping(value = "sum/{num}", method = RequestMethod.GET)
    public Integer sum(@PathVariable Integer num) {
       int i=0;
        int b=0;
       for(i=1;i<=num;i++)
       {

                   b=i+b;
       }
            return b;
    }
    @RequestMapping(value = "lengthstring/{str}", method = RequestMethod.GET)
    public int lengthstring (@PathVariable String str) {
        int l=0;
        l=str.length();

        return l;



    }
    @RequestMapping(value = "lengtharr/arra[]}", method = RequestMethod.GET)
    public int lengtharr (@PathVariable int arra[]) {
        int l=0;
        for(l=0;l<10;l++)
        {

        }

        return l;



    }


    //@RequestMapping(value="num", method = RequestMethod.GET)
}

