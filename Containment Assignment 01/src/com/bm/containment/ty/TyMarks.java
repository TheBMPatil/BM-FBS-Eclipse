package com.bm.containment.ty;

public class TyMarks {
	private int theory;
	private int practical;

	public TyMarks(int theory, int practical) {
		this.theory = theory;
		this.practical = practical;
	}

	public int getTheory() {
		return theory;
	}

	public void setTheory(int theory) {
		this.theory = theory;
	}

	public int getPractical() {
		return practical;
	}

	public void setPractical(int practical) {
		this.practical = practical;
	}

	public int getTotalMarks() {
		return theory + practical;
	}
}
