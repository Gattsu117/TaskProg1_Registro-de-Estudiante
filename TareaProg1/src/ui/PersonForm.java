package ui;

import java.util.Date;
import java.util.Scanner;
import dol.Person;
import dol.Student;
import misc.DateUtil;

public class PersonForm {
	Scanner scan;
	Person person;
	
	public PersonForm(Scanner scanner) {
		scan = scanner;
                
	}
	
	public PersonForm(Person p) {
		person = p;
	}
	
	
	public Person catchPerson() {
    
		Person p = new Person();
                 Student student = new Student();
		System.out.println("Primer nombre: ");
		p.setFirstName(scan.next());
		
		System.out.println("Segundo nombre: ");
		p.setMiddleName(scan.next());
		
		System.out.println("Primer apellido: ");
		p.setSurName(scan.next());
		
		System.out.println("Segundo apellido: ");
		p.setSecondSurname(scan.next());
		
		System.out.println("Género: ");
		p.setGender(scan.next());
		
		Date date = DateUtil.catchValidDate(scan, "Fecha de nacimiento (dd/MM/yyyy): ");
		p.setBirthDate(date);
		
               System.out.println("Numero de Carnet: ");
		student.setNoIDStudent(scan.next());
		
                 date = DateUtil.catchValidDate(scan, "Fecha Ingreso del estudiante (dd/MM/yyyy): ");
		student.setDateInput(date);
		return p;
	}
	public Student catchStudent() {
            	Student s = new Student();
            
		System.out.println("Numero de Carnet: ");
		s.setNoIDStudent(scan.next());
		
		Date date = DateUtil.catchValidDate(scan, "Fecha Ingreso del estudiante (dd/MM/yyyy): ");
		s.setDateInput(date);
                
		return s;
	}
	public void showPerson() {
           
		System.out.printf("Primer nombre: %s\n" , person.getFirstName());		
		
		System.out.printf("Segundo nombre: %s\n", person.getMiddleName());
		
		System.out.printf("Primer apellido: %s\n", person.getSurName());
		
		System.out.printf("Segundo apellido: %s\n", person.getSecondSurname());
		
		System.out.printf("Género: %s\n", person.getGender());
		
		System.out.printf("Fecha de nacimiento: %s\n", DateUtil.dateToString(person.getBirthDate(), "dd/MM/yyyy"));
                
            
	}
          public void showStudent() {
               Student student = new Student();
		 System.out.printf("Numero de Carnet: %s\n" , student.getNoIDStudent());		
		
		
		
		System.out.printf("Fecha de Ingreso: %s\n", DateUtil.dateToString(student.getDateInput(), "dd/MM/yyyy"));
			
	}
	
}
