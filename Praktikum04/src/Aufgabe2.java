
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
		
		for(int i=1; i<darray.length; i++){
			
			double min = Math.min(darray[i-1], darray[i]);
			double max = Math.max(darray[i-1], darray[i]);
			
			double mittelwert = 0; 
			
			mittelwert+= darray[i-1];
		
		}
	}

}
