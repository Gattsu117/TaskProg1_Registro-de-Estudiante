package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import dol.Person;
import dol.Student;
import java.util.Scanner;

public class PersonDal {
	private Person person;
        private Student student;
	private String filePath;
	private String fileName;
	public PersonDal() {
		super();
	}
        public Student getStudent() {
		return student;
	}
	public Person getPerson() {
		return person;
	}
        public void setStudent(Student student) {
		this.student = student;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void save() {
           
		if(fileName.trim().length()==0) {
			fileName = person.getFirstName().trim() + person.getSurName().trim() + ".dat";
		}
		
		File file = new File(filePath + "\\" + fileName);
                    System.out.println("El valor de file es " + file);
        ObjectOutputStream w;
		try {
			w = new ObjectOutputStream(new FileOutputStream(file));
	        w.writeObject(getPerson());
	        w.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
	
	public Person open() {
        try{
        	File file = new File(filePath);
            ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
            return (Person)ois.readObject();
        }
        catch(FileNotFoundException e){
        	e.printStackTrace();
        } catch (IOException | ClassNotFoundException ex) {
        	ex.printStackTrace();
        }
        return null;
	}
}
