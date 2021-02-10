package HomeWork5.dto;

public class Student implements Comparable<Student> {

    private  int id;
    private  String name;
    private  int age;
    private  double score;
    private  boolean olympic;

    public void Student(int id, String name, int age, double score, boolean olympic) {

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
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", olympic=" + olympic +
                '}';
    }

    public void setID(int incrementAndGet) {
    }

    public void setAge(int randInt) {
    }

    public void setName(String randString) {
    }

    public void setRate(double randDouble) {
    }

    public void setOlympic(boolean randBoolean) {
    }
}
