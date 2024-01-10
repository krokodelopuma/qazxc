import java.util.Objects;
public class karlson extends Pepls implements finds_pepls{
    private String name="Карлсон";
    private Location locashen=Location.darkness;
    private int dexterity;
    private int probability;
    noise_level boise=new noise_level();
    public karlson(int dexterity,int probability){
        super("Карлсон",dexterity);
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
            case залез:
                System.out.println(this.name +" залез в красивый старинный буфет и кое-как прикрыл за собой дверцу");
                break;
        }
        this.dexterity=boise.Noise(this.name,this.locashen,this.probability,this.dexterity);
    }
    public void finds(things what){
        switch (what) {
            case скатерти:
                System.out.println(this.name + " находит скатерти и салфетки");
                break;
        }
    }
}