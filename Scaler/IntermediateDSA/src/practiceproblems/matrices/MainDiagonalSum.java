package practiceproblems.matrices;

import java.util.ArrayList;
import java.util.List;

public class MainDiagonalSum {

    public int solve(final List<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.get(0).size();
        int sum = 0;
        for(int i=0, j=0; i<rows && j<cols; i++, j++) {
            sum += A.get(i).get(j);
        }
        return sum;
    }

}
