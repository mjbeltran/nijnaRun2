package com.sqli.run.ninja;

public class Constants {

	public static final String RIVER = "~~~";
	public static final String MINE = "o";
	public static final String NINJA = "P";
	public static final String SEPARARTOR = "-";
	
	public static final int NUM_MAX_MINES_BLOCK = 4;
	
	
	public static final String BLOCK_ONE_MINE = Constants.SEPARARTOR + Constants.MINE + Constants.SEPARARTOR;
	public static final String BLOCK_TWO_MINE = Constants.SEPARARTOR + Constants.MINE + Constants.MINE + Constants.SEPARARTOR;
	public static final String BLOCK_THREE_MINE = Constants.SEPARARTOR + Constants.MINE + Constants.MINE+ Constants.MINE+ Constants.SEPARARTOR;
	public static final String BLOCK_RIVER = Constants.SEPARARTOR.toString() + Constants.RIVER.toString()+ Constants.SEPARARTOR.toString();

}
