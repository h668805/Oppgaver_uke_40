package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;

	public Varelager(int n) {
		varer = new Vare[n];
		antall = 0;
	}

	public Vare[] getVarer() {

		return varer;
	}

	public boolean leggTilVare(Vare v) {
		if (antall < varer.length) {
			varer[antall] = v;
			antall++;
			return true;
		} else
			return false;
	}

	public boolean leggTil(int varenr, String navn, double pris) {
		Vare v = new Vare(varenr, navn, pris);

		return leggTilVare(v);
	}

	public Vare finnVare(int varenr) {
		for (int i = 0; i < varer.length; i++) {
			if (varer[i].getVarenr() == varenr)
				return varer[i];
		}
		return null;
	}

	private String SEP = "=================================";

	public void printVarelager() {
		System.out.println(SEP);
//		for (int i = 0; i < varer.length; i++) {
//			System.out.print("Vare [varenr=" + i);
//			System.out.print(", navn=" + varer[i].getNavn());
//			System.out.println(", pris=" + varer[i].getPris() + "]");
		for (Vare vare : varer) {
			System.out.println(vare.toString());
		}
		System.out.println(SEP);
	}

}
