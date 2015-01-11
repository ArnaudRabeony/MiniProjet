import java.util.ArrayList;
import java.util.Scanner;


/*
 * NOUVEAU
 */

public class Groupe{

	private Professeur prof;
	private ArrayList<Etudiant> eleves;
	private int moyenne;
	private int max;
	private int min;
		
	public Groupe()
	{		
		this.init();
		this.setMax(0);
		this.setMin(20);
		this.setMoyenne(0);
	}

	public Groupe(Professeur prof)
	{
		this();
		this.prof=prof;
	}
	
	public void init()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\n* * * * * * * * * * * * * * *  Création de la classe  * * * * * * * * * * * * * * *\n\n");
		
		this.eleves=new ArrayList<Etudiant>();
		Etudiant e=new Etudiant("Night","Yass");
		Etudiant e2=new Etudiant("Wabe","Awno");
		Etudiant e3=new Etudiant("Ouille","AieAie");
		Etudiant e4=new Etudiant("GhostFamily","Phantom");
		
		this.eleves.add(e);
		this.eleves.add(e2);
		this.eleves.add(e3);
		this.eleves.add(e4);
		//this.creerClasse(nbEtud);
	}
	
	@Override
	public String toString() {
		return "Groupe [prof=" + prof + ", eleves=" + eleves + ", moyenne="
				+ moyenne + ", max=" + max + ", min=" + min + "]";
	}

	public Groupe(Professeur p, ArrayList<Etudiant> e)
	{
		this.setEleves(e);
		this.setProf(p);
		this.setMax(0);
		this.setMin(20);
		this.setMoyenne(0);
	}
	
	/*public void creerClasse(int n)
	{
		int i;
		
		for(i=0;i<n;i++)
		{
			String nom=new String("Nom"+i+1);
			String pr=new String("Prenom"+i+1);
			this.getEleves().add(new Etudiant(nom, pr));
		}
	*/
	
	public int getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(int moyenne) {
		this.moyenne = moyenne;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}	
		
	public void choixUtilisateur()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n* * * * * * * * * * * * Connexion * * * * * * * * * * *\n\n");
		System.out.println("Saisir nom :");
		String nom = sc.nextLine();
		System.out.println("Saisir prenom :");
		String prenom = sc.nextLine();
		
		ArrayList<Utilisateur> grpProf=new ArrayList<Utilisateur>(this.getEleves());
		grpProf.add(this.getProf());
		
		for(Utilisateur u : grpProf)
		{
			 System.out.println(u.getNom());
		}
		
		for(Utilisateur u : grpProf)
		{
			if(nom.equals(u.getNom()) && prenom.equals(u.getPrenom()))
			{
				u.getAc().agir();
			}
		}		
	}
	
	public void statistiques()
	{
		for(Etudiant e : this.getEleves())
		{
			if(e.getNote().getValeur()<this.getMin())
				this.setMin(e.getNote().getValeur());
			else if(e.getNote().getValeur()>this.getMax())
				this.setMax(e.getNote().getValeur());
			this.setMoyenne(this.getMoyenne()+e.getNote().getValeur());
		}
		this.setMoyenne(this.getMoyenne()/this.getEleves().size());
	}

	public Professeur getProf() {
		return prof;
	}

	public void setProf(Professeur prof) {
		this.prof = prof;
	}

	public ArrayList<Etudiant> getEleves() {
		return eleves;
	}

	public void setEleves(ArrayList<Etudiant> eleves) {
		this.eleves = eleves;
	}
}
