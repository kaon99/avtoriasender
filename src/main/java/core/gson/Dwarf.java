package core.gson;


import java.util.LinkedList;
import java.util.List;

public class Dwarf {

    private String name; // имя
    private int age; // возраст
    private String beard;
    private List<Weapon> weapons = new LinkedList<Weapon>();

    public Dwarf() {
    }

    public Dwarf(String name) {
        this.name = name;
        this.age = age;
        this.beard = beard;
        this.weapons = weapons;
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

    public String getBeard() {
        return beard;
    }

    public void setBeard(String beard) {
        this.beard = beard;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Dwarf{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", beard='" + beard + '\'' +
                ", weapons=" + weapons +
                '}';
    }
}
class Weapon {

    private String nameOfWeapon;
    private String origin;

    public Weapon() {
    }

    public Weapon(String nameOfWeapon, String origin) {
        this.nameOfWeapon = nameOfWeapon;
        this.origin = origin;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "nameOfWeapon='" + nameOfWeapon + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}