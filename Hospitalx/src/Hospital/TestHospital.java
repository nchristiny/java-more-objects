package Hospital;

import java.util.*;

public class TestHospital
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        Patient newPatient = new Patient();
        
        String str1, str2;

        System.out.print("Enter patient's ID: ");
        str1 = console.next();
        System.out.println();

        newPatient.setID(str1);
        
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
        
    }
}
