package com.epicode.GodfathersPizza.classes;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	private List<PizzaBase> menuPizza = new ArrayList<PizzaBase>();
	private List<Drink> menuDrink = new ArrayList<Drink>();

	
	public List<PizzaBase> getMenuPizza() {
		return menuPizza;
	}

	public List<Drink> getMenuDrink() {
		return menuDrink;
	}


}
