
import java.util.*;

public class Matiere {

	private String nomMat;
	public Note notesClasse;
	private Professeur prof;


	public Matiere (String nom, Professeur p) 
	{
		this.setNomMat(nom);
		this.setProf(p);
	}

	public void aff()
	{
		System.out.println("\t* * * * * * * * * * Matiere : "+this.getNomMat()+" * * * * * * * * *\n");
		System.out.println("Nom Professeur : "+this.prof.getNom());
	}
	
	public void classement()
	{}

	public String getNomMat() {
		return nomMat;
	}

	public void setNomMat(String nomMat) {
		this.nomMat = nomMat;
	}

	public Professeur getProf() {
		return prof;
	}

	public void setProf(Professeur prof) {
		this.prof = prof;
	}
}
