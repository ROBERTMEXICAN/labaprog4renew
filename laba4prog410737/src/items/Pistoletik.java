package items;

import character.HaveReason;

public class Pistoletik extends Item {
    protected boolean isSmallest;
    public Pistoletik(String name, boolean isSmallest){
        super(name);
        this.isSmallest = isSmallest;
    }
    public void remindThem(){
        if (this.isSmallest){
            System.out.println("Это был самый маленький в мире пистолет и, конечно, самый прекрасный.");
        }
    }

    public static class DespairedPistolet implements HaveReason {
        private final boolean unluckyShot;
        public DespairedPistolet(boolean unluckyShot){
            this.unluckyShot = unluckyShot;
        }
        public void DestinyToBeMisunderstood(Item item){
            System.out.println("все считают " + item.getName() + " похожим на настоящий пистолет");
        }
        public void why(){
            if (unluckyShot) {
                System.out.println("так-как стреляет так же громко, как и он");
            }
        }
    }
}
