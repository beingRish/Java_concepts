package being.rish.generics.wildcardsInGenerics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<?> list = new ArrayList<String>();

    }

    public <T> T getFirst(ArrayList<T> list){
        return list.get(0);
    }

    public <T> void copy(ArrayList<T> source, ArrayList<T> destination){
        for(T item: source) {
            destination.add(item);
        }
    }
}
