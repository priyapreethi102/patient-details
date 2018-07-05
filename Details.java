package PatientDetails;


	import java.util.Random;
	import java.util.Scanner;

	import PatientDetails.DataValidation;
	import PatientDetails.PatientInfo;
	import PatientDetails.DataCollection;

	public class Details {

		static Scanner sc=new Scanner(System.in);
			
		public static void main(String[] args)
		{
			String choice;
			

			while(true)
			{
				//Providing user interface
				System.out.println("Patient Details 1. Insert Patient details\n"
						+ "2. Exit From System");
				
				System.out.println("\nEnter your choice :");
				choice=sc.next();
				switch(choice)
				{
				
				case "1":PatientDetails();break;
				case "2":System.out.println("Exiting...");System.exit(0);
				default: System.out.println("Please enter correct choice");
				break;
				}
			}
		}
		private static void PatientDetails() 
		{
			System.out.println("Enter the name of the Patient: ");
			String PatientName=sc.next();
			try 
			{
				
				if(DataValidation.validatePatientName(PatientName))
				{
					System.out.println("Enter Patient Age: ");
					String age=sc.next();
					
					if(DataValidation.validatePatientAge(age))
					{
						System.out.println("Enter Patient phone number: ");
						String phnno=sc.next();
											
						
						if(DataValidation.validatePatientNumber(phnno))
						{
							System.out.println("Enter description: ");
							String desc=sc.next();
							
							if(DataValidation.validateDescription(desc))
							{
														
							Random ran=new Random();
							long refId=ran.nextInt();
																			
							PatientInfo pi=new PatientInfo(PatientName,age,
									phnno,desc,java.time.LocalDate.now(),
									refId);
							
							DataCollection.addNewPatient(pi);
							
							DataCollection.displayAllPatients();
												
							}
						}	
					}
				}
			}
			catch (PatientException e)
			{			
				System.out.println(e.getMessage());
			}		

		}
	}


