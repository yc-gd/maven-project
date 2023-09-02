package org.example;

import javafx.util.Pair;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.util.*;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime now1 = ZonedDateTime.now(ZoneId.of("GMT+07:00"));
        System.out.println(now);
        System.out.println(now1);
        //first
        //second
        //third



        



        long l = now.toInstant().toEpochMilli();
        System.out.println(l);
        System.out.println(now1.toLocalDateTime());
        

    }
}
