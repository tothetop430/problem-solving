package practiceproblems.bitmanipulations;

public class NumberOfSetBits {

    public int numSetBits(int A) {
        int count = 0;
        while(A > 0) {
            count += A&1;
            A = A>>1;
        }
        return count;
    }

}
