/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uswa nasir
 */
public class Student_Manage {
    public String StdName;
    public String StdID;
    public String StdSession;
    public String StdPhno;
    
    public Student_Manage(String StdName, String StdID, String StdSession, String StdPhno){
        this.StdName = StdName;
        this.StdID = StdID;
        this.StdSession = StdSession;
        this.StdPhno = StdPhno;
    }
    
    public String getName(){
        return StdName;
    }
    
    public String getID(){
        return StdID;
    }
    
    public String getSession(){
        return StdSession;
    }
    
    public String getPhoneNo(){
        return StdPhno;
    }
}
