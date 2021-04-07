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
	
	public void addPerson(IdType idType, String id, int day) throws MinorException, PicoCedulaException{
		
		if(idType==IdType.TI) {
			throw new MinorException();
		}
		else {
			if(returnPenultimateNumber(id)%2==0) {//si el penultimo digito es par
				if(day%2==0) {
					throw new PicoCedulaException();
				}
				else {// si el penultimo digito es par y el dia es impar
					peopleWhoEntered.add(new Person(idType, id));
				}
			}
			else {//si el penultimo digito es impar
				if(day%2!=0) {
					throw new PicoCedulaException();
				}
				else {// si el penultimo digito es impar y el dia es par
					peopleWhoEntered.add(new Person(idType, id));
				}
			}
		}
		quantityOfPeople++;// Asi tenga TI o alguna otra
	}
	
	public int returnPenultimateNumber(String cadena) {
		int number=-1;
		String[] parts = cadena.split("|");
		number=Integer.parseInt(parts[parts.length-2]);
		return number;
		
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
	
	public IdType returnIdType(String type) {
		IdType idType=null;
		if(type.equals("1")) {
			idType=IdType.CC;
		}
		else if(type.equals("2")) {
			idType=IdType.TI;
		}
		else if(type.equals("3")) {
			idType=IdType.PP;
		}
		else if(type.equals("4")) {
			idType=IdType.CE;
		}
		
		return idType;
	}
	
	
}
