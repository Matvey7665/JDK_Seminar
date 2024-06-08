package lesson3;

import java.io.DataInput;
import java.io.InputStream;

/*
Создать обобщенный класс с тремя параметрами (T,V,K).Класс содержит три переменные типа
T V K,конструктор,принимающий на вход эти параметры и методы.

 */
public class Task1 <T extends Comparable<String>,V extends InputStream & DataInput,K extends Number> {
   T t;
   V v;
   K k;

    public Task1(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
    public void printName(){
        System.out.printf("T: %s, V: %s, k: %s",t.getClass().getName(),v.getClass().getName(),k.getClass().getName());
    }

}
