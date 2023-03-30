/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentreport;

import java.util.ArrayList;

public class DataStore {

    public static ArrayList<Assistant> assistants = new ArrayList<>();
    public static ArrayList<Student> students = new ArrayList<>();

    public static void updateRollNoAfterDeleteStd() {
        for (int i = 0; i < students.size(); ++i) {
            students.get(i).rollNo = --students.get(i).rollNo;
        }
    }

}
