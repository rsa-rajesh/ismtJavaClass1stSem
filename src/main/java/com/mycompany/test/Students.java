/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author rajeshadhikari
 */
public class Students {
    int stuId;
String studentName;
String studentAddress;
static int i;

public Students() {
stuId = i++;
studentName = "dont know";
studentAddress ="dont know";
}

public Students(String name, String address) {
stuId = i++;
studentName = name;
studentAddress = address;
}

public String toString() {
return "Student Id:  " + stuId + "\n" + "Student Name: " + studentName + 
        "\n" + "Student Address:" + studentAddress;
}

public void printString() {
String a = "Student Id:  " + stuId + "\n" + "Student Name: " + studentName + 
        "\n" + "Student Address:" + studentAddress;
System.out.print(a);
}
}
