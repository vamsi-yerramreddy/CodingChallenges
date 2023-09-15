package org.example.Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Counter {
    public static void counter(File file, String option) {
        long lineCount = 0;
        long charCount=0;
        long wordCount = 0;

        String [] words =null;
        try (BufferedReader br = (file == null) ?
                new BufferedReader(new InputStreamReader(System.in))
                : new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                words = line.split("\\s+");
                charCount+=line.length();
                wordCount += words.length;

            }
        } catch (Exception e) {
            System.out.println("An Error occurred " + e.getMessage());
            System.exit(1);
        }
        if(option.equalsIgnoreCase("-l")){
            System.out.println("Number of lines in the file " + file.getName() + " are " + lineCount);
        }
        if(option.equalsIgnoreCase("-w")){
            System.out.println("Number of words in the file " + file.getName() + " are " + wordCount);
        }
        if(option.equalsIgnoreCase("-m")){
            System.out.println("Number of characters in the file " + file.getName() + " are " + charCount);
        }
        if(option.equalsIgnoreCase("all")){
            System.out.println("Number of lines in the file " + file.getName() + " are " + lineCount);
            System.out.println("Number of words in the file " + file.getName() + " are " + wordCount);
            System.out.println("Number of characters in the file " + file.getName() + " are " + charCount);
        }
    }
}