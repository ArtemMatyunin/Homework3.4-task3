package ru.matyunin.inno.task3.model;

import java.util.*;

public class MathBox<E extends Number> extends ObjectBox<E> {

    public MathBox(E[] objectCollection) {
        super();
        this.objectCollection.addAll(Arrays.asList(objectCollection));
    }

    public MathBox() {

    }

    @Override
    public String toString() {
        return "MathBox{" +
                "objectCollection=" + objectCollection +
                '}';
    }

    @Override
    public void addObject(E obj) {
        super.addObject(obj);
    }

    public double summator() {
        double n = 0.0;
        for (E e : objectCollection) {
            n += e.doubleValue();
        }
        return n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox<?> mathBox = (MathBox<?>) o;
        return Objects.equals(objectCollection, mathBox.objectCollection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectCollection);
    }

    public <T extends E> void div(T divider) {
        if (divider.intValue() == 0) {
            System.out.println("на ноль делить нельзя");
            return;
        }
        Set<Number> tempSet = new HashSet();
        for (E e : this.objectCollection) {
            tempSet.add(e.doubleValue() / divider.longValue());
        }
        this.setObjectCollection((Set<E>) tempSet);
    }

    private void setObjectCollection(Set<E> set) {
        this.objectCollection = set;
    }
}
