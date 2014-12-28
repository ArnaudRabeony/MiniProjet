
public class Consulter extends Action {
  
  public Consulter (Utilisateur u)
  {
	  super(u);
  }
  
  public void agir()
  {
	  System.out.println("\t* * * * * * * * * * Etudiant : "+((Etudiant)u).getNom() +" "+((Etudiant)u).getPrenom()+" * * * * * * * * *\n");
	  System.out.println("Classement : "+((Etudiant)u).getClassement());
	  System.out.println("Note : "+((Etudiant)u).getNote().toString());
  }
}
