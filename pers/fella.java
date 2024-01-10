import java.util.Objects;
public class fella extends Pepls {
    private String name="Филе";
    private int dexterity;
    private int probability;
    private Location locashen=Location.kitchen;
    noise_level boise=new noise_level();
    public fella(int dexterity,int probability){
        super("Филе",dexterity);
        this.dexterity=dexterity;
        this.probability=probability;
    }
    public void moving(movement Movement,Location locashen) {
        this.locashen=locashen;
        switch (Movement) {
            case крадется:
                System.out.println(this.name + " прокрался в " + this.locashen);
                break;
            case пробрался:
                System.out.println(this.name + Movement + " на " + this.locashen);
                break;
            case прячется:
                System.out.println(this.name + " стараясь не шуметь, прячясь за мебелью " + this.locashen);
                break;
        }
        this.dexterity=boise.Noise(this.name,this.locashen,this.probability,this.dexterity);
    }
}