import java.util.Scanner;

public class Editer implements Action {

	private Professeur p;
	
   
    
    public Editer ()
    {
    	System.out.println("\t* * * * * * * * * * Professeur : "+this.getP().getNom()+" * * * * * * * * *\n");
    	System.out.println("\n\nEditer note de tous les étudiants");
    	
    	for(Etudiant e : p.getListeEtud())
    	{
    		this.noter(e);
    	}
    }
    
    public void noter(Etudiant e)
    {
    	Scanner sc=new Scanner(System.in);    	

    	System.out.println("\t* * * * * * * * * * Professeur : "+this.getP().getNom()+" * * * * * * * * *\n");
    	
    	System.out.print("\nSaisir note de "+e.getPrenom()+""+e.getNom()+" :");
    	e.getNote().setValeur(sc.nextInt());
    	System.out.print("\nCommenter note de "+e.getPrenom()+""+e.getNom()+" ?\n1 - oui\n2 - non :");
    	
    	int v=sc.nextInt();
    	
    	switch(v)
    	{

    	case 1 :
        	System.out.println(" Saisir commentaire : ");
        	String s = sc.nextLine();
        	e.getNote().setCommentaire(s);
        	System.out.println("MAJ Commentaire");
        break;
        
    	case 2 :
        	System.out.println("\t Fin édition");
        break;
        
        default :
        	System.out.println("Choix invalide");
        break;
    	}
    	
    }
    
    public Professeur getP() {
		return p;
	}

	public void setP(Professeur p) {
		this.p = p;
	}

	public void agir()
	{
	}


}
