
public class Aufgabe3 {

	public static void main(String[] args) {
		
		//Eingabe Größe des Arrays
		StdOut.println("Wie gross soll das Array sein?");
		int i = StdIn.readInt();
		
		//Initialisierung und Deklaration des Arrays
		int[][] array = new int [i][i];
		
		//Verschachtelte Schleife einmal für die Reihe und dann Spalte
		for(int reihe = 0; reihe <array.length; reihe++) {
			for(int spalte = 0; spalte < array.length; spalte++) {
				if(reihe == spalte) {      								//wenn spalte = zeile soll er die entsprechende zahl reinschreiben, +1 da im array ab 0 gezählt wird
					array[reihe][spalte] = reihe+1;
				}
				else {
					array[reihe][spalte] = 0;							//sonst immer eine 0 speichern
				}
			}
		}
		
		//Ausgabe des Arrays mittels for-schleife
		for(int reihe = 0; reihe <array.length; reihe++) {
			for(int spalte = 0; spalte < array.length; spalte++) {
				StdOut.print(array[reihe][spalte] + " ");
			}
			StdOut.println("");
		}
	}
}
