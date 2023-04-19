package com.alamin.oop_abstract;

import java.io.FileNotFoundException;

public class Root {
    public static void main(String[] args) throws FileNotFoundException {
        new NumberExtractorReport().prepareAndSendReport("D:\\Japan\\Java8StreamApi\\src\\main\\java\\com\\alamin\\oop_abstract\\data.txt");
        System.out.println();
        new EmailExtractorReport().prepareAndSendReport("D:\\Japan\\Java8StreamApi\\src\\main\\java\\com\\alamin\\oop_abstract\\data.txt");
    }
}
