/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uswa nasir
 */
public class MarkSheet {
    
    public String Code;
    public String ProjectTitle;
    public String Marks;
    public String Deadlines;
    
    public MarkSheet(String Code, String ProjectTitle, String Marks, String Deadlines){
        this.Code = Code;
        this.ProjectTitle = ProjectTitle;
        this.Marks = Marks;
        this.Deadlines = Deadlines;
    }
    
    public String getCode(){
        return Code;
    }
    
    public String getDeadlines(){
        return Deadlines;
    }
    
    public String getProjectTitle(){
        return ProjectTitle;
    }
    
      public String getMarks(){
        return Marks;
    }
}
