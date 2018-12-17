
public class Aufgabe2 {

	public static void main(String[] args) {
		
		StdOut.println("Wie gross soll das Array sein?");
		int n = StdIn.readInt();
		
		double [] darray = new double[n];
		
		for(int i=0; i<darray.length; i++){
			StdOut.println("Geben Sie die " + (i+1) + ". Zahl ein: ");
			int a = StdIn.readInt();
			darray[i] = a;
		}
		
		double min = darray[0];
		double max = darray[0];
		double mittelwert = 0;
		
		for(int i=0; i<darray.length; i++){
			
			if(min>darray[i]) {
				min = darray[i];
			}
			if(max<darray[i]) {
				max = darray[i];
			}
			
			mittelwert += darray[i];
		}
		
		mittelwert = mittelwert/darray.length;
		StdOut.println("Maximalwert: " + max + " Minimalwert: " + min + " Mittelwert: " + mittelwert);
	}

}
