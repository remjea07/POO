package exercice3;

public class Test {

	public static void main(String[] args) {
		Adresses a1 = new Adresses(11,"La Rue","20000","ajaccio");
		Adresses a2 = new Adresses(12,"La Rue","20000","ajaccio");
		Adresses a3 = new Adresses(13,"La Rue","20000","ajaccio");
		
		Personnes p1 = new Personnes("R","J",20,5,2016,1,"La Rue","20000","ajaccio");
		Personnes p2 = new Personnes("H","J",6,5,2010,2,"La Rue","20000","ajaccio");
		Personnes p3 = new Personnes("M","J",2,5,2018,3,"La Rue","20000","ajaccio");
		Personnes p4 = new Personnes("R","J",20,5,2016,1,"La Rue","20000","ajaccio");
		
		
		System.out.println(Personnes.getCompt());
		System.out.println(Personnes.plusAgee(p1, p3));
		System.out.println(p1.plusAgeeQue(p2));
		System.out.println(Personnes.equals(p1, p4));


	}

}
