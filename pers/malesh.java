import java.util.Objects;
public class malesh extends Pepls implements thinks_pepls {
    private String name="Малыш";
    private Location locashen=Location.darkness;
    private int dexterity;
    private int probability;
    noise_level boise=new noise_level();
    public malesh(int dexterity,int probability){
        super("Малыш",dexterity);
        this.dexterity=dexterity;
        this.probability=probability;
    }

    public void moving(movement Movement,Location locashen){
        this.locashen=locashen;
        switch (Movement) {
            case крадется:
                System.out.println(this.name + " прокрался в "+ locashen);
                break;
            case пробрался:
                System.out.println(this.name +" "+ Movement +" на "+ locashen);
                break;
            case прячется:
                System.out.println(this.name +" стараясь не шуметь, прячясь за "+ locashen);
                break;
            case спрятался:
                System.out.println(this.name +" спрятался под диван у камина ");
                break;
        }
        this.dexterity=boise.Noise(this.name,this.locashen,this.probability,this.dexterity);
    }
    int a=0;
    public void thinks(things thoughts_malesh){
        //System.out.println(this.name + " думает - Наверно, нашел " + thoughts_malesh);
        switch (thoughts_malesh) {
            case деньги:
                System.out.println(this.name + " думает - Наверно, нашел " + thoughts_malesh);
                break;
            case кольца:
                System.out.println(this.name + " думает - Наверно, нашел кольца и брошки" );
                break;
        }
    }
}