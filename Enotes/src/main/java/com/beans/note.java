package com.beans;

public class note {
	@Override
	public String toString() {
		return "note [idNote=" + idNote + ", user=" + user + ", title=" + title + ", content=" + content + "]";
	}
	private int idNote;
	
	public note(int idNote, com.beans.user user, String title, String content) {
		super();
		this.idNote = idNote;
		this.user = user;
		this.title = title;
		this.content = content;
	}
	private user user;
	private String title;
	private String content;
	
	public note() {}
	public int getIdNote() {
		return idNote;
	}
	public void setIdNote(int idNote) {
		this.idNote = idNote;
	}
	public user getUser() {
		return user;
	}
	public void setUser(user user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
    
}
