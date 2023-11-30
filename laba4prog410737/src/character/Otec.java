package character;

public class Otec extends Human implements HaveReason{
    public class Zagranica{

        public Zagranica() {
        }
        public void glupiyePindosiPoddelaliPistoletikIDaliOtcu(){
            System.out.println("Отец привез его из-за гарницы ");
        }
    }
    public Otec(String name){
        super(name);
    }
    public void why(){
        System.out.println(this.getName() + " недоумевает, почему так");
    }
}
