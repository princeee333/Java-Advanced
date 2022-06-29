package Generics.exercise.ArrayCreator;

import java.util.List;

public class ListUtils {
    public static <T extends Comparable<T>> T getMin(List<T> element) {
        return element.stream()
                .min(T::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("Empty collection"));

    }

    public static <T extends Comparable<T>> T getMax (List<T> element) {
        return element.stream()
                .max(T::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("Empty collection"));

    }


}

