import java.util.Scanner;

/*
 *NOUVEAU 
 */

public class Editer implements Action {
	
	public Utilisateur u;
	
    public Editer(Utilisateur u){
    	this.u = u;
    }
    
	public void agir()
    {
    	System.out.println(" 1 - Editer toutes les notes\n 2 - Selectionner élève parmi liste\n");
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();
		
		switch(choix)
		{
		case 1 :
			System.out.println("\t* * * * * * * * * * Professeur : "+this.u.getNom() +" "+this.u.getPrenom()+" * * * * * * * * *\n");
	    	System.out.println("\n\nEditer note de tous les étudiants");
	    	
	    	//int i=0;
		    	for(Etudiant e : ((Professeur)this.u).getGrp().getEleves())
		    	{
		    		//System.out.println("test"+i);
		    		//i=i+1;
		    		{
		    	    	
		    	    	System.out.print("\nSaisir note de "+e.getPrenom()+" "+e.getNom()+" : ");
		    	    	Note n = new Note();
		    	    	n.setValeur(sc.nextInt());
		    	       	System.out.println("\nCommenter note de "+e.getPrenom()+" "+e.getNom()+" ?\n1 - oui\n2 - non");
		    	    	
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
		    	        	System.out.println("\t Fin Ã©dition");
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
			for(Etudiant e : ((Professeur)this.u).getGrp().getEleves())
	    	{
				System.out.println(e.getNom()+e.getPrenom() + " : "+ e.getNote() );
	    	}
		break;
		
		case 2 :
			
			System.out.println("\n* * * * * * * * * * * * Liste des étudiants * * * * * * * * * * *\n\n");
			for(Etudiant e : ((Professeur)this.u).getGrp().getEleves())
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
				        	System.out.println("\t Fin Ã©dition");
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
		
		}
	
		((Professeur)this.u).getGrp().statistiques();
		System.out.println("\nNote minimale :"+((Professeur)this.u).getGrp().getMin());
		System.out.println("\nNote maximale :"+((Professeur)this.u).getGrp().getMax());
		System.out.println("\nMoyenne classe :"+((Professeur)this.u).getGrp().getMoyenne());
    }
				
}
