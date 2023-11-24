package net.nothing.homework.homework14;

public class PairContainer<T, K> extends User {
    public T key;
    public K value;

    public PairContainer(T key, K value) {
        super();
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }
}
