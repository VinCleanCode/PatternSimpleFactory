package newegg.autopricing.simpleFactory;

public class TrainingCamp {

    public static Adventurer trainAdventurer(String type){
        switch (type) {
        case "archer": {
            System.out.println("訓練一個弓箭手");
            return new Archer();
        }
        case "warrior": {
            System.out.println("訓練一個鬥士");
            return new Archer();
        }
        default:
            return null;
        }
    }
}
