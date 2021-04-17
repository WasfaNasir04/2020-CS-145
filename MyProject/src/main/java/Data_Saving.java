
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uswa nasir
 */
public class Data_Saving {
    
    public ArrayList<Student_Manage> Students;
    public ArrayList<Advisor_Manage> Advisors;
    public ArrayList<Project_Manage> Projects;
    public ArrayList<Selection_Project>Project_Selection;
    public ArrayList<Assigning_advisor>assign;
    public ArrayList<Evaluations_details>Evaluate;
    public ArrayList<MarkSheet>marksheet;
    
    public Data_Saving(){
        Students = new ArrayList<Student_Manage>();
        Advisors = new ArrayList<Advisor_Manage>();
        Projects = new ArrayList<Project_Manage>();
        Project_Selection = new ArrayList<Selection_Project>();
        assign = new ArrayList<Assigning_advisor>();
        Evaluate = new ArrayList<Evaluations_details>();
        marksheet = new ArrayList<MarkSheet>();
    }
    
    public void saveStudents(String filename)
    {
        try {
            FileWriter fw = new FileWriter("Student.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Student ID, Student Name, Student Session, Student Ph.No\n");
            
            for(int i = 0 ; i < Students.size();i++)
            {
                bw.write(Students.get(i).getID() + ", "+
                        Students.get(i).getName() + ","+
                        Students.get(i).getSession()+","+
                        Students.get(i).getPhoneNo()+","+"\n"
                         // Students.get(i).getSavedOn().toString()+"\n"
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(Student_Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void loadStudents(String filename)
    {
        try {
            FileReader fr = new FileReader("Student.txt");
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               /*Student S = new Student();
               String[] toks = line.split(",");
               
               S.setID(toks[0]);
               S.setName(toks[1]);
               S.setSession(toks[1]);
               S.setContactNumber(toks[2]);*/
              String[] Token = line.split(",");
              Student_Manage S = new Student_Manage(Token[0],Token[1],Token[2],Token[3]);
              
               
                 /* SimpleDateFormat formatter5=new SimpleDateFormat("E MMM dd HH:mm:ss yyyy");  
                 Date d =  formatter5.parse(toks[3].replace(" PKT", ""));
               c.setDob(d);
                   Date d1=formatter5.parse(toks[4].replace(" PKT", ""));  
               c.setSavedOn(d1);
               PhoneBook.getIsntance().addContact(c);*/
               
          }
                    
            br.close();
            fr.close();
        } catch (Exception ex) {
            Logger.getLogger(Student_Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void saveAdvisors(String filename)
    {
        try {
            FileWriter fw = new FileWriter("Advisor.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Advisor Name, Advisor ID, Subject Expert\n");
            
            for(int i = 0 ; i < Advisors.size();i++)
            {
                bw.write(Advisors.get(i).getID() + ", "+
                        Advisors.get(i).getName() + ","+
                        Advisors.get(i).getSubjectExpert()+","+"\n"
                         // Students.get(i).getSavedOn().toString()+"\n"
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(Advisor_Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public void loadAdvisors(String filename)
    {
        try {
            FileReader fr = new FileReader("Advisor.txt");
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               /*Student S = new Student();
               String[] toks = line.split(",");
               
               S.setID(toks[0]);
               S.setName(toks[1]);
               S.setSession(toks[1]);
               S.setContactNumber(toks[2]);*/
              String[] Token = line.split(",");
              Advisor_Manage A = new Advisor_Manage(Token[0],Token[1],Token[2]);
              
               
                 /* SimpleDateFormat formatter5=new SimpleDateFormat("E MMM dd HH:mm:ss yyyy");  
                 Date d =  formatter5.parse(toks[3].replace(" PKT", ""));
               c.setDob(d);
                   Date d1=formatter5.parse(toks[4].replace(" PKT", ""));  
               c.setSavedOn(d1);
               PhoneBook.getIsntance().addContact(c);*/
               
          }
                    
            br.close();
            fr.close();
        } catch (Exception ex) {
            Logger.getLogger(Advisor_Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
     
     public void saveProjects(String filename)
    {
        try {
            FileWriter fw = new FileWriter("Projects.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Project Title, Project Type, Project Description,\n");
            
            for(int i = 0 ; i < Projects.size();i++)
            {
                bw.write(Projects.get(i).getTitle() + ", "+
                        Projects.get(i).getType() + ","+
                        Projects.get(i).getDescription()+","+"\n"
                         // Students.get(i).getSavedOn().toString()+"\n"
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(Project_Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void loadProjects(String filename)
    {
        try {
            FileReader fr = new FileReader("Projects.txt");
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               /*Student S = new Student();
               String[] toks = line.split(",");
               
               S.setID(toks[0]);
               S.setName(toks[1]);
               S.setSession(toks[1]);
               S.setContactNumber(toks[2]);*/
              String[] Token = line.split(",");
              Project_Manage P = new Project_Manage(Token[0],Token[1],Token[2]);
              
               
                 /* SimpleDateFormat formatter5=new SimpleDateFormat("E MMM dd HH:mm:ss yyyy");  
                 Date d =  formatter5.parse(toks[3].replace(" PKT", ""));
               c.setDob(d);
                   Date d1=formatter5.parse(toks[4].replace(" PKT", ""));  
               c.setSavedOn(d1);
               PhoneBook.getIsntance().addContact(c);*/
               
          }
                    
            br.close();
            fr.close();
        } catch (Exception ex) {
            Logger.getLogger(Project_Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void saveSelectedProjects(String filename)
    {
        try {
            FileWriter fw = new FileWriter("SelectedProjects.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Student Name, Member Name, Group Code, Project Title\n");
            
            for(int i = 0 ; i < Project_Selection.size();i++)
            {
                bw.write(Project_Selection.get(i).getName() + ", "+
                        Project_Selection.get(i).getmemberName() + ","+
                        Project_Selection.get(i).getCode()+","+
                        Project_Selection.get(i).getProjectTitle()+","+"\n"
                         // Students.get(i).getSavedOn().toString()+"\n"
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(Selection_Project.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void loadSelectedProjects(String filename)
    {
        try {
            FileReader fr = new FileReader("SelectedProjects.txt");
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               /*Student S = new Student();
               String[] toks = line.split(",");
               
               S.setID(toks[0]);
               S.setName(toks[1]);
               S.setSession(toks[1]);
               S.setContactNumber(toks[2]);*/
              String[] Token = line.split(",");
              Selection_Project Sp = new Selection_Project(Token[0],Token[1],Token[2],Token[3]);
              
               
                 /* SimpleDateFormat formatter5=new SimpleDateFormat("E MMM dd HH:mm:ss yyyy");  
                 Date d =  formatter5.parse(toks[3].replace(" PKT", ""));
               c.setDob(d);
                   Date d1=formatter5.parse(toks[4].replace(" PKT", ""));  
               c.setSavedOn(d1);
               PhoneBook.getIsntance().addContact(c);*/
               
          }
                    
            br.close();
            fr.close();
        } catch (Exception ex) {
            Logger.getLogger(Selection_Project.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void saveAssignedAdvisors(String filename)
    {
        try {
            FileWriter fw = new FileWriter("AssignedAdvisors.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Advisor Name, Group Code,Due Date, Project Title\n");
            
            for(int i = 0 ; i < assign.size();i++)
            {
                bw.write(assign.get(i).getAdvisorName() + ", "+
                        assign.get(i).getCode() + ","+
                        assign.get(i).getDOB().toString()+","+
                        assign.get(i).getProjectTitle()+","+"\n"
                       
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(Assigning_advisor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void loadAssignedAdvisors(String filename)
    {
        try {
            FileReader fr = new FileReader("AssignedAdvisors.txt");
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               /*Student S = new Student();
               String[] toks = line.split(",");
               
               S.setID(toks[0]);
               S.setName(toks[1]);
               S.setSession(toks[1]);
               S.setContactNumber(toks[2]);*/
              
            String[] Token = line.split(",");
            SimpleDateFormat formatter5=new SimpleDateFormat("E MMM dd HH:mm:ss yyyy");
               
            Date d =  formatter5.parse(Token[2].replace(" PKT", ""));
            Assigning_advisor Sp = new Assigning_advisor(Token[0],Token[1],formatter5.parse(Token[2].replace(" PKT", "")),Token[3]);
              
                              
                 
              /* c.setDob(d);
                   Date d1=formatter5.parse(toks[4].replace(" PKT", ""));  
               c.setSavedOn(d1);
               PhoneBook.getIsntance().addContact(c);*/
               
          }
                    
            br.close();
            fr.close();
        } catch (Exception ex) {
            Logger.getLogger(Assigning_advisor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    
     public void saveEvaluations(String filename)
    {
        try {
            FileWriter fw = new FileWriter("Evaluations.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Grades, Project Title, Group Code,Deadlines,Advisor Name, Rubrics\n");
            
            for(int i = 0 ; i < Evaluate.size();i++)
            {
                bw.write(Evaluate.get(i).getGrades() + ", "+
                        Evaluate.get(i).getProjectTitle() + ","+
                        Evaluate.get(i).getCode()+","+
                        Evaluate.get(i).getDeadlines()+","+
                         Evaluate.get(i).getAdvisorName()+","+
                         Evaluate.get(i).getRubrics()+","+"\n"
                         // Students.get(i).getSavedOn().toString()+"\n"
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(Evaluations_details.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void loadEvaluations(String filename)
    {
        try {
            FileReader fr = new FileReader("Evaluations.txt");
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               /*Student S = new Student();
               String[] toks = line.split(",");
               
               S.setID(toks[0]);
               S.setName(toks[1]);
               S.setSession(toks[1]);
               S.setContactNumber(toks[2]);*/
              String[] Token = line.split(",");
              Evaluations_details E = new Evaluations_details(Token[0],Token[1],Token[2],Token[3],Token[4],Token[5]);
                
              
               
              /* SimpleDateFormat formatter5=new SimpleDateFormat("E MMM dd HH:mm:ss yyyy");  
                 Date d =  formatter5.parse(Token[2].replace(" PKT", ""));
               c.setDob(d);
                   Date d1=formatter5.parse(toks[4].replace(" PKT", ""));  
               c.setSavedOn(d1);
               PhoneBook.getIsntance().addContact(c);*/
               
          }
                    
            br.close();
            fr.close();
        } catch (Exception ex) {
            Logger.getLogger(Evaluations_details.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void saveMarksheet(String filename)
    {
        try {
            FileWriter fw = new FileWriter("Marksheet.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Group Code,Project Title, Marks,Deadlines\n");
            
            for(int i = 0 ; i < marksheet.size();i++)
            {
                bw.write(marksheet.get(i).getCode() + ", "+
                        marksheet.get(i).getProjectTitle() + ","+
                       marksheet.get(i).getMarks()+","+
                        marksheet.get(i).getDeadlines()+","+"\n"
                        
                         // Students.get(i).getSavedOn().toString()+"\n"
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(MarkSheet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void loadMarksheet(String filename)
    {
        try {
            FileReader fr = new FileReader("Marksheet.txt");
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               /*Student S = new Student();
               String[] toks = line.split(",");
               
               S.setID(toks[0]);
               S.setName(toks[1]);
               S.setSession(toks[1]);
               S.setContactNumber(toks[2]);*/
              String[] Token = line.split(",");
              MarkSheet M = new MarkSheet(Token[0],Token[1],Token[2],Token[3]);
                
              
               
              /* SimpleDateFormat formatter5=new SimpleDateFormat("E MMM dd HH:mm:ss yyyy");  
                 Date d =  formatter5.parse(Token[2].replace(" PKT", ""));
               c.setDob(d);
                   Date d1=formatter5.parse(toks[4].replace(" PKT", ""));  
               c.setSavedOn(d1);
               PhoneBook.getIsntance().addContact(c);*/
               
          }
                    
            br.close();
            fr.close();
        } catch (Exception ex) {
            Logger.getLogger(MarkSheet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
