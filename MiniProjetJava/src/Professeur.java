

public class Professeur extends Utilisateur {

	private int nbEtud;
	private Etudiant[] listeEtud;
	private Matiere matiere;
	private Action action;

	public Etudiant[] getListeEtud() {
		return listeEtud;
	}

	public void setListeEtud(Etudiant[] listeEtud) {
		this.listeEtud = listeEtud;
	}

	public Professeur (int nbEt, String m){
		this.matiere.setNomMat(m);
		this.setNbEtud(nbEt);
		this.listeEtud = new Etudiant[nbEtud];
		this.setAction(new Editer());
	}
	
	public void setNbEtud(int nbEtud) {
		this.nbEtud = nbEtud;
	}
	
	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}
}
