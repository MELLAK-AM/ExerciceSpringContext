package SpringContextDemo;

public interface Voiture {

	String getCouleur();

	void setCouleur(String couleur);

	Float getPoid();

	void setPoid(Float poid);

	@Override
	String toString();

}