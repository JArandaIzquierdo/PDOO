/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JaviAir
 */
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        BadConsequence badConsequence;
        Prize prize;
        ArrayList<Monster> monstruos = new ArrayList();
        
        // Creación Monstruo "La que redacta en las tinieblas"
        badConsequence= new BadConsequence("Toses los pulmones y pierdes 2 niveles.",
        2, 0, 0);
        prize= new Prize(1,1);
        monstruos.add(new Monster("La que redacta en las tinieblas", 2, badConsequence, prize));
        
        // Creación Monstruo "El gorrón en el umbral"
        badConsequence= new BadConsequence("Pierdes todos tus tesoros visibles",
        0, 100, 0);
        prize= new Prize(3,1);
        monstruos.add(new Monster("El gorrón en el umbral", 10, badConsequence, prize));
        
        // Creación Monstruo "3 Byakhees de bonanza"
        badConsequence= new BadConsequence("Pierdes tu armadura visible y otra oculta.", 0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        prize= new Prize(2,1);
        monstruos.add(new Monster("3 Byakhees de bonanza", 10, badConsequence, prize));
        
        // Creación Monstruo "Semillas Cthulhu"
        badConsequence= new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos.", 2, 0, 2);
        prize= new Prize(2,1);
        monstruos.add(new Monster("Semillas Cthulhu", 4, badConsequence, prize));
        
        // Creación Monstruo "Yskhtihyssg-Goth"
        badConsequence= new BadConsequence("No le hace gracia que pronuncien mal su nombre. Estás muerto.", true);
        prize= new Prize(3,1);
        monstruos.add(new Monster("Yskhtihyssg-Goth", 12, badConsequence, prize));
        
        // Creación Monstruo "El Lenguas"
        badConsequence= new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles.", 2, 5, 0);
        prize= new Prize(1,1);
        monstruos.add(new Monster("El Lenguas", 20, badConsequence, prize));
        
        // Creación Monstruo "El sopor de Dunwich"
        badConsequence= new BadConsequence("El primordial bostezo contagioso. Pierdes el calzado visible.", 0, new ArrayList(Arrays.asList(TreasureKind.SHOES)), new ArrayList(Arrays.asList()));
        prize= new Prize(1,1);
        monstruos.add(new Monster("El sopor de Dunwich", 2, badConsequence, prize));
        
        // Creación Monstruo "H.P. Munchcraft"
        badConsequence= new BadConsequence("Pierdes la armadura visible.", 0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList(Arrays.asList()));
        prize= new Prize(2,1);
        monstruos.add(new Monster("H.P. Munchcraft", 6, badConsequence, prize));
        
        // Creación Monstruo "Dameargo"
        badConsequence= new BadConsequence("Te intentas escaquear. Pierdes una mano visible.", 0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), new ArrayList(Arrays.asList()));
        prize= new Prize(2,1);
        monstruos.add(new Monster("Dameargo", 1, badConsequence, prize));
        
        // Creación Monstruo "El espia"
        badConsequence= new BadConsequence("Te asusta en la noche. Pierdes un casco visible.", 0, new ArrayList(Arrays.asList(TreasureKind.HELMET)), new ArrayList(Arrays.asList()));
        prize= new Prize(1,1);
        monstruos.add(new Monster("El espia", 5, badConsequence, prize));
        
        /* CONSULTORES */
        
        // Consulta Monstruos con nivel igual o superior a 10
        System.out.println("Monstruos con nivel igual o superior a 10");
        for(Monster m: monstruos){
            if(m.getCombatLevel()>9){
                System.out.println(m.toString());
            }
        }
        
        // Consulta Monstruos que tengan un mal rollo que implique sólo pérdida de niveles.
        System.out.println("Monstruos que tengan un mal rollo que implique sólo pérdida de niveles.");
        for(Monster m: monstruos){
            if((m.getBadConsequence().getLevels()!=0) && 
                    (m.getBadConsequence().getNVisibleTreasures()==0) && 
                    (m.getBadConsequence().getNHiddenTreasures()==0)){
                System.out.println(m.toString());
            }
        }
        
        // Consulta Monstruos que su buen rollo indique una ganancia de niveles superior a 1.
        System.out.println("Monstruos que su buen rollo indique una ganancia de niveles superior a 1");
        for(Monster m: monstruos){
            if(m.getPrize().getLevel()>1){
                System.out.println(m.toString());
            }
        }
    }
    
}
