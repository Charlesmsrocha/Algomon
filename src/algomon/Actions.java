package algomon;

/**
 *
 * @author Charles Rocha
 */
public class Actions {
    //Algomon can choose among attack, bonus action, reaction, use ability
    
    public static void attackOpponent(){
        System.out.println("This must deal damage to the opponent. Use this or ability.");
    }
    
    public static void useBonusAction (){
        System.out.println("This is an action the helps the Algomon. It can be used before or after an attack or ability.");
    }
    
    public static void useReaction(){
        System.out.println("This action only can be used after an Algomon has received an attack.");
    }
    
    public static void useAbility(){
        System.out.println("The Algomon might choice between this action or attackOpponent. ");
    }    
    
    String attackOpponent;
    String useBonusAction;
    String useReaction;
    String useAbility;
    String playerDecision;
    
//    if (decision.equals(attackOpponent){
//        attackOpponent();
//        return null;
//    }

}
