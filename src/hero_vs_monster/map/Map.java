package hero_vs_monster.map;

import hero_vs_monster.personnage.Personnage;

import java.util.List;

public class Map {

    Personnage[] [] map ;

    List<Personnage> nombre_personnage ;

    public Map() {

        this.map = new Personnage[15][15] ;
    }

    public void displayMap(){

        System.out.println("==============================================================");
        System.out.println("======================= SHORE WOOD ===========================");
        System.out.println("==============================================================");
        for (int i = 0;i < map.length; i++) {

            for (int j = 0;j < map[i].length;j++) {

                if(map[i][j] == null){

                    System.out.print(" " + " | ");
                }else {

                    System.out.print(map[i][j] + " | ");
                }


            }
            System.out.println();
        }
        System.out.println("==============================================================");
        System.out.println("======================= SHORE WOOD ===========================");
        System.out.println("==============================================================");
    }



    public static void main(String[] args) {

        Map m = new Map();

        m.displayMap();
            }

}
