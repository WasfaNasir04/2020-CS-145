
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uswa nasir
 */
public class Assigning_advisor {
    public String AdvisorName;
    public String Code;
    public Date DOB;
    public String ProjectTitle;
    
     public Assigning_advisor(String AdvisorName, String Code,Date DOB, String ProjectTitle){
        this.AdvisorName= AdvisorName;
        this.Code = Code;
        this.DOB = DOB;
        this.ProjectTitle = ProjectTitle;
     }
        
    public String getAdvisorName(){
        return AdvisorName;
    }
    
     public String getCode(){
        return Code;
    }
    
    public Date getDOB(){
        return DOB;
    }
    
    public String getProjectTitle(){
        return ProjectTitle;
    }
    
    }
    
