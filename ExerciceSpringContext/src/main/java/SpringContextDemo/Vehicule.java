package SpringContextDemo;

import org.springframework.stereotype.Component;


@Component
public class Vehicule implements Voiture {
private String couleur;
private Float poid;


public Vehicule() {
	
}


public Vehicule(String couleur, Float poid) {
	super();
	this.couleur = couleur;
	this.poid = poid;
}


public String getCouleur() {
	return couleur;
}


public void setCouleur(String couleur) {
	this.couleur = couleur;
}


public Float getPoid() {
	return poid;
}


public void setPoid(Float poid) {
	this.poid = poid;
}


@Override
public String toString() {
	return "Vehicule [couleur=" + couleur + ", poid=" + poid + "]";
}



}
