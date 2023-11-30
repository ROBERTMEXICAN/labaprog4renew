package items;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;


public abstract class Item {
    private final String name;
    protected LinkedList<Item> stored = new LinkedList<>();
    public Item(String name){
        this.name = name;
    }
    public Item(String name, Item[] stored){
        this.name = name;
        this.stored.addAll(java.util.List.of(stored));
    }

    public String getName() {
        return name;
    }
    public void addItem(Item thing){
        stored.add(thing);
    }
    public void removeItem(Item item){
        try {
            this.stored.remove(item);
        }catch(Exception e){
            e.printStackTrace();
            this.addItem(item);
        } this.stored.remove(item);
    }

    @Override
    public String toString() {
        return "item{" +
                "name='" + name + '\'' +
                ", stored=" + stored +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) && Objects.equals(stored, item.stored);
    }

    @Override
    public int hashCode() {
        return 11*Objects.hash(name, stored);
    }
}
