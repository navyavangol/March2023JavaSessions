package OOP_Abstraction;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh=new FortisHospital();
		fh.physioServices();
		fh.cardioServices();
		fh.neuroServices();
		fh.emergencyServices();
		fh.dentalServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		
		System.out.println(USMedical.min_fee);//called by interface name
		System.out.println(FortisHospital.min_fee);//called by class name
		
		fh.medicalRD();
		
		USMedical.USMedPharmacy();//here calling static methods by using interfacename.methodname and not possible to call by object ref name(here fs)
		
		fh.billing();//default method in interface
		
		System.out.println("--------------------------------------");
		
		//cannot create the object of interface
		//USMedical us=new USMedical();//error -cannot instantiate the USMedical
		
		//top-casting
		//child class object can be referred by parent interface reference variable
		USMedical us=new FortisHospital();//in this case we can refer only the usmedical interface methods defined not even individual methods defined in fortis hospital
		us.physioServices();
		us.ENTServices();
		us.cardioServices();
		us.emergencyServices();
		
		//down- casting at compile time?- compile time itself not allowed even we do casting
		//FortisHospital f1=(FortisHospital) new USMedical();
		
		
		

	}

}
