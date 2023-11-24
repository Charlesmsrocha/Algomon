package algomon;

/**
 *
 * @author Charles Rocha
 */

public abstract class Algomon {

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

    public String name;
    public AlgomonType type; //Later change it to enum, maybe
    public int HP;
    private int attackPower;
    private int defense;
    
    //Constructor to initialize the Algomon status
    public Algomon(String name, AlgomonType type, int HP, int attackPower, int defense ){
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

    public AlgomonType getType() {
        return type;
    }
    public void setType(AlgomonType type) {
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
    public void setDefense(int newDefense) {
        this.defense = newDefense;
    }
    
}

