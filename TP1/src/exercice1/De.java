package exercice1;
import java.util.*;


public class De {
	//Constante de classe
	public static final int NB_MIN_FACES = 3;
	public static final int NB_MAX_FACES = 120;
	public static final int NB_DEF_FACES = 6;
	public static final String N_DEF_DE = "De n° ";
	
	
	//Variable d instance
	protected int nbFaces = 6;
	protected String nom;

	
	//variable de classe
	public static Random r = new Random();
	protected static int nbDe = 0;
	
	
	//Methode de classe
	public static int getNbDe() {
		return nbDe;
	}

	
	//Constructeur
	public De(int nFaces, String tNom){
		this.setNbFaces(nFaces);
		nbDe ++;
		if((tNom != "")&&(tNom != null)) {
			nom = tNom;
		}else {
			nom = N_DEF_DE + nbDe;
		}
		
	}
	public De() {
		this(NB_DEF_FACES,null);
	}
	
	
	//Redefinition
	public String toString() {
		return "Le de possede "+nbFaces+" faces et s'appelle "+nom;
	}
	
	
	//get et set
	public int getNbFaces() {
		return nbFaces;
	}
	public void setNbFaces(int nvNbFaces) {
		if ((nvNbFaces >= NB_MIN_FACES)&&(nvNbFaces <= NB_MAX_FACES)){
			nbFaces = nvNbFaces;
			}else {
				System.err.println("nb de Faces compris entre "+NB_MIN_FACES+" et "+NB_MAX_FACES);
			}
	}
	public String getNom() {
		return nom;
	}
	
	
	//Methode instance
	public int lancer() {
		int rep = 1 + r.nextInt(nbFaces);
		return rep;
	}
	public int lancer(int nbLance) {
		int lance = 0;
		int maxLance = 0;
		for(int i=0; i<nbLance;i++){
			lance = this.lancer();
			if(maxLance < lance) {
				maxLance = lance;
			}
		}
		return maxLance;
	}
}
