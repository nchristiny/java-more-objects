/**
 * Program demonstrating inheritance 
 */
package Hospital;

/**
 * @author Nicholas Christiny
 *
 */

public class Doctor extends Person
{
	private String speciality;

	public Doctor()
	{ 
		speciality = "";
	}

	public Doctor(String first, String last, String spl)
	{
		super(first, last);
		speciality = spl;
	}

	public void setSpeciality(String spl)
	{
		speciality = spl;
	}

	public String getSpeciality()
	{
		return speciality;
	}

	public String toString()
	{
		return super.toString() + " " + speciality;
	}
}

