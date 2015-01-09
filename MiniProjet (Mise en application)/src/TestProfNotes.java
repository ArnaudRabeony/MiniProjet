

public class TestProfNotes {

	public static void main(String args[])
	{
		Note n=new Note();
		n.setValeur(10);
		n.setCommentaire("com");
		Etudiant e=new Etudiant("Test","TestPrenom",n);
		System.out.println(e);
		e.getAction().agir();
		//System.out.println(e);
	}
}
