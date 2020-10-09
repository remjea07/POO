package exercice1;

public class DeAutre extends De {
	
	public DeAutre(int nFaces, String tNom){
		super(nFaces, tNom);
		
	}
	
	public int lancer() {
		int rep = 1 + r.nextInt(nbFaces);
		while(rep%2 != 0) {
			rep = 1 + r.nextInt(nbFaces);
		}
		return rep;
		
	}

}
