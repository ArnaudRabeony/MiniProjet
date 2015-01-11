import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;


public class TestEditer extends TestCase{

	@Test
	public void testEdit() throws Exception{
	Professeur p = new Professeur(2,"TestProf","testPrenomProf","Maths");
	
	Etudiant e=new Etudiant("Blabal","Blabzezrzr");
	Etudiant e1=new Etudiant("Blabal121","Blabzezrzr121");
	p.getAction().agir();
	//ed.agir(e);
	}

}
