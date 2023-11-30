package character;

public enum Sound {
    Gasp_deeply("глубоко вздохнул"),
    Rumble("роется"),
    Nod("покачал головой");
    public final String Sound;
    Sound(String s){
        this.Sound = s;
    }
    public String getSound(){
        return this.Sound;
    }
}
