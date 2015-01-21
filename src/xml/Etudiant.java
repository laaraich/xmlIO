package xml;

import java.io.Serializable;

public class Etudiant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nom;

	public Etudiant(String nom) {
		this.nom = nom;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "nom:" + nom;
	}
}
