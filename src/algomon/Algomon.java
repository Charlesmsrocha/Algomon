package algomon;

/**
 *
 * @author Charles Rocha
 */


public class Algomon {

    /*
     * An Algomon has:
     * HP;
     * Attack;
     * Defense;
     * Speed;
     * Passive Ability;
     * Action ability;
     * Bonus Action;
     * Reaction.
    *
     * An Algomon can:
     * Attack; 
     * use Ability; 
     * use Bonus Action; 
     * use Reaction. 
     */

    String name;
    String type; //Later change it to enum, maybe
    private int HP;
    private int attackPower;
    private int defense;
    
    //Constructor to initialize the Algomon status
    public Algomon(String name, String type, int HP, int attackPower, int defense ){
        this.name = name;
        this.type = type;
        this.HP = HP;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getHP() {
        return HP;
    }
    public void setHP(int newHP) {
        this.HP = newHP;
    }

    public int getAttackPower() {
        return attackPower;
    }
    public void setAttack(int NewAttackPower) {
        this.attackPower = NewAttackPower;
    }

    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    
}

