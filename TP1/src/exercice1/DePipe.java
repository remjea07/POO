package exercice1;

public class DePipe extends De {
	
	protected int borneMin = 0;
	
	public DePipe(int nFaces, String tNom, int laBorneMin){
		super(nFaces, tNom);
		this.setNbFaces(nFaces);
		nbDe ++;
		if((tNom != "")&&(tNom != null)) {
			nom = tNom;
		}else {
			nom = N_DEF_DE + nbDe;
		}
		if(laBorneMin < nFaces) {
			borneMin = laBorneMin;
		}else {
			borneMin = nFaces;
		}
		if(laBorneMin < nFaces) {
			borneMin = laBorneMin;
		}else {
			borneMin = nFaces;
		}
	}
	
	public DePipe() {
		this(NB_DEF_FACES,null,NB_DEF_FACES);
	}
	
	public int lancer() {
		int rep = super.lancer();
		while (rep < borneMin) {
			rep = 1 + r.nextInt(nbFaces);
		}
		return rep;
	}

}
