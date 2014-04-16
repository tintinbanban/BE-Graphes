package core;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Noeud {
	private float longitude;
	private float latitude;

	private int nbRoutesSortantes;
	private ArrayList<Arc> listRoutesSortantes;

	
	public Noeud() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Noeud(DataInputStream dis) throws IOException {
		this.longitude = ((float)dis.readInt ()) / 1E6f ;
		this.latitude = ((float)dis.readInt ()) / 1E6f ;
		this.nbRoutesSortantes = dis.readUnsignedByte() ;
		this.listRoutesSortantes = new ArrayList<Arc>();
	}

	// Getters & Setters
	public float getLongitude() {
		return longitude;
	}


	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}


	public float getLatitude() {
		return latitude;
	}


	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}


	public int getNbRoutesSortantes() {
		return nbRoutesSortantes;
	}


	public void setNbRoutesSortantes(int nbRoutesSortantes) {
		this.nbRoutesSortantes = nbRoutesSortantes;
	}


	public ArrayList<Arc> getListRoutesSortantes() {
		return listRoutesSortantes;
	}


	public void setListRoutesSortantes(ArrayList<Arc> listRoutesSortantes) {
		this.listRoutesSortantes = listRoutesSortantes;
	}
	
	public void ajouterRouteSortante(Arc arc) {
		this.listRoutesSortantes.add(arc);
		this.nbRoutesSortantes ++;
	}
	
}
