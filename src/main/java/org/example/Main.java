package org.example;
/*
A command line tool written in Java to mimic the functionality of the Unix command "wc".

Author: Vamsi Reddy Y
 */



import org.example.Utils.Delegator;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        boolean isInputFromStandardInput = false;
        /*File reader and writer
        * */
        BufferedReader br;
        String option = "all";
        String fileName = "";
        if(args.length==1){
            fileName= args[0];
            if(!checkFile(fileName)){
                Usage();
                System.exit(1);
            }
        }
        if (args.length == 0 || args[0].equalsIgnoreCase("-")) {
            isInputFromStandardInput = true;
            br = new BufferedReader(new InputStreamReader(System.in));
            File tempFile = new File("temp.txt");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line);
                    bw.newLine();
                }
            } catch (Exception e) {
                System.out.println("An Error occurred " + e.getMessage());
                System.exit(1);
            }
            Delegator.delegate("all", tempFile);

        }else if(args.length==1 && !args[0].equalsIgnoreCase("-")){
            fileName= args[0];
            System.out.println("Command line arguments passed are " + args[0]);
            if(!checkFile(fileName)){
                Usage();
                System.exit(1);
            }
            Delegator.delegate("all", new File(fileName));
        }
        else if (args.length == 2) {
            option = args[0];
            fileName = args[1];
            File file = new File(fileName);
            if (!checkFile(fileName)) {
                System.exit(1);
            }
        }
    }
    public static boolean checkFile(String fileName){
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Error : File does not exist");
            return false;
        }
        return true;
    }
    public static void Usage(){
        System.out.println("Usage : java -jar wc.jar [option] [file name]");
        System.out.println("Valid options are -c, -l, -w, -m, all" );
    }
}