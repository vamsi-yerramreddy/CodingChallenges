package org.example.Utils;

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
                System.out.println("Invalid option");
                System.out.println("Valid options are -c, -l, -w, -m, all" );
                System.out.println("Usage : java -jar wc.jar [option] [file name]");
                System.exit(2);
        }
    }
}
