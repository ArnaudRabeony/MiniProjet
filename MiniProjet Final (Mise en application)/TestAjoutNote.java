import java.util.Scanner;


public class TestAjoutNote {

	public static void main(String args[])
	{
		
			Professeur p=new Professeur("Nom Prof", "Prenom Prof");
			Etudiant e=new Etudiant("Eleve1","Prenom1");
			Etudiant e1=new Etudiant("Eleve2","Prenom2");
			p.getGrp().getEleves().add(e);
			p.getGrp().getEleves().add(e1);
			
			System.out.println("1 - Editer toutes les notes\n2 - Selectionner élève parmi liste");
			Scanner sc = new Scanner(System.in);
			int choix = sc.nextInt();
			
			switch(choix)
			{
			case 1 :
				p.getAc().agir();
			break;
			
			case 2 :
				
				System.out.println("\n* * * * * * * * * * * * Liste des étudiants * * * * * * * * * * *\n\n");
				for( Object o : p.getGrp().getEleves())
				{	
					System.out.print(((Etudiant)o).getNom()+((Etudiant)o).getPrenom());
					System.out.println(" : Editer note ?\n\t\t1 - Oui\n\t\t2 - Non");
					int s=sc.nextInt();
					if(s==1)
					{
						((Editer)p.getAc()).noter(((Etudiant)o));
					}
				}		
			break;

			default :
				System.out.println("Choix Invalide");
			break;
			
			}
			//ed.agir(e);
	}
}
