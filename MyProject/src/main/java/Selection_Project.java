/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uswa nasir
 */
public class Selection_Project {
    
    public String stdName;
    public String memberName;
    public String Code;
    public String ProjectTitle;
    
    public Selection_Project(String stdName, String memberName,String Code, String ProjectTitle){
        this.stdName= stdName;
        this.memberName = memberName;
        this.Code = Code;
        this.ProjectTitle = ProjectTitle;
    }
    
    public String getName(){
        return stdName;
    }
    
    public String getmemberName(){
        return memberName;
    }
    
    public String getCode(){
        return Code;
    }
    
    public String getProjectTitle(){
        return ProjectTitle;
    }
    
}
