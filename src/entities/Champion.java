package entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public void takeDamage(int life, int attack, int armor) {
        if (attack > armor) {
            this.life = life - attack + armor;
        } else {
            this.life += -1;
        }
    }

    public String status() {
        return getName()
                + ": "
                + getLife()
                + " de vida";
    }


}

