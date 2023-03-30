/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentreport;

public class Student {

    static int rollCnt;
    int rollNo;

    String name = "";
    String Factuly = "";
    String course = "";
    String id = "";
    String level = "";
    String classN = "";
    String labTime = "";

    public Student(String name, String Factuly, String course, String id, String level, String classN, String labTime) {
        this.rollNo = ++rollCnt;
        this.name = name;
        this.Factuly = Factuly;
        this.course = course;
        this.id = id;
        this.level = level;
        this.classN = classN;
        this.labTime = labTime;
    }
}