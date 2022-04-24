
public class CleaningCo {
	String name = "Limpieza y Mantenimiento S.L.";
	int cleaningFee = 15;
	int materialsFee  = 2;
	double calcCleaningFee;

	
	public CleaningCo(String name, int cleaningFee, int materialsFee, double calcCleaningFee) {
		name = this.name;
		cleaningFee = this.cleaningFee;
		materialsFee = this.materialsFee;
		calcCleaningFee = this.calcCleaningFee;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public int getCleaningFee() {
		return cleaningFee;
	}
	
	public float getMaterialsFee() {
		return materialsFee;
	}
	
	// CALC CLEANING FEE USING ARRAY OF CABINS (FREE CABINS)
	
	
	
	
}


