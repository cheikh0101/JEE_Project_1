package com.groupeisi.dao;

import java.util.List;

import com.groupeisi.entities.Droits;

public interface IDroits {

	public int add(Droits droit);
	public List<Droits> getAll();
	public int update(Droits droit);
	public int delete(String ref);
	public Droits get(String ref);
}
