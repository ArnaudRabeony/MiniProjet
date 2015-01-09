package org.gradle;

public class Consulter implements Action {
 
	 public Utilisateur getU() {
		return u;
	}

	public void setU(Utilisateur u) {
		this.u = u;
	}

	public Utilisateur u;
	 
	 public Consulter(Utilisateur u){
		 this.u = u;
	 }
	
	 public void agir()
	 {
		  System.out.println("\t* * * * * * * * * * Etudiant : "+this.u.getNom() +" "+this.u.getPrenom()+" * * * * * * * * *\n");
		  System.out.println("Classement : "+((Etudiant)this.u).getClassement());
		  System.out.println("Note : "+((Etudiant)this.u).getNote().toString());
	 }
	}
