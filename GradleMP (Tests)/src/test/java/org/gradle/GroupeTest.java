package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GroupeTest {

	@Test
    public void noteMax() 
    {
		Professeur p=new Professeur("NomProf","PrenomProf");
	    
    	Groupe g=new Groupe(5);
      	g.setProf(p);
     
      	Note n1=new Note(18, "Vrmt Bien");
      	Etudiant e1=new Etudiant("Gradle","Gradur");
      	e1.setNote(n1);
      	g.getEleves().add(e1);
      	
      	Note n=new Note(10, "Bof");
      	Etudiant e2=new Etudiant("7oClock","Undercova");
      	e2.setNote(n);
      	g.getEleves().add(e2);
         	
        assertEquals(18,g.max());
    }
    
	@Test
    public void noteMin() 
    {
		Professeur p=new Professeur("NomProf","PrenomProf");
	    
    	Groupe g=new Groupe(5);
      	g.setProf(p);
     
      	Note n1=new Note(18, "Vrmt Bien");
      	Etudiant e1=new Etudiant("Gradle","Gradur");
      	e1.setNote(n1);
      	g.getEleves().add(e1);
      	
      	Note n=new Note(10, "Bof");
      	Etudiant e2=new Etudiant("7oClock","Undercova");
      	e2.setNote(n);
      	g.getEleves().add(e2);
         	
        assertEquals(10,g.min());
    }
    
	@Test
    public void moyenneClasse() 
    {
    	Professeur p=new Professeur("NomProf","PrenomProf");
        
    	Groupe g=new Groupe(5);
      	g.setProf(p);
     
      	Note n1=new Note(18, "Vrmt Bien");
      	Etudiant e1=new Etudiant("Gradle","Gradur");
      	e1.setNote(n1);
      	g.getEleves().add(e1);
      	
      	Note n=new Note(10, "Bof");
      	Etudiant e2=new Etudiant("7oClock","Undercova");
      	e2.setNote(n);
      	g.getEleves().add(e2);
               	
        assertEquals(14,g.moyenne());
    }
}
