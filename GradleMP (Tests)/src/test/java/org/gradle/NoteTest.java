package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NoteTest {

	@Test
	 public void initNoteDefaut() {
	       Note n=new Note();
	        assertEquals(null, n.getCommentaire());
	        assertEquals(0, n.getValeur());
	    }
	
	@Test
	 public void initNoteChampAChamp() {
	       Note n=new Note(5,"nul");
	        assertEquals("nul", n.getCommentaire());
	        assertEquals(5, n.getValeur());
	    }

}