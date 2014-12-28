
import java.util.*;

public class Etudiant extends Utilisateur {

  private int classement;
  private Note note;
  private Action action;
	
  public Etudiant ( String nom, String pr, Note n)
  {
	  super(nom,pr);
	  this.setAction(new Consulter(this));
	  this.note=n;
	  this.setClassement(0);
  }
  
  public Etudiant ( String nom, String pr)
  {
	  super(nom,pr);
	  this.setAction(new Consulter(this));
	  this.setClassement(0);
  }  
  
  public Etudiant () {
	this.setClassement(0);
	this.note=new Note(0,"NP");
	this.setAction(new Consulter(this));
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
  
  public Action getAction() {
	return action;
  }
  
  public void setAction(Action action) {
		this.action = action;
	}
}
