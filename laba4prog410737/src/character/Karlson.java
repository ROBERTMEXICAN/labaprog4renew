package character;

import items.Item;

public class Karlson extends Human implements HaveReason {
    public Karlson(String name, int tilBday) {
        super(name, tilBday);
    }

    public boolean getSeen(Item Item){
        return this.haveSeen.contains(Item);
    }

    public void setBday(int when){
        this.tilBday = when;
    }

    @Override
    public void rememberAllGoodStuffRoughly(int distantMemories) throws OutOfMemoryError{
        class OutOfHumanMemoryError extends Error{

            public OutOfHumanMemoryError(String message) {
                super(message);
            }

        }
        if ((this.haveSeen.size() + distantMemories)>50){
            throw new OutOfHumanMemoryError("у " + this.getName() + " кружится голова от стольких воспоминаний, это конец...");
        }
        super.rememberAllGoodStuffRoughly(distantMemories);
    }

    public void why() {
        if (super.getLiked().length != 0) {
            System.out.println("так как " + this.getName() +"у" + " он понравился" + ", он");
        }
    }
}
