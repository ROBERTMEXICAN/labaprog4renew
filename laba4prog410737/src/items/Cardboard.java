package items;

public class Cardboard extends Item implements Container {
    protected boolean opened;
    public Cardboard(String name, boolean opened){
        super(name);
        this.opened = opened;
    }
    public class HighShelf extends Item implements Container{
        public HighShelf(String name){
            super(name);
        }
        public void emptied(){
            System.out.println("(на самом деле он лежал в " + super.getName() + ", но да ладно)");
        }
    }
    public void setPositionToClosed(boolean bool){
        this.opened = bool;
    }
    public void emptied(){
        System.out.println("из "+this.getName()+'a');
    }
}
