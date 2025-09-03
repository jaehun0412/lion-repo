package day10;

public class BoxExam {

    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.setItem(new Person("kang", 20));

        box.setItem(new Pen());

        ((Pen) box.getItem()).write();

        PenBox penBox = new PenBox();
        penBox.setPen(new Pen());

        penBox.getPen().write();

        GenericBox<Pen> penGenericBox = new GenericBox<>();
        penGenericBox.setItem(new Pen());
        penGenericBox.getItem().write();

        GenericBox<Person> personGenericBox = new GenericBox<>();
        personGenericBox.setItem(new Person("kang", 20));
        personGenericBox.getItem().getName();

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setItem("abc");
        stringGenericBox.getItem().toLowerCase();
    }
}
