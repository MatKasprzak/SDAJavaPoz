package pl.sda.poznan.Factory.generic;

public interface Factory<K, V> {
    V create (K key);
}
