/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author rajeshadhikari
 */
public class RiddleFileReader {

    private Scanner fileScan; // For file input
    private Scanner kbScan; // For keyboard input

    public RiddleFileReader(String fName) {
        kbScan = new Scanner(System.in);
        try {
            File theFile = new File(fName);
            fileScan = new Scanner(theFile);
            fileScan = fileScan.useDelimiter("\n");
        } catch (IOException e) {
            e.printStackTrace();
        } // catch()
    } // RiddleFileReader() constructor

    public Riddle readRiddle() {
        String ques = null;
        String ans = null;
        Riddle theRiddle = null;
        if (fileScan.hasNext()) {
            ques = fileScan.next();
        }
        if (fileScan.hasNext()) {
            ans = fileScan.next();
            theRiddle = new Riddle(ques, ans);
        } // if
        return theRiddle;
    } // readRiddle()

    public void displayRiddle(Riddle aRiddle) {
        System.out.println(aRiddle.getQuestion());
        System.out.print("Input any letter to see answer:");
        String str = kbScan.next(); // Ignore KB input
        System.out.println(aRiddle.getAnswer());
        System.out.println();
    } // displayRiddle()

}
