package edu.kis.vh.nursery;


/**
 * Klasa implementująca prosty stos liczb całkowitych
 * o stałym rozmiarze.
 *  * Umożliwia dodawanie elementów, sprawdzanie czy stos jest pusty
 * lub pełny, podgląd oraz usuwanie elementów.
 */
public class defaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int EMPTY = -1;

    private final int[] numbers = new int[MAX_SIZE];

    private int index = EMPTY;
    public int getTotal() {
        return index;
    }
    public void countIn(int in) {
        if (!isFull())
            numbers[++index] = in;
    }

    public boolean callCheck() {
        return index == EMPTY;
    }

    public boolean isFull() {
        return index == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[index];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[index--];
    }
}
