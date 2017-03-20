package com.feelxing.tool.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by MEV on 2017/3/20.
 */
public class Patter_1 {
    public static void main(String[] args) {

        //set fnl = ``

        String str = "path=2016-02-03&fnl=${fnl}&gfs=1 0 1 0&wgy=1";

        String regex = "(?<name>[\\w\\-]+)=(?<value>[\\w\\,\\s]*)";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        while(matcher.find()) {

            System.out.println(matcher.group("name"));

            System.out.println(matcher.group("value"));

            //matcher.group("value");
        }

    }
}
