  package mainpackage;

 
public class Ware {

	/* název zboží */
	private String nameWare;
	
	/* minimální zboží */
	private int minimumAmountWare;
	
	/* aktuální množství zboží */
	private int currentAmountWare;
	
	public Ware(String nameWare, int minimumAmountWare, int currentAmountWare) {

		this.nameWare = nameWare;
		this.minimumAmountWare = minimumAmountWare;
		this.currentAmountWare = currentAmountWare;
	}

	public String getNameWare() {
		return nameWare;
	}

	public int getMinimumAmountWare() {
		return minimumAmountWare;
	}


	public int getCurrentAmountWare() {
		return currentAmountWare;
	}
	
	public void setWare(String nameWare, int minimumAmountWare, int currentAmountWare) {
		this.nameWare = nameWare;
		this.minimumAmountWare = minimumAmountWare;
		this.currentAmountWare = currentAmountWare;
	}


}
