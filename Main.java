import java.util.Objects;
import interface.*;
import enum.*;

public class Main {

    public static void main(String[] args) {

        karlson karl = new karlson(60,60);
        System.out.println(karl.toString());
        malesh male = new malesh(60,60);
        System.out.println(male.toString());
        gunnela gunn = new gunnela(60,60);
        System.out.println(gunn.toString());
        krester kres = new krester(60,60);
        System.out.println(kres.toString());
        rulla rull = new rulla(60,60);
        System.out.println(rull.toString());
        fella fell = new fella(60,60);
        System.out.println(fell.toString());

        karl.moving(movement.прячется,Location.furniture);
        karl.moving(movement.пробрался,Location.kitchen);
        male.moving(movement.прячется,Location.furniture);
        male.moving(movement.пробрался,Location.kitchen);
        gunn.moving(movement.прячется,Location.furniture);
        gunn.moving(movement.пробрался,Location.kitchen);
        kres.moving(movement.прячется,Location.furniture);
        kres.moving(movement.пробрался,Location.kitchen);
        karl.finds(things.скатерти);
        karl.moving(movement.спрятался,Location.closet);
        male.moving(movement.спрятался,Location.sofa);
        rull.moving(movement.крадется,Location.kitchen);
        fell.moving(movement.крадется,Location.kitchen);
        rull.finds(things.деньги);
        rull.finds(things.кольца);
    }
}



