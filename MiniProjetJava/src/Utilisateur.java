/*
 *NOUVEAU 
 */
public class Utilisateur{

  private Action ac;
  private String nom;
  private String prenom;
  
  public Utilisateur (String n, String p)
  {
	  this.setNom(n);
	  this.setPrenom(p);
  }

  
  public Utilisateur (String n, String p, Action ac)
  {
	  this.setNom(n);
	  this.setPrenom(p);
	  this.ac=ac;
  }
  
  public Utilisateur(){}
  
  public Action getAc() {
	return ac;
}

public void setAc(Action ac) {
	this.ac = ac;
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
  
}
