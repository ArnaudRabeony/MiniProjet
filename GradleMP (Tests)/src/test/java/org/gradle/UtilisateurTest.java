package org.gradle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class UtilisateurTest {

	@Test
	 public void constructionUtilisateurNomPrenom() {
	        Utilisateur e = new Utilisateur("Larry","Cross");
	        assertEquals("Larry", e.getNom());
	        assertEquals("Cross", e.getPrenom());
	    }
	
	@Test
	 public void constructionUtilisateurNomPrenomAction() {
			
			Utilisateur e = new Utilisateur("Larry","Cross");
			Action a=new Editer(e);
			Utilisateur u=new Utilisateur(((Utilisateur)e).getNom(), ((Utilisateur)e).getPrenom(),a);
	        assertEquals("Larry", u.getNom());
	        assertEquals("Cross", u.getPrenom());
			assertFalse(((Utilisateur)e).getAc() instanceof Editer);
		}
	
	
	@Test
	 public void constructionUtilisateurDefaut() {
	        Utilisateur e = new Utilisateur();
			assertNull(e.getPrenom());
			assertNull(e.getNom());
			assertNull(e.getAc());
	    }
}

