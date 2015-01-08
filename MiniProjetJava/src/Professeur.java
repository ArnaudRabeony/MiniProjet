import java.util.ArrayList;
import java.util.Scanner;

public class Professeur extends Utilisateur {

	private int nbEtud;
	private ArrayList<Etudiant> listeEtud;
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
		this.action= new Editer();
	}

	public Professeur (int nbEt,String nom, String pr, String m)
	{
		//this.matiere.setNomMat(m);
		this.setNbEtud(nbEt);
		this.listeEtud=new ArrayList();
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
	
	public void agir()
    {
    	System.out.println("1 - Editer toutes les notes\n2 - Selectionner élève parmi liste\3 - Voir statistiques");
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();
		
		switch(choix)
		{
		case 1 :
			System.out.println("\t* * * * * * * * * * Professeur : "+this.getNom() +" "+this.getPrenom()+" * * * * * * * * *\n");
	    	System.out.println("\n\nEditer note de tous les étudiants");
	    	
	    	//int i=0;
		    	for(Object e : this.getListeEtud())
		    	{
		    		//System.out.println("test"+i);
		    		//i=i+1;
		    		((Editer)this.action).noter((Etudiant)e);
		    	}
		    	
		   System.out.println("\nRécapitulatif carnet de notes");
			for(Object e : this.getListeEtud())
	    	{
				System.out.println(((Etudiant)e).getNom()+((Etudiant)e).getPrenom() + " : "+ ((Etudiant)e).getNote() );
	    	}
		break;
		
		case 2 :
			
			System.out.println("\n* * * * * * * * * * * * Liste des étudiants * * * * * * * * * * *\n\n");
			for( Object o : this.getListeEtud())
			{	
				System.out.print(((Etudiant)o).getNom()+((Etudiant)o).getPrenom());
				System.out.println(" : Editer note ?\n\t\t1 - Oui\n\t\t2 - Non");
				int s=sc.nextInt();
				if(s==1)
				{
					((Editer)this.action).noter(((Etudiant)o));
				}
			}		
		break;

		case 3 : 
			
		
		default :
			System.out.println("Choix Invalide");
		break;
		
		}
    }
}
