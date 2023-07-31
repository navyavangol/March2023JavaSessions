package OOP_Abstraction;

public class FortisHospital extends Medical  implements USMedical, UKMedical, IndianMedical {

	// US
	@Override
	public void physioServices() {
		System.out.println("FH ----- physioServices");

	}

	@Override
	public void cardioServices() {
		System.out.println("FH ----- cardioServices");

	}

	@Override
	public void ENTServices() {
		System.out.println("FH ----- ENTServices");

	}

	// UK
	@Override
	public void neuroServices() {
		System.out.println("FH ----- neuroServices");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH ----- orthoServices");

	}

	// Indian
	@Override
	public void oncologyServices() {
		System.out.println("FH ----- oncologyServices");

	}

	@Override
	public void dentalServices() {
		System.out.println("FH ----- dentalServices");

	}

	@Override
	public void gynoServices() {
		System.out.println("FH ----- gynoServices");

	}

	// FH Individual
	public void medicalTraining() {
		System.out.println("FH -----medicalTraining ");
	}

	public void medicalInsurance() {
		System.out.println("FH ----- medicalInsurance ");
	}

	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test(int a) {

	}

	@Override
	public String get(int a) {
		return null;
	}

	@Override
	public String get(int a, int b) {
		return null;
	}

	@Override
	public void covidVaccination() {
		System.out.println("FH --------- covidVaccination ");

	}

	@Override
	public void medicalNews() {

		System.out.println("FH --------- medicalNews ");

	}
	
	@Override
	public void billing() {
		System.out.println("FH ------ medical  billing");
	}
}
