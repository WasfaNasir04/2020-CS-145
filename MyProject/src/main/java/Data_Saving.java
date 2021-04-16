
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
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
    
    public Data_Saving(){
        Students = new ArrayList<Student_Manage>();
        Advisors = new ArrayList<Advisor_Manage>();
        Projects = new ArrayList<Project_Manage>();
    }
    
    public void saveStudents(String filename)
    {
        try {
            FileWriter fw = new FileWriter(filename);
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
            FileReader fr = new FileReader(filename);
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
            FileWriter fw = new FileWriter(filename);
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
            FileReader fr = new FileReader(filename);
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
            FileWriter fw = new FileWriter(filename);
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
            FileReader fr = new FileReader(filename);
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

    
}
