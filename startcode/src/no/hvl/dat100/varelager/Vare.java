package no.hvl.dat100.varelager;

public class Vare {

	private int varenr;
	private String navn;
	private double pris;
	
	public Vare(int varenr, String navn, double pris) {
		this.varenr = varenr;
		this.navn = navn;
		this.pris = pris;
		
	}
	
	public int getVarenr() {
		
		return this.varenr;
	}
	
	public void setVarenr(int varenr) {
		
		this.varenr = varenr;
	}
	
	public String getNavn() {
		
		return this.navn;
	}
	
	public void setNavn(String navn) {
		
		this.navn = navn;
	}
	
	public double getPris() {
		
		return this.pris;
	}
	
	public void setPris(double pris) {
		
		this.pris = pris;
	}
	
	public double beregnMoms() {
		
		return (double)this.pris/5.0;
	}
	
	public String toString() {
		
		return "Vare [varenr=" + varenr + ", navn=" + navn + ", pris=" + pris + "]";
	}
	
	public boolean erBilligereEnn(Vare v) {
		
		return this.pris < v.pris;
	}
	
}
