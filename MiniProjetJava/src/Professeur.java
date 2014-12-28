import java.util.ArrayList;

public class Professeur extends Utilisateur {

	private int nbEtud;
	private ArrayList<Etudiant> listeEtud;
	private Matiere matiere;
	private Action action;

	public ArrayList getListeEtud() {
		return listeEtud;
	}

	public void setListeEtud(ArrayList listeEtud) {
		this.listeEtud = listeEtud;
	}
	
	public Professeur (String n, String p)
	{
		this.setNom(n);
		this.setPrenom(p);
		this.listeEtud=new ArrayList();
		this.setAction(new Editer(this));
	}

	public Professeur (int nbEt,String nom, String pr, String m){
		//this.matiere.setNomMat(m);
		
		this.setNbEtud(nbEt);
		this.listeEtud=new ArrayList();
		//this.listeEtud = new Etudiant[nbEtud];
		this.setAction(new Editer(this));
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
