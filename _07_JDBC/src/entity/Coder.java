package entity;

public class Coder {
    private int id;
    private String name;
    private int age;
    private String clan;

    public Coder() {
    }

    public Coder(int id, String name, int age, String clan) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.clan = clan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", clan='" + clan + '\'' +
                '}';
    }
}
