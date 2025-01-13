package com.bm.containment.sy;

public class SyMarks {

	private int computerTotal;
	private int electronicsTotal;
	private int mathsTotal;

	public SyMarks(int computerTotal, int mathsTotal, int electronicsTotal) {

		this.computerTotal = computerTotal;
		this.mathsTotal = mathsTotal;
		this.electronicsTotal = electronicsTotal;
	}

	public int getComputerTotal() {
		return computerTotal;
	}

	public void setComputerTotal(int computerTotal) {
		this.computerTotal = computerTotal;
	}

	public int getMathsTotal() {
		return mathsTotal;
	}

	public void setMathsTotal(int mathsTotal) {
		this.mathsTotal = mathsTotal;
	}

	public int getElectronicsTotal() {
		return electronicsTotal;
	}

	public void setElectronicsTotal(int electronicsTotal) {
		this.electronicsTotal = electronicsTotal;
	}

	public int getTotalMarks() {
		return computerTotal + mathsTotal + electronicsTotal;
	}

}
