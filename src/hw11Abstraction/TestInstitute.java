package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {

		System.out.println("\n............... ColumbiaUniversity ..................\n");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
		ColumbiaUniversity.shumi();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.lawInfo();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.biochemistryLab();
		ColumbiaUniversity.shuma();
		columbiaUniversity.caring();
		columbiaUniversity.maths();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.gymnasium();
		//ColumbiaUniversity .library();  //static method didn't support. 
		columbiaUniversity.dorm();
		//ColumbiaUniversity.studyRoom(); //static method didn't support. 
		columbiaUniversity.morgue();
		//ColumbiaUniversity.pharmacy();//static method didn't support. 
		columbiaUniversity.computerLab();
		columbiaUniversity.anthropology();
	
		System.out.println("\n............... University ..................\n");
		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library();
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		//University.studyRoom();//static method didn't support. 
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();
		//University.pharmacy();//static method didn't support. 
		
		System.out.println("\n....................MedicalSchool...........................\n");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		MedicalSchool.shuma();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.maths();
		medicalSchool.mechanicalLab();
		medicalSchool.aeronauticalInfo();
		medicalSchool.computerLab();
		medicalSchool.anthropology();
		medicalSchool.lawInfo();
		
	}

}
