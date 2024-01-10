import java.lang.Object;
public class noise_level {
    private int noise=0;
    private int maxturn=4;
    private int turn=0;

    /*public noise_level(int noise,int maxturn){
        this.maxturn=maxturn;
        this.noise=noise;
    }*/
    public noise_level(){}


    public int Noise(String name,Location locashen,int probability,int dexterity/*,int noise,int maxturn*/) {
        /*this.maxturn=maxturn;
        this.noise=noise;*/
        if ((Math.random() * (100-dexterity)+dexterity)>=probability) {
            this.noise = this.noise + 1;
            this.turn = this.turn + 1;
            System.out.println(name + " шумит в " + locashen);
            if ((this.maxturn == this.turn) && (this.noise > 0)) {
                this.noise = this.noise - 1;
                System.out.println("но уровень шума издоваемый " + name + " остался прежним:" + this.noise);
                dexterity=dexterity-10;
            } else {
                System.out.println("уровень шума издоваемый " + name + " увеличился:" + this.noise);
                dexterity=dexterity+10;
            }
        }
        return dexterity;
    }
    public int getnoise() {
        return this.noise;
    }
    public int getmaxturn() {
        return this.maxturn;
    }
}
