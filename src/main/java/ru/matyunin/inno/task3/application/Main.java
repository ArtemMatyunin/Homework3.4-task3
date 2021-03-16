package ru.matyunin.inno.task3.application;


import ru.matyunin.inno.task3.model.MathBox;
import ru.matyunin.inno.task3.model.ObjectBox;

public class Main {
    public static void main(String[] args) {
        //проверка методов ObjectBox
        ObjectBox<Object> objectBox = new ObjectBox<>();
        objectBox.addObject("first");
        objectBox.addObject("sec");
        objectBox.addObject("tree");
        objectBox.addObject(new Object());
        objectBox.addObject(10);
        objectBox.dump();

        //проверк методов MathBox;
        MathBox<Number> mathBox = new MathBox<>(new Number[]{1, 2, 15, -8, 8.5, 7512390, 5.4f, 984651L});
        mathBox.dump();
        System.out.println(mathBox.summator());
        mathBox.deleteObject(-8);
        mathBox.dump();
        mathBox.div(100);
        mathBox.dump();
        System.out.println(mathBox.summator());

        //
        ObjectBox ob = new MathBox();
        ob.addObject(new Object());
        ob.dump();


    }
}
