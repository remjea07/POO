package exercice3;

/*
 * University of Corsica
 * by Marie-Laure Nivet
 */

/**
 * Classe Adrese servant � mod�liser les informations contenues dans une adresse
 * @author nivet_m
 *
 */
public class Adresses {
	public static final int AUCUN_NUMERO=-1;
	public static final int INUTILE_NUMERO=-2;
	public static final String INCONNU_CHAINE="Inconnu";
	public static final String INUTILE_CHAINE="Inutile";
	private int numero=AUCUN_NUMERO;
	private String rue=INCONNU_CHAINE;
	private String code_postal=INCONNU_CHAINE;
	private final String ville;

	/**
	 * Construction d'une Adresse compl�te
	 * Certaines v�rifications sont fa�tes pour s'assurer de la
	 * validit� de l'adresse en particulier on v�rifie le n�
	 * et le code postal.
	 * <p>
	 * Une adresse ne peut �tre modifi�e une fois cr��e et correctement
	 * renseign�e.
	 * @param numero le num�ro de la rue s'il existe, sinon Adresse.INUTILE
	 * @param rue la rue si elle est n�cessaire, sinon Adresse.INUTILE_RUE
	 * @param code_postal le code postal de la forme NNNNN ou N est un chiffre>0
	 * @param ville la ville
	 */
	public Adresses(int numero, String rue,String code_postal, String ville){
		setCode_postal(code_postal);
		setNumero(numero);
		this.rue = rue;
		this.ville = ville;
	}
	/**
	 * Construction d'une Adresse avec seule mention de la ville et du
	 * code postal
	 * @param code_postal le code postal de la forme NNNNN ou N est un chiffre>0
	 * @param ville la ville
	 */
	public Adresses(String code_postal, String ville) {
		this(INUTILE_NUMERO,INUTILE_CHAINE,code_postal,ville);
	}

	/**
	 * Construction d'une Adresse avec seule mention de la rue de la ville et du
	 * code postal
	 * @param rue la rue si elle est n�cessaire, sinon Adresse.INUTILE_RUE
	 * @param code_postal le code postal de la forme NNNNN ou N est un chiffre>0
	 * @param ville la ville
	 */
	public Adresses(String code_postal, String rue, String ville) {
		this(INUTILE_NUMERO,rue,code_postal,ville);
	}

	/**
	 * @return retourne le code postal.
	 */
	public String getCode_postal() {
		return code_postal;
	}
	/**
	 * @param code_postal le code postal pour assignation.
	 */
	public final void  setCode_postal(String c_p){
		if (code_postal.equals(INCONNU_CHAINE)&&(c_p.matches("[0-9]{5}")))
			code_postal=c_p;
		else{
			if (!code_postal.equals(INCONNU_CHAINE))
				System.err.println("Le code postal a d�j� �t� attribu�, vous ne pouvez plus le modifier...");
			else {
				System.err.println("Code postal mal �crit, il doit �tre de la forme NNNNN avec N un chiffre diff�rent de 0");
				System.err.println("Vous pouvez r�essayer une nouvelle affectation...");
			}
		}
	}

	/**
	 * @return retourne le num�ro de la rue.
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero le num�ro pour attribution, il doit �tre positif
	 */
	public final void  setNumero(int n) {
		if (((numero==AUCUN_NUMERO)||(numero==INUTILE_NUMERO))&&(n>0)) numero = n;
		else System.err.println("Numero incorrect, il doit �tre positif...");
	}
	/**
	 * @return retourne la rue.
	 */
	public String getRue() {
		return rue;
	}
	/**
	 * @param rue la rue pour attribution.
	 */
	public void setRue(String r) {
		rue = r;
	}
	/**
	 * @return retourne la ville
	 */
	public String getVille() {
		return ville;
	}

	/** Red�fintion de toString
	 * @see java.lang.Object#toString()
	 */
        @Override
	public String toString() {
		StringBuilder result=new StringBuilder();
		if ((numero!=AUCUN_NUMERO)&&(numero!=INUTILE_NUMERO)) result.append("n�").append(numero).append(",");
		if ((!rue.equals(INCONNU_CHAINE))&&(!(rue.equals(INUTILE_CHAINE)))) result.append("rue ").append(rue);
		if (!code_postal.equals(INCONNU_CHAINE)) result.append(" ").append(code_postal).append(" ");
		else result.append(" Code postal inconnu ");
		result.append(ville);
		return result.toString();
	}
}
