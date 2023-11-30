package character;
import items.Igrushka;
import items.Item;
import items.Pistoletik;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public abstract class Human {
    protected String name;
    protected int tilBday;
    protected LinkedList<Item> Items = new LinkedList<Item>();
    protected LinkedList<Item> liked = new LinkedList<Item>();
    protected LinkedList<Item> haveSeen = new LinkedList<Item>();
    public Human(String name, int til_bday){
        this.name = name;
    }

    public Human(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addItem(Item thing){
        Items.add(thing);
    }
    public void addItemSeen(Item item, Human human){
        human.haveSeen.add(item);
    }
    public void show(Item item, Human human){
        human.addItemSeen(item, human);
        System.out.println(this.getName() + " показал " + item.getName() + " " + human.getName() + "у");
    }
    public int getTilBday(){
        return tilBday; }
    public void checkForParty(){
        if (this.getTilBday() == 0){
            System.out.println("сегодня устраивает праздник");
        }
    }
    public void rememberAllGoodStuffRoughly(int distantMemories){
        System.out.println(this.getName() + " теперь помнит " + (haveSeen.size() + distantMemories) + " смыслей жизней))))");
    }
    public Object[] getLiked(){
        return liked.toArray();
    }
    public void setLiked(Item it){
        liked.add(it);
    }
    public void makeSound(Sound sound){
        System.out.println(this.getName() + " " + sound.getSound());
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", tilBday=" + tilBday +
                ", items=" + Items +
                ", liked=" + liked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return tilBday == human.tilBday && Objects.equals(name, human.name) && Objects.equals(Items, human.Items) && Objects.equals(liked, human.liked);
    }

    @Override
    public int hashCode() {
        return 31*Objects.hash(name, tilBday, Items, liked);
    }
}
