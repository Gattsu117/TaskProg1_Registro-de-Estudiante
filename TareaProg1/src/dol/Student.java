/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dol;

import java.io.Serializable;
import java.util.Date;
import misc.DateUtil;

/**
 *
 * @author Edward
 */
public class Student extends Person implements Serializable {
    private String NoIDStudent;
    private Date DateInput;
    public Date getDateInput() {
        return DateInput;
    }

    public void setDateInput(Date DateInput) {
        this.DateInput = DateInput;
    }

    
    public String getNoIDStudent() {
        return NoIDStudent;
    }
 
    public void setNoIDStudent(String NoIDStudent) {
        this.NoIDStudent = NoIDStudent;
    }
public int getDateInp() {
		return DateUtil.getAge(DateInput);
	}

    
   
    
}
