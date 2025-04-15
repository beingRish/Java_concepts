package being.rish.generics.boundedTypeParameters;

interface Printable {
    void print();
}

class MyNumber extends Number implements Printable {
    private final int value;

    public MyNumber(int value){
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("MyNumber: " + value);
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

class Boxx<T extends Number & Printable>{
    private T item;

    public Boxx(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }

    public T getItem() {
        return item;
    }
}

public class Test{
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(12);
        Boxx<MyNumber> boxx = new Boxx<>(myNumber);
        boxx.display();
    }
}

