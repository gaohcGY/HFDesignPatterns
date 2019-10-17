package com.design.patterns.chapter3.input;

import com.design.patterns.chapter3.input.lower.LowerCaseInputStream;

import java.io.*;
import java.lang.reflect.Field;

public class InputTest {
    public static void main(String[] args) {
        File file1 = new File("src/com/design/patterns/chapter3/input/test.txt");
        int c;
        try {
            InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(new File(file1.getAbsolutePath()))));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char)c);
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
