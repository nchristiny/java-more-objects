package Hospital;

public class Patient extends Person
{
	//declare two instance variable
	private String patientId;
	private Doctor attendingPhysician;

	//Patient default constructor to initialize all members
	public Patient()
	{
		super("","");
		patientId ="";
		attendingPhysician = new Doctor();
	}

	//Patient constructor
	public Patient(String id, String fName, String lName,
			String docFrName, String docLaName, String docSpl)
	{
		super(fName, lName);
		setID(id);
		attendingPhysician = new Doctor (docFrName, docLaName, docSpl);
	}

	public void updateInfo(String fName, String lName,
			String docFrName, String docLaName, String docSpl)
	{
		setName(fName, lName);
		setDoctorName(docFrName, docLaName);
		setDoctorSpl(docSpl);
	}

	public void setID(String id)
	{
		patientId = id;
	}

	public String getID()
	{
		return patientId;
	}


	public void setDoctorName(String fName, String lName)
	{
		attendingPhysician.setName(fName, lName);
	}

	public void setDoctorSpl(String spl)
	{
		attendingPhysician.setSpeciality(spl);
	}


	public String getDoctorFName()
	{
		return attendingPhysician.getFirstName();
	}

	public String getDoctorLName()
	{
		return attendingPhysician.getLastName();

	}

	public String getDoctorSpl()
	{    	
		return attendingPhysician.getSpeciality();
	}

	@Override  
	public String toString()
	{
		return "Patient ID: " + getID() + "\n" + "Patient name: " + super.toString() + "\n"
				+ "Attending Physician: " + attendingPhysician.toString()
				+ "\n\n";
	}
}

