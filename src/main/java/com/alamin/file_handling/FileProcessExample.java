package com.alamin.file_handling;

import java.io.File;
import java.io.IOException;

public class FileProcessExample {
    private static final String FILE_PATH = "D:/Japan/Java8StreamApi/src/main/java/com/alamin/file_handling/alamin.txt";
    private static final String FILE_RELATIVE_PATH = "src/main/java/com/alamin/file_handling/alamin.txt";
    private static final String DIRECTORY_RELATIVE_PATH = "src/main/java/com/alamin/file_handling";
    private static final String CREATE_FILE = "src/main/java/com/alamin/file_handling/p.pdf";
    private static final String CREATE_DIRECTORY = "src/main/java/com/alamin/file_handling/java";
    private static final String FILE_PATH_NOT_EXIST = "D:/Japan/Java8StreamApi/src/main/java/com/alamin/file_handling/abc.txt";
    private static final String DIRECTORY_PATH = "D:/Japan/Java8StreamApi/src/main/java/com/alamin/file_handling";
    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        File relativePath = new File(FILE_RELATIVE_PATH);
        File notExitFilePath = new File(FILE_PATH_NOT_EXIST);
        File isDirectoryPath = new File(DIRECTORY_PATH);
        File createFile = new File(CREATE_FILE);
        File createDirectory = new File(CREATE_DIRECTORY);
        File directoryPath = new File(DIRECTORY_RELATIVE_PATH);
        System.out.println("File exists: "+file.exists());
        System.out.println("File is not exist: "+notExitFilePath.exists());
        System.out.println("File is parent: "+relativePath.getParent());
        System.out.println("File is AbsolutePath: "+file.getAbsolutePath());
        System.out.println("File is AbsoluteFile: "+file.getAbsoluteFile());
        String absolutePath = file.getAbsolutePath();
        File absoluteFile = file.getAbsoluteFile();
        System.out.println("""
                String absolutePath = file.getAbsolutePath();
                File absoluteFile = file.getAbsoluteFile();
                """);
        System.out.println("AbsolutePath is return to String path \nvs\nAbsoluteFile is return to File");
        System.out.println("File exists: "+file.isFile());
        System.out.println("File dose not exist: "+notExitFilePath.isFile());
        System.out.println("It is directory path: "+file.isDirectory());
        System.out.println("It is directory path: "+isDirectoryPath.isDirectory());
//        try {
//            createFile.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        createDirectory.mkdir();
        String[] list = directoryPath.list();
        for(String myFile : list){
            System.out.println(myFile);
        }
//        boolean delete = file.delete(); // delete function is directory or file
        System.out.println("**************");
        System.out.println(createFile.canRead());
        System.out.println(createFile.canWrite());

    }
}
