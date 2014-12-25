
import java.util.*;

public class Etudiant extends Utilisateur {

  private int classement;
  private Note note;
  private Action action;
	
  public Etudiant () {
	this.setClassement(0);
	this.setAction(new Consulter());
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
