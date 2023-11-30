package items;

public class Box extends Item implements Container {
    public Box(String name){
        super(name);
    }

    public void emptied(){
        System.out.println("достал " + this.getName());
    }
}
