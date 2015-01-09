package org.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProfesseurTest {

	@Test
	 public void constructionProfAvecNomPrenom() {
	        Professeur p = new Professeur("Larry","Cross");
	        assertEquals("Larry", p.getNom());
	        assertEquals("Cross", p.getPrenom());
	    }
	
	@Test
	 public void constructionProfDefaut() {
        	Professeur e = new Professeur();
        	assertNull(e.getPrenom());
			assertNull(e.getNom());
			assertNull(e.getGrp());
	    }
}
