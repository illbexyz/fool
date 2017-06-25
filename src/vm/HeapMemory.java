package vm;

public class HeapMemory {

    private HeapMemoryCell[] freelist;
    private HeapMemoryCell head;

    public HeapMemory(int size) {
        freelist = new HeapMemoryCell[size];

        // L'ultimo elemento della lista punta a null
        freelist[size - 1] = new HeapMemoryCell(0, null);

        // Tutti gli altri puntano al successivo
        for (int i = size - 2; i >= 0; i++) {
            freelist[i] = new HeapMemoryCell(0, freelist[i + 1]);
        }

        // Il primo elemento e' la testa della lista
        head = freelist[0];
    }

    /**
     * Alloca un'area di memoria
     *
     * @param size La dimensione della memoria da allocare
     * @return Una lista di celle di memoria
     */
    public HeapMemoryCell allocate(int size) {
        assert size > 0;

        // Il primo elemento da restituire e' la testa della lista
        HeapMemoryCell res = head;

        // La testa della lista diventa il primo elemento dopo l'ultimo restituito (alla fine del ciclo)
        HeapMemoryCell lastItem = head;
        for (int i = 0; i < size; i++) {
            lastItem = lastItem.next;
        }
        head = lastItem.next;

        // L'ultimo elemento restituito deve puntare a null
        lastItem.next = null;
        return res;
    }

    /**
     * Dealloca la memoria passata come parametro, che torna ad essere disponibile come spazio di allocazione
     *
     * @param firstCell La lista di celle di memoria
     */
    public void deallocate(HeapMemoryCell firstCell) {
        HeapMemoryCell curr = firstCell;

        // L'ultimo elemento della lista restituita va fatto puntare a head
        while (curr.next != null) {
            curr.value = 0;
            curr = curr.next;
        }
        curr.value = 0;
        curr.next = head;

        // La testa della freelist invece sara' il primo elemento della lista deallocata
        head = firstCell;
    }

}