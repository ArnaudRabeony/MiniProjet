
public class TestConsultNote {
	public static void main(String args[])
	{
			Professeur p=new Professeur("Nom Prof", "Prenom Prof");
			Etudiant e=new Etudiant("Eleve1","Prenom1");
			Etudiant e1=new Etudiant("Eleve2","Prenom2");
			p.getGrp().getEleves().add(e);
			p.getGrp().getEleves().add(e1);			
	}
}
