package com.absa.barclays.eBoxDB.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "db_table")

public class DB {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "db_title")
	private String title;
	
	@Column(name ="db description")
	private String description;
	
	@Column(name = "db_content")
	private String content;
	
	@Column(name = "db_creation")
	private String createdate;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	
	public DB() {}
	
	public DB(String title, String description,String content,String createdate) {
		this.title = title;
		this.description = description;
		this.content = content;
		this.createdate = createdate;
	}

	
}
