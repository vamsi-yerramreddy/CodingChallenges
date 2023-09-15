package org.example.Utils;

import java.io.File;
import java.io.FileInputStream;

public   class byteReader {
    public static long countBytes(File file) {
        long bytes =0;
        try (FileInputStream fis = new FileInputStream(file)) {
            while (fis.read() != -1) {
                bytes++;
            }
        } catch (Exception e) {
            System.out.println("An Error occurred " + e.getMessage());
            System.exit(1);
        }
        return bytes;
    }
}

