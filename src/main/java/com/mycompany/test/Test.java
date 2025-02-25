/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import com.mycompany.test.Employee.AgeComparator;
import com.mycompany.test.Employee.WordComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rajeshadhikari
 */
public class Test {

    public static void main(String[] args) {

        List ts1 = new ArrayList();
ts1.add(new Employee ("Tom",40000.00,2));
ts1.add(new Employee ("Harry",20000.00,5));
ts1.add(new Employee ("Maggie",50000.00,1));
ts1.add(new Employee ("Chris",70000.00,3));
Collections.sort(ts1);
Iterator itr = ts1.iterator();
while(itr.hasNext()){
Object element = itr.next();
System.out.println(element + "\n");

}

Collections.sort(ts1,new WordComparator());
Iterator itr1 = ts1.iterator();
while(itr1.hasNext()){
Object element = itr1.next();
System.out.println(element + "\n");

}
        
//Students students =new Students("Rajesh","BNP 15");
//students.printString();
//System.out.print("\n \n");
//Students students1 =new Students();
//students1.printString();
//System.out.print("\n \n");
//Students students2 =new Students("Adhikari","BNP 16");
//students2.printString();
//ArrayList<Students> allStudents = new ArrayList();
//allStudents.add(students);
//allStudents.add(students1);
//allStudents.add(students2);

//for (Students s : allStudents) {
//s.printString();
//System.out.print("\n \n");
//    }
//
//allStudents.addAll(allStudents);
//allStudents.remove(1);
//allStudents.remove(students1);
//
//int secondStudentId = allStudents.get(1).stuId;
//String secondStudentName = allStudents.get(1).studentName;
//String secondStudentAddress = allStudents.get(1).studentAddress;


//                    System.out.println("Rajesh \nAdhikari");
//                    System.out.println("Rajesh \tAdhikari");
//                    System.out.println("Rajesh \"Adhikari");
//                    System.out.println("Rajesh \'Adhikari");
//                    System.out.println("Rajesh \u2122Adhikari");       
//                    arraylistExample();
//        Scanner kb = new Scanner(System.in);
//        System.out.println("enter a number ");
//        int number = kb.nextInt();
//        int count = 1;
//        
//        while(count<11){
//                    System.out.println(number*count);
//                    count++;
//        }
        
        
        
//        String ageGroup = getAgeGroup(number);
//        switch(ageGroup) {
//            case "child":
//System.out.println("you are a child");
//break;
//case "teen":
//System.out.println("you are a teen ager");
//break;
//case "adult":
//System.out.println("you are a adult");
//break;
//default:
//System.out.println("you are old");





}
        
        
////                System.out.println("number is: "+number);
//                
//             String result =   findOddOrEven(number);
//             System.out.println("number is: "+result);

//         float result  = addTwoNumbers(5.5f,2.3f);
//                        System.out.println(result);
//                        
//                        name = "rajesht";
//                        address = "BNP-15";
//                        if((name=="rajesh" || address=="BNP-15")&& b=="Yahoo: ") {
//                                                    System.out.println("this is me");
//                        }else{
//                         System.out.println("this is not me");
//
//                        }

//        doMath();
//        getIntrestAmount(50000,2,2.5f);
//    }

    private static void doMath() {
                System.out.println((12+4)/2);
    }

    private static float addTwoNumbers(float firstNumber, float secondNumber) {
//                System.out.println(firstNumber + secondNumber);
        return firstNumber + secondNumber;
    }
    
     private static void getIntrestAmount(int principleAmount, int years,float intrestRate) {
                System.out.println((principleAmount*(intrestRate/100))*years);
    }

    private static String findOddOrEven(int number) {
        if(number % 2==0){
        return "even";
        }else{
        return "odd";
        }
    }

    private static String getAgeGroup(int number) {
        if(number<13){
            return "child";
        }
       else if(number>=13 && number<20){
            return "teen";
        }
       else if(number>=20 && number<60){
            return "adult";
        }
        else{
         return "old";

        }
    }

    private static void arraylistExample() { 
ArrayList<String> al = new ArrayList();
System.out.print("Initial size of al : " + al.size());
System.out.print("\n");
al.add("C");
al.add("A");
al.add("E");
al.add("B");
al.add("D");
al.add("F");
//inserts "A2" into array at index 1
al.add(1,"A2");
System.out.print("size of al after " + al.size());
System.out.print("\n");
//display the array list
System.out.print("contents of al: " + al );
System.out.print("\n");
//Remove elements from the array list
al.remove("F");
al.remove(2);
System.out.print("size after deletions : " + al.size());
System.out.print("\n");
System.out.print("contents of al:" + al);
    Collections.sort(al);  // Sort cars
    System.out.print("contents of al:" + al);

Collections.sort(al, Collections.reverseOrder());
System.out.print("contents of al:" + al);

for (String i : al) {
      System.out.println(i);
    }

//al.clear();
    }
    
}
