package PatientDetails;


	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.Iterator;
	import PatientDetails.PatientInfo;
	public class DataCollection {
		
		private  static ArrayList<PatientInfo> PatientList=null;
		
		static
		{
			PatientList=new ArrayList<PatientInfo>();
			PatientInfo PatientInfo1=new PatientInfo("jhfreyt","12","9876543210","jtdeak",LocalDate.now(),123);
			PatientInfo PatientInfo2=new PatientInfo("ks","2","8765432109","pkl",LocalDate.now(),124);
			
			PatientList.add(PatientInfo1);
			PatientList.add(PatientInfo2);
		}
		
		public DataCollection(){}
		
		
		public static void addNewPatient(PatientInfo PatientInfo) 
		{			
			PatientList.add(PatientInfo);				
		}
		
		public static ArrayList<PatientInfo> getPatientList() {
			return PatientList;
		}

		public static void setPatientList(ArrayList<PatientInfo> PatientList) {
			DataCollection.PatientList = PatientList;
		}

		
		public static void displayAllPatients()
		{
			Iterator<PatientInfo> Patient=PatientList.iterator();
			PatientInfo tempPatient=null;
			while(Patient.hasNext())
			{
				tempPatient=Patient.next();
				System.out.println(tempPatient);			
			}
		}

	}


