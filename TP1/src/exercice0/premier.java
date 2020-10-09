package exercice0;

public class premier {
	public static void main(String[] args) {
		int x=0;
		double y;
		double z=7;
		y = (2 * z) - 1 ;
		do {
		 x += y;
		 y -= 2;
		} while ((y >= 1) && (x!= -1)) ;
		System.out.println("Résultat :" + x);
		}
}
