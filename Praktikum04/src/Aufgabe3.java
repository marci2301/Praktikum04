
public class Aufgabe3 {

	public static void main(String[] args) {
		
		StdOut.println("Wie gross soll das Array sein?");
		int i = StdIn.readInt();
		
		int[][] array = new int [i][i];
		
		for(int reihe = 0; reihe <array.length; reihe++) {
			for(int spalte = 0; spalte < array.length; spalte++) {
				if(reihe == spalte) {
					array[reihe][spalte] = reihe+1;
				}
				else {
					array[reihe][spalte] = 0;
				}
			}
		}
		
		for(int reihe = 0; reihe <array.length; reihe++) {
			for(int spalte = 0; spalte < array.length; spalte++) {
				StdOut.print(array[reihe][spalte] + " ");
			}
			StdOut.println("");
		}
	}
}
