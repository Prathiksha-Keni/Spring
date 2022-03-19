package com.xworkz.newspaper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "newspaper_details")
@NamedQuery(name = "getNewspaperPriceByName", query = "select price from NewspaperEntity where name=:Name")
@NamedQuery(name = "getNewspaperEntityByPrice", query = "FROM NewspaperEntity where price IN (:Price)")
@NamedQuery(name = "updateNewspaperNameByPrice", query = "UPDATE NewspaperEntity SET newspaperName=:NewspaperName WHERE price=:Price")
@NamedQuery(name = "deleteNewspaperEntityByName", query = "DELETE FROM NewspaperEntity WHERE name=:Name")
public class NewspaperEntity {

	@Column(name = "id")
	@Id
	@GenericGenerator(name = "primaryKey", strategy = "increment")
	@GeneratedValue(generator = "primaryKey")
	private int id;
	
	@Column(name = "newspaperName")
	private String newspaperName;
	
	@Column(name = "noOfPages")
	private String noOfPages;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "price")
	private double price;

	public NewspaperEntity() {
		super();

	}

	public NewspaperEntity( String newspaperName, String noOfPages, String language, double price) {
		super();
		
		this.newspaperName = newspaperName;
		this.noOfPages = noOfPages;
		this.language = language;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNewspaperName() {
		return newspaperName;
	}

	public void setNewspaperName(String newspaperName) {
		this.newspaperName = newspaperName;
	}

	public String getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(String noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewspaperEntity [id=" + id + ", newspaperName=" + newspaperName + ", noOfPages=" + noOfPages
				+ ", language=" + language + ", price=" + price + "]";
	}

}
