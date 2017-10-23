package Hospital;

import java.util.*;

public class TestHospital
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args)
	{
		Patient newPatient = new Patient();

		String id, str1, str2, newFirstName, newLastName, newDocFName, newDocLName, newSpeciality;

		System.out.print("Enter patient's ID: ");
		id = console.next();
		System.out.println();

		newPatient.setID(id);

		System.out.print("Enter patient's first name: ");
		str1 = console.next();
		System.out.println();

		System.out.print("Enter patient's last name: ");
		str2 = console.next();
		System.out.println();

		newPatient.setName(str1, str2);

		System.out.print("Enter doctor's first name: ");
		str1 = console.next();
		System.out.println();

		System.out.print("Enter doctor's last name: ");
		str2 = console.next();
		System.out.println();
		console.nextLine();

		newPatient.setDoctorName(str1, str2);

		System.out.print("Enter doctor's speciality: ");
		str1 = console.nextLine();
		System.out.println();

		newPatient.setDoctorSpl(str1);


		System.out.println(newPatient);
		
		// Updating the patient and doctor information
		System.out.print("Let's update the patient and doctor.\n");		
		System.out.println();	
		System.out.print("Enter new patient's first name: ");
		newFirstName = console.next();
		System.out.println();
		System.out.print("Enter new patient's last name: ");
		newLastName = console.next();
		System.out.println();
		System.out.print("Enter new doctor's first name: ");
		newDocFName = console.next();
		System.out.println();
		System.out.print("Enter new doctor's last name: ");
		newDocLName = console.next();
		System.out.println();
		System.out.print("Enter new doctor's speciality: ");
		newSpeciality = console.next();
		System.out.println();
		
		// call to updateInfo, renamed from setInfo(), which was not being used
		newPatient.updateInfo(newFirstName, newLastName, newDocFName, newDocLName, newSpeciality);
		System.out.println("Patient updated.");

		// display new Patient
		System.out.println(newPatient);

	}
}
