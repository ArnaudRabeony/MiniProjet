
public class Consulter implements Action {

  private Etudiant e;
  
  public Consulter () { };
  
  public void agir()
  {
	  System.out.println("\t* * * * * * * * * * Etudiant : "+this.getE().getId()+" * * * * * * * * *\n");
	  System.out.println("Classement : "+this.e.getClassement());
	  System.out.println("Note : "+this.e.getNote());
  }

  public Utilisateur getE() {
	return e;
  }

}
