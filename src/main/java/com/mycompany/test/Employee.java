/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.Comparator;

/**
 *
 * @author rajeshadhikari
 */
public class Employee implements Comparable {
int EmpID;
String Ename;
double Sal;
int Age;
static int i;
public Employee() {
EmpID = i++;
Ename = "dont know";
Sal = 0.0;
Age = 0;
}
public Employee(String ename, double sal,int age) {
EmpID = i++;
Ename = ename;
Sal = sal;
Age = age;
}
@Override
public String toString() {
return "EmpID " + EmpID + "\n" + "Ename " + Ename + "\n" + "Sal " + Sal+ "\n" + "Age " + Age;
}
@Override
public int compareTo(Object o1) {
if (this.Sal == ((Employee) o1).Sal)
return 0;
else if ((this.Sal) > ((Employee) o1).Sal)
return 1;
else
return -1;
}

static class AgeComparator implements Comparator
{
@Override
public int compare(Object o1, Object o2)
{
Employee p1 = (Employee)o1;
Employee p2 = (Employee)o2;
if(p1.Sal==0 && p2.Sal==0 )
return p1.Age - p2.Age;
else
return (int)(p1.Age -
p2.Age);
}
}

//static class WordComparator implements Comparator
//{
//public int compare(Object o1, Object o2)
//{
//if (((Employee) o1).Sal == ((Employee) o2).Sal)
//return 0;
//else if ((((Employee) o1).Sal) > ((Employee) o2).Sal)
//return 1;
//else
//return -1;
//}
//}

}

