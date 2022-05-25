package hero_vs_monster.type_personnage;

import hero_vs_monster.interfase.Cuivre;
import hero_vs_monster.interfase.Or;
import hero_vs_monster.model.Orque;
import hero_vs_monster.personnage.Personnage;
import org.w3c.dom.ls.LSOutput;

public class Hero extends Personnage {

    private int or = 0;

    private int cuire = 0;

    private int pvMax = 0;

    private int regen = this.getPoint_de_vie();

    public Hero(String nom) {
        super(nom);


    }


    public void hero_tue_monstre(Monstre m) {

        int regen = getPoint_de_vie();

        this.displayCarac();

        m.displayCarac();

        this.duel(this, m);

        if (this.estVainquer(this, m) == this) {

            System.out.println("le vainceur est : " + this.estVainquer(this, m).getNom());

            if (m instanceof Or){

                or = or + ((Or) m).getOr();
            }else if (m instanceof Or && m instanceof Cuivre){

                or = or + ((Or) m).getOr();
                cuire = cuire + ((Cuivre) m).getCuivre();
            }else{
                cuire = cuire + ((Cuivre) m).getCuivre();

            }


            this.regen();

            this.displayCarac();

            this.displayResource();


        } else {

            System.out.println(this.getNom() + " est mort");

        }


    }

    public void regen() {


        this.setPoint_de_vie(regen);


    }

    public void displayResource() {
        System.out.println("------------------");
        System.out.println("Gold   : " + or);
        System.out.println("------------------");
        System.out.println("Cuir   : " + cuire);
        System.out.println("------------------");

    }


    public int getOr() {
        return or;
    }

    public void setOr(int or) {
        this.or = or;
    }

    public int getCuire() {
        return cuire;
    }

    public void setCuire(int cuire) {
        this.cuire = cuire;
    }


}
