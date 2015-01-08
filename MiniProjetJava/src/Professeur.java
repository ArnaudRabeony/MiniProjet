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
		    	for(Etudiant e : this.listeEtud)
		    	{
		    		//System.out.println("test"+i);
		    		//i=i+1;
		    		{
		    	    	
		    	    	System.out.print("\nSaisir note de "+e.getPrenom()+""+e.getNom()+" : ");
		    	    	Note n = new Note();
		    	    	n.setValeur(sc.nextInt());
		    	       	System.out.println("\nCommenter note de "+e.getPrenom()+""+e.getNom()+" ?\n1 - oui\n2 - non");
		    	    	
		    	    	int v=sc.nextInt();
		    	    	
		    	    	switch(v)
		    	    	{

		    	    	case 1 :
		    	        	System.out.println(" Saisir commentaire : ");
		    	        	String s = sc.nextLine();
		    	        	n.setCommentaire(sc.nextLine());
		    	        	System.out.println("MAJ Commentaire");
		    	        break;
		    	        
		    	    	case 2 :
		    	    		n.setCommentaire("No comment");
		    	        	System.out.println("\t Fin édition");
		    	        break;
		    	        
		    	        default :
		    	    		n.setCommentaire("NP");
		    	        	System.out.println("Choix invalide");
		    	        break;
		    	    	}
		    	    	e.setNote(n);
		    	    }
		    	}
		    	
		   System.out.println("\nRécapitulatif carnet de notes");
			for(Etudiant e : this.listeEtud)
	    	{
				System.out.println(e.getNom()+e.getPrenom() + " : "+ e.getNote() );
	    	}
		break;
		
		case 2 :
			
			System.out.println("\n* * * * * * * * * * * * Liste des étudiants * * * * * * * * * * *\n\n");
			for( Etudiant e : this.listeEtud)
			{	
				System.out.print(e.getNom()+e.getPrenom());
				System.out.println(" : Editer note ?\n\t\t1 - Oui\n\t\t2 - Non");
				int s=sc.nextInt();
				if(s==1)
				{
					{				    	
				    	System.out.print("\nSaisir note de "+e.getPrenom()+""+e.getNom()+" : ");
				    	Note n = new Note();
				    	n.setValeur(sc.nextInt());
				       	System.out.println("\nCommenter note de "+e.getPrenom()+""+e.getNom()+" ?\n1 - oui\n2 - non");
				    	
				    	int v=sc.nextInt();
				    	
				    	switch(v)
				    	{

				    	case 1 :
				        	System.out.println(" Saisir commentaire : ");
				        	n.setCommentaire(sc.nextLine());
				        	System.out.println("MAJ Commentaire");
				        break;
				        
				    	case 2 :
				    		n.setCommentaire("No comment");
				        	System.out.println("\t Fin édition");
				        break;
				        
				        default :
				    		n.setCommentaire("NP");
				        	System.out.println("Choix invalide");
				        break;
				    	}
				    	e.setNote(n);
				    }
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
