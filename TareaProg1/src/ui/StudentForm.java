/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;


import dol.Person;
import dol.Student;
import java.util.Date;
import java.util.Scanner;
import misc.DateUtil;

/**
 *
 * @author Edward
 */
public class StudentForm {
    
	Student student;
	Person person;
	
	
	public StudentForm(Person s) {
		person = s;
	}

   public StudentForm(){
       
   }
        
        public Student catchStudent() {
            Scanner scan = new Scanner(System.in);
                Person p = new Person();
		Student s = new Student();
            
		System.out.println("Numero de Carnet: ");
		s.setNoIDStudent(scan.next());
		
		Date date = DateUtil.catchValidDate(scan, "Fecha Ingreso del estudiante (dd/MM/yyyy): ");
		s.setDateInput(date);
                System.out.println("La edad del estudiante es " + p.getAge());
                System.out.println("La fecha de ingreso del estudiante" + s.getDateInp());
             
            
               
                
                
		
//                 int opt = 0;
//            Scanner scan = new Scanner(System.in);
//            opt = scan.nextInt();
//            System.out.println("Esta persona es un estudiante ?");
//            if(opt == 1){
//                System.out.println("Siiiii");
//            }else{
//                System.out.println("Nooo");
//            }
		return s;
	}
        
        public void showStudent() {
		System.out.printf("Numero de Carnet: %s\n" , student.getNoIDStudent());		
		
		
		
		System.out.printf("Fecha de Ingreso: %s\n", DateUtil.dateToString(student.getDateInput(), "dd/MM/yyyy"));
                
//                System.out.printf("Fecha de nacimiento: %s\n", DateUtil.dateToString(student.get), "dd/MM/yyyy"));

			
	}
	
	
	
}
