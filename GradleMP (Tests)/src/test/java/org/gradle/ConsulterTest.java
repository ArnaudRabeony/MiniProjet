package org.gradle;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class ConsulterTest {

	@Test
	public void consultationEtudiant()
	{
		Note n= new Note(12,"Hooonnnn !");
        Etudiant e = new Etudiant("Larry","Cross",n);
        
		Consulter c= new Consulter(e);
		c.agir();
		
		assertEquals(e,c.getU());
	}
}
