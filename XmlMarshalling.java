package Roshitha;
import java.io.*;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class XmlMarshalling {
	
	public static void main(String args[]) throws JAXBException{
		//step1 create employee object
		Employee e = new Employee();
		e.eId ="570";
		e.seteName("Roshitha");
		e.desg="data scientist";
		e.setExp(2);
		e.setSalary(1525000.00);
		e.phoneNumber= 9829579810L;
		
		File file = new File("D:\\Employee.xml");
		//step2 create JAXBContext
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		
		//step3 create marshaller
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(e,file);
		System.out.println("Employee is marshalled...");
		
		//step4 create unmarshaller
		context= null;
	    context  = JAXBContext.newInstance(Employee.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    File file1= new File("D://Employee1.xml");
	    Unmarshaller.unmarshal(e,file1);
	    System.out.println("Employee is unmarshalled...");
	    
	    
	    
				
		
	}

}
