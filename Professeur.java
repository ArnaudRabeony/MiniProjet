
/*
 *NOUVEAU 
 */
public class Professeur extends Utilisateur {

	private int nbEtud;
	private Groupe grp;
	private Action action;

	public Groupe getGrp() {
		return grp;
	}

	public void setListeEtud(Groupe listeEtud) {
		this.grp = listeEtud;
	}
	
	public Professeur (String n, String p)
	{
		this.setNom(n);
		this.setPrenom(p);
		this.grp=new Groupe();
		this.action= new Editer();
	}

	public Professeur (int nbEt,String nom, String pr, String m)
	{
		//this.matiere.setNomMat(m);
		this.setNbEtud(nbEt);
		this.grp=new Groupe();
		this.action= new Editer();
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
