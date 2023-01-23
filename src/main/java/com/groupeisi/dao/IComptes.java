package com.groupeisi.dao;

import java.util.List;

import com.groupeisi.entities.Comptes;

public interface IComptes {

	public int add(Comptes compte);
	public List<Comptes> getAll();
	public int update(Comptes compte);
	public int delete(String ref);
	public Comptes get(String ref);
}
