package character;

import items.Item;

import java.util.LinkedList;

public class Malish extends Human implements HaveReason{
    public Malish (String name){
        super(name);
    }
    public void checkItemThere(Karlson karlson, Item item) {
        if (karlson.getSeen(item)) {
            System.out.println("решил не показывать " + karlson.getName() + "у");
            System.out.println("но это бессмысленно и некрасиво, как думает " + super.getName());
        }
    }
    public void why(){
        System.out.println("По довольно очевидной причине "+this.getName());
    }
}