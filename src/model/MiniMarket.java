package model;

import java.util.ArrayList;
import java.util.List;

import exceptions.MinorException;
import exceptions.PicoCedulaException;

public class MiniMarket {
	//atributes
	private int quantityOfPeople;
	//relations
	private List<Person> peopleWhoEntered;
	
	public MiniMarket() {
		quantityOfPeople=0;
		peopleWhoEntered=new ArrayList<>();
	}
	
	

	public int getQuantityOfPeople() {
		return quantityOfPeople;
	}

	public void setQuantityOfPeople(int quantityOfPeople) {
		this.quantityOfPeople = quantityOfPeople;
	}

	public List<Person> getPeopleWhoEntered() {
		return peopleWhoEntered;
	}

	public void setPeopleWhoEntered(List<Person> peopleWhoEntered) {
		this.peopleWhoEntered = peopleWhoEntered;
	}
	
	
	
}
