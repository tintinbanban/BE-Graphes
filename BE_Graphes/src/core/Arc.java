package core;

import base.Descripteur;

public class Arc {
	private int zoneSuccesseur;
	private Noeud noeudDestination;
	private Descripteur descripteur;
	private int longueur;
	//private short nbSegments;
	
	
	public Arc(int zoneSuccesseur, Noeud noeudDestination,
			Descripteur descripteur, int longueur) {
		super();
		this.zoneSuccesseur = zoneSuccesseur;
		this.noeudDestination = noeudDestination;
		this.descripteur = descripteur;
		this.longueur = longueur;
	}


	public int getZoneSuccesseur() {
		return zoneSuccesseur;
	}


	public void setZoneSuccesseur(int zoneSuccesseur) {
		this.zoneSuccesseur = zoneSuccesseur;
	}


	public Noeud getNoeudDestination() {
		return noeudDestination;
	}


	public void setNoeudDestination(Noeud noeudDestination) {
		this.noeudDestination = noeudDestination;
	}


	public Descripteur getDescripteur() {
		return descripteur;
	}


	public void setDescripteur(Descripteur descripteur) {
		this.descripteur = descripteur;
	}


	public int getLongueur() {
		return longueur;
	}


	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	
	
	
}
