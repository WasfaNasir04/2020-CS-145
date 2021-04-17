/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uswa nasir
 */
public class Evaluations_details {
    public String Grades;
    public String ProjectTitle;
    public String Code;
    public String Deadlines;
    public String AdvisorName;
    public String Rubrics;
    
    public Evaluations_details(String Grades, String ProjectTitle,String Code,String Deadlines,String AdvisorName, String Rubrics){
     
        this.Grades = Grades;
        this.ProjectTitle = ProjectTitle;
        this.Code = Code;
        this.Deadlines =Deadlines;
        this.AdvisorName = AdvisorName;
        this.Rubrics = Rubrics;
    }
    
     public String getGrades(){
        return Grades;
    }
    
    public String getProjectTitle(){
        return ProjectTitle;
    }
    
    public String getCode(){
        return Code;
    }
    
    public String getDeadlines(){
        return Deadlines;
    }
    
    public String getAdvisorName(){
        return AdvisorName;
    }
    
      public String getRubrics(){
        return Rubrics;
    }

}
