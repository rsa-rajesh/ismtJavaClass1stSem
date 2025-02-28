/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rajeshadhikari
 */
// Ctrl+shift+F
public class FileExample {

    public void filesAndFoloder() {
//        /Users/rajeshadhikari/NetBeansProjects/test
        File f1 = new File("/Users/rajeshadhikari/NetBeansProjects/test/aa1.txt");
        File f2 = new File("/Users/rajeshadhikari/NetBeansProjects/test/aa2.txt");
        String s;
        System.out.println(f1.getAbsolutePath());

        if (f1.exists()) {
            if (f1.isFile()) {
                System.out.println("File Name is " + f1.getName());
                s = f1.getParent();
                File f3 = new File(s);
                f1.renameTo(new File("abc.txt"));
//                f2.delete();
                if (f3.isDirectory()) {
                    System.out.println(f3.getPath());
                }
            } else {
                System.out.println("Not a File");
            }
        } else {
            System.out.println("File not found");

        }

    }

    public void createAndWriteFile(String fileName, String text) {
        String s = text;
        byte b[] = s.getBytes();

        try {
            File myObj = new File(fileName + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        FileOutputStream f;
        try {
            f = new FileOutputStream(fileName + ".txt");

            int i = 0;
            while (i < b.length) {
                f.write(b[i]);
                i++;
            }

        } catch (IOException ex) {
            System.out.println("File not created");

        }

    }

    public void readFile(String fileName) {

        try {

            FileInputStream f = new FileInputStream(fileName + ".txt");
            int s = Math.toIntExact(f.getChannel().size());

            int b[] = new int[s];
            char c[] = new char[s];

            for (int i = 0; i < s; i++) {
                b[i] = f.read();
                c[i] = (char) b[i];
            }
            System.out.println("\nBytes of the file are :");
            for (int i = 0; i < s; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println("\n\nBytes as characters :");
            for (int i = 0; i < s; i++) {
                System.out.print(c[i]);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

}
