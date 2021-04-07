package model;

public class Person {
	//atributes
	private IdType idype;
	private String id;
	
	public Person(IdType idype, String id) {
		this.idype = idype;
		this.id = id;
	}

	public IdType getIdype() {
		return idype;
	}

	public void setIdype(IdType idype) {
		this.idype = idype;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
