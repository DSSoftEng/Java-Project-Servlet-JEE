package com.entite;

public class entity {
	private int id;
	private String Name;
	private String Todo;
	private String Status;
	public entity() {
		
	}
	public String getName() {
		return this.Name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTodo() {
		return Todo;
	}
	public void setTodo(String todo) {
		Todo = todo;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public void setName(String name) {
		Name = name;
	}
	public entity(int id, String name, String todo, String status) {
		super();
		this.id = id;
		Name = name;
		Todo = todo;
		Status = status;
	}
	@Override
	public String toString() {
	    // Retourne une description significative de l'objet
	    return String.format("entity{id=%d, name='%s', todo='%s', status='%s'}", id, Name, Todo, Status);
	}

}
