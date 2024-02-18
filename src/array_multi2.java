
public class array_multi2 {
	public static void main(String args[]) {
		int[][] myno = {{1,2,3,4},{5,6,7,8,9}};
		
		for(int i=0; i< myno.length; i++) {
			for(int j=0; j< myno[i].length; j++) {
				System.out.println(myno[i][j]);
			}
		}
	}
}
