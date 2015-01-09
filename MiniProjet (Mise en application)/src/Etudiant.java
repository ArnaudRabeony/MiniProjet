

import java.util.*;

/*
 * NOUVEAU
 */

public class Etudiant extends Utilisateur implements java.lang.Comparable{

  private int classement;
  private Note note;
	
  public Etudiant ( String nom, String pr, Note n)
  {
	  super(nom,pr);
	  this.setAc(new Consulter(this));
	  this.note=n;
	  this.setClassement(0);
  }
  
  public Etudiant ( String nom, String pr)
  {
	  super(nom,pr);
	  this.setAc(new Consulter(this));
	  this.setClassement(0);
  }  
  
  public Etudiant () {
	this.setClassement(0);
	this.note=new Note(0,"NP");
	this.setAc(new Consulter(this));
  }
  
  public void classement(ArrayList<Etudiant> etud)
  {
		Collections.sort(etud); 
		this.setClassement(etud.indexOf(this));
  }
  
  public int compareTo(Object other) { 
      int nombre1 = ((Etudiant) other).getNote().getValeur(); 
      int nombre2 = this.getNote().getValeur();
      if (nombre1 > nombre2)  return -1; 
      else if(nombre1 == nombre2) return 0; 
      else return 1; 
 }
  
  @Override
public String toString() {
	return "Etudiant [classement=" + classement + ", note=" + note.getValeur()+"/"+note.getCommentaire()
			+ ", Nom=" + this.getNom()
			+ ", Prenom=" +this.getPrenom() + "]";
}

public void setNote(Note note) {
	this.note = note;
}

public Note getNote() {
	return note;
  }

  public int getClassement() {
	return classement;
  }

  public void setClassement(int classement) {
	this.classement = classement;
  }

}
