import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int _numLine = sc.nextInt();
		int _numCol = sc.nextInt();
		
		int[][] _matrix = new int[_numLine][_numCol];
		
		for(int i = 0; i < _matrix.length; i ++) {
			for(int j = 0; j < _matrix[i].length; j ++) {
				_matrix[i][j] = sc.nextInt();
			}
		}
		
		sysout
		
		int _value = sc.nextInt();
		
		for(int i = 0; i < _matrix.length; i ++) {
			for(int j = 0; j < _matrix[i].length; j ++) {
				if (_matrix[i][j] == _value) {
					System.out.println("Position " + i + "," + j + ":");
					if(j != 0) {
						System.out.println("Left: " + _matrix[i][j-1]);
					}
					if(i != 0) {
						System.out.println("Up: " + _matrix[i-1][j]);
					}
					if(j != (_numCol-1)) {
						System.out.println("Right: " + _matrix[i][j+1]);
					}
					if(i != (_numLine-1)) {
						System.out.println("Down: " + _matrix[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}

}
