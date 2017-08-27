package technicalProblems;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class InterleavingIterator<T> {
    private LinkedList<Iterator<T>> iterList;

    public InterleavingIterator(Iterator<T>[] iterList) {
        this.iterList = new LinkedList<>();

        for (int i = 0; i < iterList.length; i++) {
            if (iterList[i].hasNext()) this.iterList.add(iterList[i]);
        }
    }

    public T next() throws NoSuchElementException {
        if (!hasNext()) throw new NoSuchElementException();

        Iterator<T> i = this.iterList.removeFirst();

        T val = i.next();

        if(i.hasNext()) this.iterList.addLast(i);

        return val;
    }

    public boolean hasNext() {
        return this.iterList.size() != 0;
    }

    public static void main(String args[]) {
        LinkedList<Integer> arr1 = new LinkedList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        LinkedList<Integer> arr2 = new LinkedList<>();
        arr1.add(4);
        arr1.add(5);

        LinkedList<Integer> arr3 = new LinkedList<>();
        arr1.add(6);
        arr1.add(7);
        arr1.add(8);

        Iterator<Integer> a = arr1.iterator();
        Iterator<Integer> b = arr2.iterator();
        Iterator<Integer> c = arr3.iterator();
        Iterator[] iterlist = new Iterator[3];
        iterlist[0] = a;
        iterlist[1] = b;
        iterlist[2] = c;

        InterleavingIterator interleavingIterator = new InterleavingIterator<Integer>(iterlist);

        while(interleavingIterator.hasNext()) {
            System.out.print(interleavingIterator.next()+" ");
        }
    }
}
