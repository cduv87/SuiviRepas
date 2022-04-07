package fr.eni.tprepas.bo;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Repas {
	int id;
	LocalDate date;
	LocalTime time;
	Ingredients ingredients;
	boolean condition;
	
	public Repas() {

		this.condition = false;
	}
	
	public Repas(LocalDate date, LocalTime time, Ingredients ingredients) {
		super();
		this.date = date;
		this.time = time;
		this.ingredients = ingredients;
		this.condition = false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	

	public boolean isCondition() {
		return condition;
	}


	public void setCondition(boolean condition) {
		this.condition = condition;
	}

	public Ingredients getIngredients() {
		return ingredients;
	}

	public void setIngredients(Ingredients ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		String print = "";
		if (ingredients != null) {
			print = "Repas " + id + " : date=" + date + ", time=" + time + "  " + ingredients;
		}
			
		if (ingredients == null) {
			print = "Repas " + id + " : date=" + date + ", time=" + time + "  ";
		}
		return print;
	}

	
	
}
