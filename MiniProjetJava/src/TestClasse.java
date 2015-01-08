import java.util.Scanner;


public class TestClasse {

	public static void main(String[] args)
	{
		Classe c=new Classe();
		
		boolean b=true;
		do
		{
		c.choixUtilisateur();
		System.out.println("\nPermettre à un autre utilisateur d'utiliser l'outil de suivi de notes ?\n1 - Oui\n2 - Non");
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		
			if(choix==2)
			{
				b=false;
			}
			
		}while(b);		
	}
}
