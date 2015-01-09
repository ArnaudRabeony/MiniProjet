package org.gradle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class EtudiantTest {

	@Test
	 public void constructionEtudiantAvecNomPrenom() {
	        Etudiant e = new Etudiant("Larry","Cross");
	        assertEquals("Larry", e.getNom());
	        assertEquals("Cross", e.getPrenom());
	    }
	
	@Test
	 public void constructionEtudiantAvecNomPrenomNote() {
			Note n= new Note(12,"Hooonnnn !");
	        Etudiant e = new Etudiant("Larry","Cross",n);
	        assertEquals("Larry", e.getNom());
	        assertEquals("Cross", e.getPrenom());
	        assertEquals(12, e.getNote().getValeur());
	        assertEquals("Hooonnnn !", e.getNote().getCommentaire());
	    }
	
	
	@Test
	 public void constructionEtudiantDefaut() {
	        Etudiant e = new Etudiant();
	        assertEquals(0, e.getClassement());
	        assertNull(e.getPrenom());
			assertNull(e.getNom());
	        assertEquals(0, e.getNote().getValeur());
	        assertEquals("NP", e.getNote().getCommentaire());
	    }
}

