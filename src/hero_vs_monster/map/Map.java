package hero_vs_monster.map;

import hero_vs_monster.model.Humain;
import hero_vs_monster.personnage.Personnage;
import hero_vs_monster.type_personnage.Hero;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private Personnage[][] map;


    private List<Personnage> nombre_personnage;


    public Map() {

        this.map = new Personnage[15][15];

        this.nombre_personnage = new ArrayList<>();
    }

    public void displayMap() {

        System.out.println("==============================================================");
        System.out.println("======================= SHORE WOOD ===========================");
        System.out.println("==============================================================");
        for (int i = 0; i < map.length; i++) {

            for (int j = 0; j < map[i].length; j++) {

                if (map[i][j] == null) {

                    System.out.print(" " + " | ");
                } else {

                    System.out.print(map[i][j].getNom() + " | ");
                }


            }
            System.out.println();
        }
        System.out.println("==============================================================");
        System.out.println("======================= SHORE WOOD ===========================");
        System.out.println("==============================================================");
    }

    public Personnage[][] getMap() {
        return map;
    }

    public void setMap(Personnage[][] map) {
        this.map = map;
    }

    public List<Personnage> getNombre_personnage() {
        return nombre_personnage;
    }

    public void setNombre_personnage(List<Personnage> nombre_personnage) {
        this.nombre_personnage = nombre_personnage;
    }

    public void addPersonnage(int x, int y, Personnage personnage) {


        map[x][y] = personnage;

        personnage.posDuPerso(x, y);

        nombre_personnage.add(personnage);


    }


    public void getPosPersonnage(Personnage p) {

        for (int i = 0; i < map.length; i++) {

            for (int j = 0; j < map[i].length; j++) {

                if (map[i][j] == p) {

                    System.out.println("( " + i + " , " + j + " )");
                }


            }
        }

    }

    public void movePersonnage(Personnage p) {


    }


    public static void main(String[] args) {

        Humain hero = new Humain("H");

        Map m = new Map();

        m.addPersonnage(4, 5, hero);

        m.getPosPersonnage(hero);

        m.displayMap();
    }

}
