package com.xworkz.newspaper.dao;

public interface NewspaperDAO {
	public void saveNewspaperEntity(Object entity);

	public void getNewspaperPriceByName(String name);

	public void getNewspaperEntityByPrice(String price);

	public void updateNewspaperNameByPrice(String newspaperName, double price);

	public void deleteNewspaperEntityByName(String name);
}
