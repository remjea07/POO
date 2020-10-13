package exercice3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employer extends  Personnes {

    private GregorianCalendar DateEmbauche ;
    private double Salaire ;
    public static Calendar now = new GregorianCalendar();



    public Employer(String leNom, String lePrenom, GregorianCalendar laDate, Adresses lAdresse,GregorianCalendar DateEmbauche , double Salaire) {
        super(leNom, lePrenom, laDate, lAdresse);
        this.DateEmbauche = DateEmbauche ;
        this.Salaire = Salaire ; 
    }

    public Employer(String leNom, String lePrenom, int j, int m, int a, int numero, String rue, String code_postal,
            String ville, int j2, int m2, int a2 , int Salaire) {
        this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresses(numero,rue,code_postal,ville),new GregorianCalendar(a2,m2,j2), Salaire);
    }

    public void setSalaire(double Salaire) {
    	this.Salaire = Salaire;
    }


    public Double getSalaire() {
        return Salaire;
    }
}