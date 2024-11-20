package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	int cat_id;
	String cat_name;
	boolean cat_rent;

	public CatImpl(int id, String name) {
		// TODO: Fill in
		
		cat_id = id;
		cat_name = name;
		cat_rent = false;
	}

	public void rentCat() {
		// TODO: Fill in
		cat_rent = true;
	}

	public void returnCat() {
		// TODO: Fill in
		cat_rent = false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		cat_name = name;
	}

	public String getName() {
		// TODO: Fill in
		return cat_name;
	}

	public int getId() {
		// TODO: Fill in
		return cat_id;
	}

	public boolean getRented() {
		// TODO: Fill in
		return cat_rent;
	}

	public String toString() {
		// TODO: Fill in
		return "ID " + cat_id + ". " + cat_name;
	}

}