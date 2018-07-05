package PatientDetails;

import java.time.LocalDate;

public class PatientInfo {
	private String patientName;
	private String age;
	private String phnno;
	private String desc;
	private long referenceId;
	private LocalDate currentDate;
	
	public PatientInfo() {

	}
	
	public PatientInfo(String patientName, String age,String phnno,String desc, LocalDate currentDate, long referenceId ) {
		this.patientName = patientName;
		this.age = age;
		this.phnno = phnno;
		this.desc= desc;
		this.currentDate = currentDate;
		this.referenceId = referenceId;
	}
	
	public long getReferenceId() {
		return referenceId;
	}
	
	public void setReferenceId(int referenceId) {
		this.referenceId = referenceId;
	}
	
	public String getPatientName() {
		return patientName;
	}
	
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public String getPatientAge() {
		return age;
	}
	
	public void setPatientAge(String age) {
		this.age = age;
	}
	
	public String getPatientNumber() {
		return phnno;
	}
	
	public void setPatientNumber(String phnno) {
		this.phnno = phnno;
	}
		
		public String getDesc() {
			return desc;
		}
		
		public void setDesc(String desc) {
			this.desc = desc;
		}
	
	public LocalDate getCurrentDate() {
		return currentDate;
	}
	
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
}
