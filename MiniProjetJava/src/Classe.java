import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Classe{

	private Professeur prof;
	private ArrayList<Etudiant> eleves;
	private int moyenne;
	private int max;
	private int min;
	

	public Classe()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\n* * * * * * * * * * * * * * *  Création de la classe  * * * * * * * * * * * * * * *\n\n");
		
		this.eleves=new ArrayList();
		
		System.out.print("\nSaisir le nom de l'enseignant :");
		String nomProf=sc.nextLine();
		
		System.out.print("\nSaisir le prénom de l'enseignant :");
		String prenomProf=sc.nextLine();
		
		this.setProf(new Professeur(nomProf, prenomProf));
		
		System.out.print("\nSaisir le nombre d'étudiant de la classe :");
		int nbEtud=sc.nextInt();
		this.creerClasse(nbEtud);
				
		this.setMax(0);
		this.setMin(20);
		this.setMoyenne(0);
	}
	
	@Override
	public String toString() {
		return "Classe [prof=" + prof + ", eleves=" + eleves + ", moyenne="
				+ moyenne + ", max=" + max + ", min=" + min + "]";
	}

	public Classe(Professeur p, ArrayList<Etudiant> e)
	{
		this.setEleves(e);
		this.setProf(p);
		this.setMax(0);
		this.setMin(20);
		this.setMoyenne(0);
	}
	
	public void creerClasse(int n)
	{
		int i;
		
		for(i=0;i<n;i++)
		{
			String nom=new String("Nom"+i+1);
			String pr=new String("Prenom"+i+1);
			this.getEleves().add(new Etudiant(nom, pr));
		}
	}
	
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
		
		for(Utilisateur u : this.getEleves())
		{
			if(nom.equals(u.getNom()) && prenom.equals(u.getPrenom()))
			{
				u.agir();
				if(u instanceof Professeur)
				{
					System.out.println("\nVoir les statistiques ?\n1 - Oui\n2 - Non");
					int choix=sc.nextInt();
					if(choix==1)
					{
						this.statistiques();
						System.out.println("\nNote minimale :"+this.getMin());
						System.out.println("\nNote maximale :"+this.getMax());
						System.out.println("\nMoyenne classe :"+this.getMoyenne());
					}
				}
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
