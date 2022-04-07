package fr.eni.tprepas.bo;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {
	
	List<String> ListeIngredients;
	
	public Ingredients(List<String> listeIngredients) {
		super();
		ListeIngredients = listeIngredients;
	}
	
	public Ingredients() {

	}

	public List<String> getListeIngredients() {
		return ListeIngredients;
	}

	public void setListeIngredients(List<String> listeIngredients) {
		ListeIngredients = listeIngredients;
	}

	@Override
	public String toString() {
		return " ListeIngredients=" + ListeIngredients;
	}

	
	
}
