package exercice1;

public class TestDe {
	public static void main(String[] args){
		De monDe = new De(24,"The De");
		De encoreDe = new De(90,"Le De");
		De autreDe = new De();
		DePipe leDePipe = new DePipe(50,"DePipe",40);
		DeMirroir leDeMirroir = new DeMirroir(3,"DeMirroir");
		System.out.println("La valeur min : "+ De.NB_MIN_FACES);
		System.out.println("Mon de a nb de faces : "+ monDe.getNbFaces());
		System.out.println("Mon de est : "+ monDe.toString());
		System.out.println("Mon de est : "+ autreDe.toString());
		System.out.println("Nombre de De creer : "+ De.getNbDe());
		//test lancer
		System.out.println("Le lancer du " + monDe.getNom()+ " donne : "+ monDe.lancer());
		System.out.println("Le lancer du " + autreDe.getNom()+ " donne : "+ autreDe.lancer());
		System.out.println("Le lancer du " + encoreDe.getNom()+ " donne : "+ encoreDe.lancer(5));
		//test lancer Pipe
		System.out.println("Le lancer du " + leDePipe.getNom()+ " donne : "+ leDePipe.lancer());
		System.out.println("Le lancer du " + leDePipe.getNom()+ " donne : "+ leDePipe.lancer(5));
		System.out.println("Le lancer du " + leDeMirroir.getNom()+ " donne : "+ leDeMirroir.lancer(3));
		
		
		//tentative d'acces
		//monDe.nbFaces=240;
		//System.out.print(monDe.nbFaces);
	}

}
