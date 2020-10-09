package exercice2;

public class Entier {
	
	private int entier=0;
	private int borneMax=20;
	private int borneMin=0;
	
	public Entier(int nb) {
		this.setEntier(nb);
	}
	
	public Entier() {
		entier = 0;
	}
	
	public int getBorneMax() {
		return borneMax;
	}
	public int getBorneMin() {
		return borneMin;
	}
	public int getEntier() {
		return entier;
	}
	public int setEntier(int Entier) {
		if ((entier > borneMin)&&(entier < borneMax)) {
			entier = Entier;
			return entier;
		}else {
			return entier;
		}
	}
	
	public int increment() {
		entier++;
		if ((entier > borneMin)&&(entier < borneMax)) {
			return entier;
		}else {
			entier--;
			return entier;
		}
	}
	
	public int increment(int n) {
		for(int i=0; i<n;i++){
			increment();
		}
		return entier;
	}

}
