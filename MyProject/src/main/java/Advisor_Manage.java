/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uswa nasir
 */
public class Advisor_Manage {
    public String AdvisorName;
    public String AdvisorID;
    public String SubjectExpert;
    
    public Advisor_Manage(String AdvisorName, String AdvisorID,String SubjectExpert)
    {
        this.AdvisorName = AdvisorName;
        this.AdvisorID = AdvisorID;
        this.SubjectExpert = SubjectExpert;
    }
    
    public String getName(){
        return AdvisorName;
    }
    
    public String getID(){
        return AdvisorID;
    }
    
    public String getSubjectExpert(){
        return SubjectExpert;
    }
    
}
