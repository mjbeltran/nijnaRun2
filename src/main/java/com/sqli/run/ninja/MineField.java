package com.sqli.run.ninja;

import java.util.ArrayList;
import java.util.List;

public class MineField {

	private List<String> listMines = new ArrayList<String>();

	private Ninja ninja = new Ninja();

	public String print() {

		StringBuilder stringBuilder = new StringBuilder();

		if (listMines.size() > 0 && listMines.get(listMines.size() - 1).equals("P")) {
			stringBuilder.append("Level completed");
		} else {
			for (String mine : listMines) {
				stringBuilder.append(mine);
			}
		}
		return stringBuilder.toString();
	}

	public List<String> getListMines() {
		return listMines;
	}

	public void setListMines(List<String> listMines) {
		this.listMines = listMines;
	}

	public Ninja getNinja() {
		return ninja;
	}

	public void setNinja(Ninja ninja) {
		this.ninja = ninja;
	}

}
