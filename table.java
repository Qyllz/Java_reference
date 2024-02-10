
public class table {

	public static void main(String[] args) {
		// array multiplication table activity
		int[][] table = new int[10][10];

        for (int x = 0; x < 10; x++) {
            for (int z = 0; z < 10; z++) {
                table[x][z] = (x + 1) * (z + 1);
                System.out.print(table [x][z] + "\t");
            }
            System.out.println();
        }
    }
}