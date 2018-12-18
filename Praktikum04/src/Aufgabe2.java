
public class Aufgabe2 {

	public static void main(String[] args) {
		
		//Eingabe Größe des Arrays
		StdOut.println("Wie gross soll das Array sein?");
		int n = StdIn.readInt();
		
		//Deklaration und Initialiserung des Arrays
		double [] darray = new double[n];
		
		//for-schleife um jeden Wert vom Benutzer eingeben zu lassen
		for(int i=0; i<darray.length; i++){
			StdOut.println("Geben Sie die " + (i+1) + ". Zahl ein: ");
			int a = StdIn.readInt();
			darray[i] = a;
		}
		
		//Initialiserung und Deklaration der Variablen
		double min = darray[0];
		double max = darray[0];
		double mittelwert = 0;
		
		//"Methode" für Min und Max wert, mittelwert --> werte aufaddieren
		for(int i=0; i<darray.length; i++){
			
			if(min>darray[i]) {
				min = darray[i];
			}
			if(max<darray[i]) {
				max = darray[i];
			}
			
			mittelwert += darray[i];
		}
		
		//Berechnung Mittelwert durch die Arraylänge
		mittelwert = mittelwert/darray.length;
		
		//Ausgabe der Werte 
		StdOut.println("Maximalwert: " + max + " Minimalwert: " + min + " Mittelwert: " + mittelwert);
	}

}
