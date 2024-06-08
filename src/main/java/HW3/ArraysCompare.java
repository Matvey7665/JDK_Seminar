package HW3;

import java.util.Objects;

public class ArraysCompare {
    public static <E> boolean compareArrays(E[] array1,E[] array2){
        if (array1 == null){
            throw new NullPointerException("Empty");
        }
        if (array2 == null){
            throw new NullPointerException("Empty");
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i <array1.length ; i++) {
            if (!Objects.equals(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }
}
