package PatientDetails;

	import java.util.regex.Pattern;
	public class DataValidation {

		public  static  boolean validatePatientName(String ptName)throws PatientException
		{
			String ptPattern="[A-Za-z]{5,15}";
			if(Pattern.matches(ptPattern, ptName))
			{
				return true;
			}
			else
			{
				throw new PatientException("Patient name should be alphabet and Minimum 5 and maximum 15");
			}
		}
		public  static  boolean validatePatientAge(String age)throws PatientException
		{
			String agePattern="[0-99]{2}";
			if(Pattern.matches(agePattern,age))
			{
				return true;
							
			}
			else
			{
				throw new PatientException("age must be a number between 1 to 100");
			}
		}
		public  static  boolean validatePatientNumber(String phnno)throws PatientException
		{
			String phnPattern="[7-9]{1}[0-9]{9}";
			if(Pattern.matches(phnPattern,phnno))
			{
				return true;
							
			}
			else
			{
				throw new PatientException("phone number must contain 10 numbers only and start with 7,8,9");
			}
		}
		public  static  boolean validateDescription(String desc)throws PatientException
		{
			String descPattern="[A-Za-z]{0,40}";
			if(Pattern.matches(descPattern, desc))
			{
				return true;
			}
			else
			{
				throw new PatientException("Description should be alphabet and maximum 40");
			}
		}
	}



