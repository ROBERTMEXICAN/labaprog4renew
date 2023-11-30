package story;

import character.*;
import items.*;

public class Story {
    private final Karlson karlson;
    private final Malish malish;
    private final Otec otec;
    private final Baggy baggy;
    private final Box box;
    private final Cardboard cardboard;
    private final Pistoletik pistoletik;
    private final Pistoletik.DespairedPistolet bigpistol;
    private final Enviers krister;
    private  final Enviers gunilla;
    private final Igrushka gemstone;
    private final Igrushka car;
    private final Igrushka constructor;
    private final Igrushka golovolomka;
    private final Otec.Zagranica zagranica;
    private final Cardboard.HighShelf highshelf;


    public Story(){
        this.karlson = new Karlson("Карлсон",364);
        this.malish = new Malish("Малыш");
        this.otec = new Otec("Отец");
        this.cardboard = new Cardboard("шкафчик",true);
        this.pistoletik = new Pistoletik("пистолетик",true);
        this.krister = new Enviers("Кристер");
        this.gunilla = new Enviers("Гунилла"){
            @Override
            public void envy(Human human){
                System.out.println("также, " + this.getName() + " завидовал " + human.getName() + "у");
            }
            @Override
            public void why(){
                System.out.println("по той же причине");
            }
        };
        this.gemstone = new Igrushka("камушки");
        this.car = new Igrushka("машинки");
        this.golovolomka = new Igrushka("игра-головоломка");
        this.constructor = new Igrushka("конструктор");
        this.box = new Box("коробок");
        this.bigpistol = new Pistoletik.DespairedPistolet(true);
        this.zagranica = otec.new Zagranica();
        this.highshelf = cardboard.new HighShelf("OBJECT VERHNYAYA POLKA");
        this.baggy = new Baggy("мешочек");
    }
    public void go(){
        malish.show(car, karlson);
        karlson.makeSound(Sound.Nod);
        baggy.addItem(gemstone);
        malish.show(baggy,karlson);
        malish.show(constructor,karlson);
        malish.show(golovolomka,karlson);
        karlson.makeSound(Sound.Nod);
        box.addItem(pistoletik);
        cardboard.addItem(box);
        highshelf.emptied();
        pistoletik.remindThem();
        otec.show(pistoletik, malish);
        zagranica.glupiyePindosiPoddelaliPistoletikIDaliOtcu();
        krister.envy(malish);
        krister.why();
        gunilla.envy(malish);
        gunilla.why();
        bigpistol.DestinyToBeMisunderstood(pistoletik);
        bigpistol.why();
        otec.why();
        malish.show(pistoletik,karlson);
        malish.why();
        malish.checkItemThere(karlson, pistoletik);
        karlson.makeSound(Sound.Rumble);
        cardboard.setPositionToClosed(false);
        cardboard.setPositionToClosed(true);
        karlson.setLiked(pistoletik);
        karlson.setBday(0);
        karlson.why();
        karlson.checkForParty();
        karlson.rememberAllGoodStuffRoughly(10);
        malish.makeSound(Sound.Gasp_deeply);
        cardboard.setPositionToClosed(false);
        malish.addItem(box);
        cardboard.removeItem(box);
        box.emptied();
        cardboard.emptied();
        cardboard.setPositionToClosed(true);
        cardboard.removeItem(gemstone);
        karlson.rememberAllGoodStuffRoughly(1000);
    }


}
