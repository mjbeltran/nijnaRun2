package com.sqli.run.ninja;

import java.util.ArrayList;
import java.util.List;

public class MineFieldBuilder {

	private List<String> listMines = new ArrayList<String>();

	public MineFieldBuilder addMines(int size) {

		if (size >= Constants.NUM_MAX_MINES_BLOCK) {
			throw new CannotPassException();
		}
		String mines = new String();
		for (int i = 1; i <= size; i++) {
			mines = mines + Constants.MINE;
		}
		mines = Constants.SEPARARTOR + mines + Constants.SEPARARTOR;
		listMines.add(mines);
		return this;
	}

	public MineFieldBuilder addRiver() {
		StringBuilder river = new StringBuilder();
		river.append(Constants.SEPARARTOR).append(Constants.RIVER).append(Constants.SEPARARTOR);
		listMines.add(river.toString());
		return this;
	}

	public MineField build() {
		MineField mineField = new MineField();
		mineField.setListMines(listMines);
		return mineField;
	}

}
