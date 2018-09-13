/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    private final String name;
    private final Calendar birthdate;
    private final long MILLISECONDS_PER_YEAR = 31536000000L;

    public Person(String name,Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate; 
    }
    
    public int getAge(GregorianCalendar a) {
        return(int)(milliSecondsToYear(a.getTimeInMillis()-this.birthdate.getTimeInMillis()));
    }
    private long milliSecondsToYear(long milles) {
        return milles/MILLISECONDS_PER_YEAR;
    }
    
    public String getName(){
        return name;
    }
    
    public Calendar getBirthdate(){
        return birthdate;
    }
    
}
