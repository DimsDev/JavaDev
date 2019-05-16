package fr.natsystem.entites;

public class Ellipse {
	private double gdR, ptR, aiR;
	
	public Ellipse() {}

	public Ellipse(double gdR, double ptR) {
		
		this.gdR = gdR;
		this.ptR = ptR;
	}
	
	public double calclerAire() {
		return Math.PI * this.gdR * this.ptR; 
	}

	public double getGdR() {
		return gdR;
	}

	public void setGdR(double gdR) {
		this.gdR = gdR;
	}

	public double getPtR() {
		return ptR;
	}

	public void setPtR(double ptR) {
		this.ptR = ptR;
	}

	public double getAiR() {
		return aiR;
	}

	public void setAiR(double aiR) {
		this.aiR = aiR;
	}

}
