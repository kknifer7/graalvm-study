package io.knifer.demo.pojo;

/**
 * @author Knifer
 * @version 1.0.0
 */
public class Dragon {

    private Double hp;

    private Double mp;

    private String name;

    private final static Double THRUUM_MP = 20.5;

    public Dragon() {
    }

    public Dragon(Double hp, Double mp, String name) {
        this.hp = hp;
        this.mp = mp;
        this.name = name;
    }

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }

    public Double getMp() {
        return mp;
    }

    public void setMp(Double mp) {
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void thruum(){
        if (this.mp < THRUUM_MP){
            System.out.println("no mp");
            return;
        }
        this.mp -= THRUUM_MP;
        System.out.println("ahhhhhh");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dragon dragon = (Dragon) o;

        if (!getHp().equals(dragon.getHp())) return false;
        if (!getMp().equals(dragon.getMp())) return false;
        return getName().equals(dragon.getName());
    }

    @Override
    public int hashCode() {
        int result = getHp().hashCode();
        result = 31 * result + getMp().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "hp=" + hp +
                ", mp=" + mp +
                ", name='" + name + '\'' +
                '}';
    }
}
