package character;

public class Enviers extends Human implements HaveReason{
    public Enviers(String name){
        super(name);
    }
    public void envy(Human human){
        System.out.println(this.getName() + " завидовал " + human.getName() + "у");
    }
    public void why(){
        System.out.println("по причине: в жизни не видел таких малюсеньких пистолетиков");
    }
}
