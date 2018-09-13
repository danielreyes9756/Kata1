/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    private final String name;
    private final Date birthdate;
    
    public Person(String name,Date birthdate) {
        this.name = name;
        this.birthdate = birthdate; 
    }
    
    public int getAge(Date a) {
        return(int)((a.getTime()- birthdate.getTime())/31536000000L);
    }
    
    public String getName(){
        return name;
    }
    
    public Date getBirthdate(){
        return birthdate;
    }
    
}
