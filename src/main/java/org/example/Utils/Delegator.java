package org.example.Utils;

import org.example.Main;

import java.io.File;

public class Delegator {

    public static  void delegate(String option, File fileName){
        switch (option) {
            case "-c":
                option="-c";
                System.out.println("Number of bytes in the file " + fileName + " are " + byteReader.countBytes(fileName));
                break;
            case "-l":
                option="-l";
                Counter.counter(fileName, option);
                break;
            case "-w":
                option="-w";
                Counter.counter(fileName, option);
                break;
            case "-m":
                option="-m";
                Counter.counter(fileName, option);
                break;
            case "all":
                option="all";
                Counter.counter(fileName, option);
                break;
            default:
                Main.Usage();
                System.exit(2);
        }
    }
}
