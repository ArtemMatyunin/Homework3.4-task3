package ru.matyunin.inno.task3.model;

import java.util.*;

public class ObjectBox<E>{
    Set<E> objectCollection = new HashSet<>();

    public ObjectBox() {

    }
    public void addObject(E obj) {
            this.objectCollection.add(obj);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectBox<?> objectBox = (ObjectBox<?>) o;
        return Objects.equals(objectCollection, objectBox.objectCollection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectCollection);
    }

    @Override
    public String toString() {
        return "ObjectBox{" +
                "objectCollection=" + objectCollection +
                '}';
    }

    public void deleteObject(E obj){
        if(this.objectCollection.remove(obj)){
            System.out.println(obj + " удалено");
        }else {
            System.out.println("нет такого элемента в коллекции");
        }
    }
    public void dump() {
        System.out.println(this.toString());

    }
}
