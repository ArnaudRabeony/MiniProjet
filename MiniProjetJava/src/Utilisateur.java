
public class Utilisateur {

  private Action ac;
  private int id;
  private String nom;
  private String prenom;
  
  public Utilisateur () { };
  
  public int getId () {
    return id;
  }
  
  public void setNom(String n)
  {
	  this.nom=n;
  }
  
  public void setPrenom(String p)
  {
	  this.prenom=p;
  }
  
  public String getNom()
  {
	  return this.nom;
  }
  
  public String getPrenom()
  {
	  return this.prenom;
  }
  
  public void agir(){}
}
