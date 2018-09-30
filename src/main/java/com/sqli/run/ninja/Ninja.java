package com.sqli.run.ninja;

import java.util.ArrayList;
import java.util.List;

public class Ninja {

	private MineField currentMineFieldNinja;
	private boolean knowSwing;

	public void startIn(MineField mineField) {

		this.currentMineFieldNinja = mineField;

		List<String> minesField = mineField.getListMines();
		List<String> listWithNinja = new ArrayList<>();
		listWithNinja.add(Constants.NINJA);
		listWithNinja.addAll(minesField);
		mineField.setListMines(listWithNinja);
	}

	public void cross() {

		List<String> newFieldStatus = new ArrayList<>();
		int toCross = 0;
		for (String mineOrNinjaRiver : currentMineFieldNinja.getListMines()) {

			if (Constants.BLOCK_RIVER.equals(mineOrNinjaRiver) && !this.isKnowSwing()) {
				throw new CannotPassException();
			}
			if (Constants.NINJA.equals(mineOrNinjaRiver)) {
				toCross = 1;
			}
			if (Constants.BLOCK_ONE_MINE.equals(mineOrNinjaRiver) || Constants.BLOCK_TWO_MINE.equals(mineOrNinjaRiver)
					|| Constants.BLOCK_THREE_MINE.equals(mineOrNinjaRiver)
					|| (Constants.BLOCK_RIVER.equals(mineOrNinjaRiver) && this.isKnowSwing())) {
				newFieldStatus.add(mineOrNinjaRiver);
				if (toCross == 1) {
					newFieldStatus.add("P");
					toCross = 0;
				}
			}
		}

		this.currentMineFieldNinja.setListMines(newFieldStatus);
	}

	public void learnSwimming() {
		this.knowSwing = true;
	}

	public boolean isKnowSwing() {
		return knowSwing;
	}

	public void setKnowSwing(boolean knowSwing) {
		this.knowSwing = knowSwing;
	}

}
