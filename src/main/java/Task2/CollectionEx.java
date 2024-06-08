package Task2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionEx <T> implements Iterable<T> {
    private static final int  DEFAULT_SIZE = 10;

    Object[] array;
    int size = 0;

    public CollectionEx(){
        array =  new Object[DEFAULT_SIZE];
    }
    public void add(T t){
        if (size == array.length){
            Object[] array2 = new Object[array.length + DEFAULT_SIZE];
            System.arraycopy(array,0,array2,0,array.length);
        }
        array[size++] = t;

    }
    public  void delete(int index){
        System.arraycopy(array,index + 1,array,index,size - index-1);
        size--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : this){
            sb.append(t + ", ");
        }
        return "CollectionEx{" +
                "size=" + size +
                "array" +"[" + sb + "]" + "}";


    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator() {
            private int index = 0;
            @Override
            public boolean hasNext() {

                return index < size;
            }

            @Override
            public Object next() {
                return  array[index] == null ? null: (T) array[index++];

            }
        } ;
    }
}
