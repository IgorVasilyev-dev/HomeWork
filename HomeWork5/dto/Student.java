package HomeWork5.dto;

import java.text.DecimalFormat;
import java.util.Objects;

/**
 * 1. Создать класс Student с полями
 *  порядковый номер (int),
 *  имя (Строка размером от 3 до 10 русских символов),
 *  возраст (7-17),
 *  оценка(0.0-10.0),
 *  признак участия в олимпиадах (bool).
 */
public class Student implements Comparable<Student>{
    private final int id;
    private final String name;
    private final int age;
    private final double score;
    private final boolean olympic;

    public Student(int id, String name, int age, double score, boolean olympic) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.olympic = olympic;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public boolean isOlympic() {
        return olympic;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.##");
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + df.format(score) +
                ", olympic=" + olympic +
                '}';
    }
}
