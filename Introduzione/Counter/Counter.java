package Introduzione.Counter;

public class Counter {
    private int val;

    public void Reset() {
        val = 0;
    }

    public void Inc() {
        val++;
    }

    public void Dec() {
        val--;
    }

    public int GetValue() {
        return val;
    }

    public void Copy(Counter x) {
        val = x.val;
    }
}
