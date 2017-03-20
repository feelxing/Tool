package com.feelxing.tool.pattern;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by MEV on 2017/3/20.
 */
public class Pattern_2 {
    public static void main(String[] args) {

        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Pattern time_pattern=Pattern.compile("\\b(^\\d{4}\\D+\\d{2}\\s\\d{2}\\D+[0-5])([0-9])\\D+\\d{2}$\\b");
        Pattern min_pattern=Pattern.compile("^[0-4]$");
        String time_str=sdf.format(date);
        Matcher matcher=time_pattern.matcher(time_str);
        String prefix=matcher.replaceAll("$1");
        String min_str=matcher.replaceAll("$2");
        matcher=min_pattern.matcher(min_str);
        if(matcher.matches()){
            time_str=prefix+"0:00";
        }else{
            time_str=prefix+"5:00";
        }
        System.out.println(time_str);
    }
}
