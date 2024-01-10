import java.util.Objects;
public class rulla extends Pepls implements finds_pepls {
    private String name="Рулле";
    private int dexterity;
    private int probability;
    noise_level boise=new noise_level();
    public rulla(int dexterity,int probability){
        super("Рулле",dexterity);
        this.dexterity=dexterity;
        this.probability=probability;
    }
    private Location locashen=Location.kitchen;
    public void finds(things what){
        this.dexterity=boise.Noise(this.name,this.locashen,this.probability,this.dexterity);
        System.out.println(this.name + " выдвинул ящик секретора и свиснул");
        malesh male = new malesh(0,0);
        male.thinks(what);
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