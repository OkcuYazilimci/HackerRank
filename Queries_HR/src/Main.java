import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of lines
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>(); // to store lines as ArrayLists

        // Read input lines
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt(); // number of integers in the line
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                line.add(sc.nextInt()); // add integers to the line ArrayList
            }
            lines.add(line); // add the line to lines ArrayList
        }

        int q = sc.nextInt(); // number of queries

        // Process queries
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(); // line number
            int y = sc.nextInt(); // position in the line

            if (x > 0 && x <= n && y > 0 && y <= lines.get(x - 1).size()) {
                System.out.println(lines.get(x - 1).get(y - 1)); // print the number at the given position
            } else {
                System.out.println("ERROR!"); // print ERROR! if position is out of bounds
            }
        }

        sc.close();
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
}
