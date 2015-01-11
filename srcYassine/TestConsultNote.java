
public class TestConsultNote {
	public static void main(String args[])
	{
			Professeur p=new Professeur("Nom Prof", "Prenom Prof");
			Etudiant e=new Etudiant("Eleve1","Prenom1");
			Etudiant e1=new Etudiant("Eleve2","Prenom2");
			p.getListeEtud().add(e);
			p.getListeEtud().add(e1);			
	}
}
