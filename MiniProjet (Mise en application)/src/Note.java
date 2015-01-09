

import java.util.*;

public class Note {

  private int valeur;
  private String Commentaire;
  
  public Note () { };

  public Note(int v, String c)
  {
	  this.setCommentaire(c);
	  this.setValeur(v);
  }
  
  @Override
public String toString() {
	return "Note [valeur=" + valeur + ", Commentaire=" + Commentaire + "]";
}

public void setValeur (int newVar) {
    valeur = newVar;
  }

  public int getValeur () {
    return valeur;
  }

  public void setCommentaire (String newVar) {
    Commentaire = newVar;
  }

  public String getCommentaire () {
    return Commentaire;
  }
}
