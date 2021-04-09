package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.MinorException;
import exceptions.PicoCedulaException;

public class MiniMarketTest {
	MiniMarket miniMarket;
	
	public void setupScenary1() {
		miniMarket= new MiniMarket();
	}
	
	@Test
	public void addCorrectPersonTest() {
		setupScenary1();
		
		IdType idType= IdType.CC;
		String id="1027800108";
		int day= 1;
		
		try {
			miniMarket.addPerson(idType, id, day);
		} catch (MinorException e) {
			e.printStackTrace();
		} catch (PicoCedulaException e) {
			e.printStackTrace();
		}
		
		assertEquals(miniMarket.getPeopleWhoEntered().size(), 1);
		assertEquals(miniMarket.getQuantityOfPeople(), 1);
		
	}
	@Test
	public void addMinorPersonTest() {
		setupScenary1();
		
		IdType idType= IdType.TI;
		String id="1027800108";
		int day= 1;
		
		try {
			miniMarket.addPerson(idType, id, day);
		} catch (MinorException e) {
		} catch (PicoCedulaException e) {
		}
		
		assertEquals(miniMarket.getPeopleWhoEntered().size(), 0);
		assertEquals(miniMarket.getQuantityOfPeople(), 1);
		
	}
	@Test
	public void addNoDayPersonTest() {
		setupScenary1();
		
		IdType idType= IdType.CC;
		String id="1027800108";
		int day= 2;
		
		try {
			miniMarket.addPerson(idType, id, day);
		} catch (MinorException e) {
			e.printStackTrace();
		} catch (PicoCedulaException e) {
			e.printStackTrace();
		}
		
		assertEquals(miniMarket.getPeopleWhoEntered().size(), 0);
		assertEquals(miniMarket.getQuantityOfPeople(), 1);
		
	}

}
