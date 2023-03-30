/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentreport;

public class Assistant {

    static int idCnt;
    int id;
    String name = "";
    String password = "";
    String email = "";
    String contactNo = "";

    public Assistant(String name, String password, String email, String contactNo) {
        this.id = ++idCnt;
        this.name = name;
        this.password = password;
        this.email = email;
        this.contactNo = contactNo;
    }

}

