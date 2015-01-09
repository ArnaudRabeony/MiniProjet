package org.gradle;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Test;

public class EditerTest {

	@Test
	public void editionGroupe()
	{
		Professeur p = new Professeur("Prof", "Prenom");
		//Groupe g=new Groupe(p);
		
		Editer e=new Editer(p);
		
		//e.agir();
		//ArrayList<Etudiant> nvlNotes=p.getGrp().getEleves();
		
		assertEquals(p,e.getU());
		//assertNotEquals(p.getGrp().getEleves(), nvlNotes);
	}
}
