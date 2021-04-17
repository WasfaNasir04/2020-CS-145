
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
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

    Assigning_advisor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    public String getAdvisorName(){
        return AdvisorName;
    }
    
     public String getCode(){
        return Code;
    }
    
    public String getDOB(){
        return DOB.toString();
    }
    
    public String getProjectTitle(){
        return ProjectTitle;
    }
    
    }
    
