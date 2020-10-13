package exercice3;

import java.util.*;
/*import util.Adresses;*/


public class Personnes{
    private static final Adresses ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    private final GregorianCalendar dateNaissance;
    private Adresses adresse=ADRESSE_INCONNUE;
    private static int compt = 0;
	
	/*
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personnes(String leNom,String lePrenom, GregorianCalendar laDate, Adresses lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
	}
	
	/*
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'année de naissance
	 * @param numero le n° de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personnes(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresses(numero,rue,code_postal,ville));
		compt ++;
	}

	/*
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/*
	 * Accesseur
	 * @return retourne le prénom
	 */
	public String getPrenom(){
		return prenom;
	}
	/*
	 * Accesseur
	 * @return retourne la date de naissance	 
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}
	/*
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresses getAdresse() {
		return adresse;
	}
	
	
	public static int getCompt(){
		return compt;
	}
	
	
	/*
	 * Modificateur
	 * @param retourne l'adresse	 
	 */
	public void setAdresse(Adresses a) {
		adresse=a;
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"PrŽnom : "+prenom+"\n"+
		"NŽ(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
		"-"+dateNaissance.get(Calendar.MONTH)+
		"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}
	
	public static String plusAgee(Personnes p, Personnes p2) {
		if (p2.getDateNaissance().after(p.getDateNaissance())) {
			return p.getNom() + " est le plus agee";
		}else {
			return p2.getNom() + " est le plus agee";
		}
	}
	
	public String plusAgeeQue(Personnes p2) {
		if (p2.getDateNaissance().after(this.getDateNaissance())) {
			return this.getNom() + " est le plus agee";
		}else {
			return p2.getNom() + " est le plus agee";
		}
	}
	
	public static boolean equals(Personnes p, Personnes p2){

	    boolean isEqualNom = (p.getNom().equals(p2.getNom())) && (p.getPrenom().equals(p2.getPrenom())) && (p.getDateNaissance().equals(p2.getDateNaissance()));
	    
	    return isEqualNom;
	    
	}
}

    
   