package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		int minI = 0;

		for (int i = 1; i < varer.length; i++)
			if (varer[i].getPris() < varer[minI].getPris())
				minI = i;

		return varer[minI];
	}

	public static double totalPris(Vare[] varer) {
		double sum = 0;

		for (Vare vare : varer)
			sum += vare.getPris();

		return sum;
	}

	public static int[] finnVarenr(Vare[] varer) {
		int[] varenr = new int[varer.length];

		for (int i = 0; i < varer.length; i++)
			varenr[i] = varer[i].getVarenr();

		return varenr;
	}

	public static double[] finnPrisDifferanser(Vare[] varer) {
		double[] prisDiff = new double[varer.length - 1];
		
		for (int i = 0; i < varer.length - 1; i++)
			prisDiff[i] = varer[i+1].getPris() - varer[i].getPris();
		
		return prisDiff;
	}
}
