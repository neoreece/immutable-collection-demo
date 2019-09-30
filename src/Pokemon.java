/**
 * The Pokemon class is used to demonstrate mutable and immutable lists. This
 * class will maintain the mutable object data.
 */
public class Pokemon {

    public String name = "";
    public int level = 0;
    public int hp = 0;

    /**
     * The pokemon levels up, increasing its level and hp.
     */
    public void levelUp() {
        this.level++;
        this.hp += this.level * 3;
    }

    @Override
    public String toString() {
        String out = "Pokemon: " + this.getName() + " is level " +  this.getLevel() + " with " + this.getHp() + " HP.";
        return out;
    }

    /**
     * Instantiates a Pokemon with the give name, level, and hp.
     * @param name
     * @param level
     * @param hp
     */
    public Pokemon(String name, int level, int hp) {
        this.setName(name);
        this.setLevel(level);
        this.setHp(hp);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        if (level > 0) {
            this.level = level;
        } else {
            System.out.println("ERROR: invalid level");
        }
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp >= 0) {
            this.hp = hp;
        } else {
            System.out.println("ERROR: invalid hp");
        }
    }
    
}