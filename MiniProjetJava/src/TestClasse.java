import java.util.Scanner;


public class TestClasse {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		Professeur p=new Professeur("Ghesmoune","Mohammed");
		
		boolean b=true;
		do
		{
		p.getGrp().choixUtilisateur();
		System.out.println("\nPermettre à un autre utilisateur d'utiliser l'outil de suivi de notes ?\n1 - Oui\n2 - Non");
		int choix=sc.nextInt();
		
			if(choix==2)
			{
				b=false;
			}
			
		}while(b);		
	}
}
