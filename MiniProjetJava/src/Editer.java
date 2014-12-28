import java.util.Scanner;

public class Editer extends Action {
	
    public Editer(Utilisateur u)
    {
  	  super(u);
    }
    
    public void agir()
    {
  	  	System.out.println("\t* * * * * * * * * * Professeur : "+((Professeur)u).getNom() +" "+((Professeur)u).getPrenom()+" * * * * * * * * *\n");
    	System.out.println("\n\nEditer note de tous les étudiants");
    	
    	//int i=0;
	    	for(Object e : ((Professeur)u).getListeEtud())
	    	{
	    		//System.out.println("test"+i);
	    		//i=i+1;
	    		this.noter((Etudiant)e);
	    	}
	    	
	   System.out.println("\nRécapitulatif carnet de notes");
		for(Object e : ((Professeur)u).getListeEtud())
    	{
			System.out.println(((Etudiant)e).getNom()+((Etudiant)e).getPrenom() + " : "+ ((Etudiant)e).getNote() );
    	}
    }
    
    public void noter(Etudiant e)
    {
    	Scanner sc=new Scanner(System.in);    	
    	
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
