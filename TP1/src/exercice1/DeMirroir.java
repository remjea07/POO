package exercice1;

public class DeMirroir extends De {
	
	protected int valeur = super.lancer();
	
	public DeMirroir(int nFaces, String tNom){
		super(nFaces, tNom);
		this.setNbFaces(nFaces);
		nbDe ++;
		if((tNom != "")&&(tNom != null)) {
			nom = tNom;
		}else {
			nom = N_DEF_DE + nbDe;
		}
		
	}
		
	public int lancer() {
		int rep = 1 + r.nextInt(nbFaces);
		while(rep == valeur) {
			System.out.println("Mirroir ");
			rep = 1 + r.nextInt(nbFaces);
		}
		return rep;
		
	}
	
	
}
