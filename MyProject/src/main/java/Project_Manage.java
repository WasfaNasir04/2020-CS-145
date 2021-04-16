/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uswa nasir
 */
public class Project_Manage {
    public String Title;
    public String Type;
    public String Description;

    public Project_Manage(String Title, String Type, String Description) {
        this.Title= Title;
        this.Type=Type;
        this.Description=Description;
    }
    
    public String getTitle() {
        return Title;
    }

    public String getType() {
        return Type;
    }

    public String getDescription() {
        return Description;
    }
    
}
