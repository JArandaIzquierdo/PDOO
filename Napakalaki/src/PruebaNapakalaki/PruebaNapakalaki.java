package PruebaNapakalaki;

import java.util.ArrayList;
import java.util.Arrays;
import napakalaki.BadConsequence;
import napakalaki.Monster;
import napakalaki.Prize;
import napakalaki.Treasure;
import napakalaki.TreasureKind;

/**
 *
 * @author Javi y Carlos
 */
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        BadConsequence badConsequence;
        Prize prize;
        
        //Array de monstruos
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
        
        // Creacion Monstruo "El rey de rosa"         
        badConsequence = new BadConsequence ("Pierder 5 niveles y tres tesoros visibles",5,3,0);
        prize= new Prize (4,2);
        monstruos.add(new Monster("El rey de rosa",13,badConsequence,prize));
        
        //Creacion Monstruo "Angeles de la noche ibicenca"
        badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta una "
                + "mano visible y una mano oculta", 0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), 
                new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        prize = new Prize(4, 1);
        monstruos.add(new Monster("Angel de la noche ibicenca",14,badConsequence,prize));
        
        //Creacion Monstruo "Los hondos"
        badConsequence = new BadConsequence("Estos monstruos resultan bastante superficiales y te aburren mortalmente. Estas muerto", true);
        prize = new Prize(2, 1);
        monstruos.add(new Monster("Los hondos", 8, badConsequence, prize));
        
        //Creacion Monstruo "Pollipolipo volante"
        badConsequence = new BadConsequence("Da mucho asquito", 3, 0, 0);
        prize = new Prize(1,1);
        monstruos.add(new Monster("Pollipolipo volante", 3, badConsequence, prize));
        
        //Creacion Monstruo "Familia Feliz"
        badConsequence = new BadConsequence("La familia te atrapa. Estas muerto", true);
        prize = new Prize(4, 1);
        monstruos. add(new Monster("Familia Feliz", 1, badConsequence, prize));
        
        // Creacion Monstruo "Chibithulhu"
        badConsequence = new BadConsequence("Embobados con el lindo primigenio te descartas de tu casco visible", 0,
                new ArrayList(Arrays.asList(TreasureKind.HELMET)), new ArrayList(Arrays.asList()));
        prize = new Prize(1,1);
        monstruos.add(new Monster("Chibithulhu", 2, badConsequence, prize));
        
        // Creacion Monstruo "Bicigooth"
        badConsequence = new BadConsequence("Sientes bichos bajo la ropa. Descarta la armadura visible", 0,
                new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList(Arrays.asList()));
        prize = new Prize(1,1);
        monstruos.add(new Monster("Bicigooth", 2, badConsequence, prize));
        
        //Creacion Monstruo "Roboggoth"
        badConsequence = new BadConsequence("La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible",
                2, new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)), new ArrayList(Arrays.asList()));
        prize = new Prize(2,1);
        monstruos.add(new Monster("Roboggoth", 8, badConsequence, prize));
        
        //Creacion Monstruo "Bicefalo"
        badConsequence = new BadConsequence("Te faltan manos para tanta cabeza. Pierde 3 niveles y tus tesoros visibles de las manos",
                3, new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS,TreasureKind.ONEHAND,TreasureKind.ONEHAND)),new ArrayList(Arrays.asList()));
        prize = new Prize(1,1);
        monstruos.add(new Monster("Bicefalo", 20, badConsequence, prize));
        
        /* CONSULTORES */
        
        // Consulta Monstruos con nivel igual o superior a 10
        System.out.println("Monstruos con nivel igual o superior a 10");
        for(Monster m: monstruos){
            if(m.LevelExceeding10()){
                System.out.println(m.toString());
            }
        }
        
        // Consulta Monstruos que tengan un mal rollo que implique sólo pérdida de niveles.
        System.out.println("Monstruos que tengan un mal rollo que implique sólo pérdida de niveles.");
        for(Monster m: monstruos){
            if(m.OnlyLevelsBadConsequence())
                System.out.println(m.toString());
        }
        
        // Consulta Monstruos que su buen rollo indique una ganancia de niveles superior a 1.
        System.out.println("Monstruos que su buen rollo indique una ganancia de niveles superior a 1");
        for(Monster m: monstruos){
            if(m.PrizeLevelsExceeding1()){
                System.out.println(m.toString());
            }
        }
        
        /* Consulta Monstruos que su mal rollo suponga la perdida de un determinado
        tipo de tesoros, ya sea visibles y/o ocultos*/
        System.out.println("Los monstruos que su mal rollos suponga la perdida de un determinado tipo de tesoro son: ");
        for(Monster m: monstruos){
            if(m.LoseSpecificTreasures()){
                System.out.println(m.toString());
            }
        
        }
        
        
        //Array de Tesoros
        ArrayList<Treasure> tesoros = new ArrayList();
        
        //Creación de Tesoro ¡Sí mi amo!
        tesoros.add(new Treasure("¡Si mi amo!", 0, 4,TreasureKind.HELMET));
        
        //Creación de Tesoro Capucha de Cthulhu
        tesoros.add(new Treasure("Capucha de Cthulhu", 0, 3,TreasureKind.HELMET));
        
        //Creación de Tesoro Botas de lluvia acida
        tesoros.add(new Treasure("Botas de lluvia acida", 0, 1,TreasureKind.BOTHHANDS));
        
        //Creación de Tesoro Ametralladora Thompson
        tesoros.add(new Treasure("Ametralladora Thompson", 0, 4,TreasureKind.BOTHHANDS));
        
        //Creación de Tesoro Clavo de rail ferroviario
        tesoros.add(new Treasure("Clavo de rail ferroviario", 0, 3,TreasureKind.ONEHAND));
        
        //Creación de Tesoro Fez alopodo
        tesoros.add(new Treasure("Fez alopodo", 0, 3,TreasureKind.HELMET));        
        
        //Creación de Tesoro El aparato del Pr. Tesla
        tesoros.add(new Treasure("El aparato del Pr. Tesla", 0, 4,TreasureKind.ARMOR));
        
        //Creación de Tesoro Insecticida
        tesoros.add(new Treasure("Insecticida", 0, 2,TreasureKind.ONEHAND));        
        
        //Creación de Garabato mistico
        tesoros.add(new Treasure("Insecticida", 0, 2,TreasureKind.ONEHAND));
        
        //Creación de Lanzallamas
        tesoros.add(new Treasure("Lanzallamas", 0, 4,TreasureKind.BOTHHANDS));
        
        //Creación de Necronomicon
        tesoros.add(new Treasure("Necronomicon", 0, 5,TreasureKind.BOTHHANDS));
        
        //Creación de Necro-gnomicon
        tesoros.add(new Treasure("Necro-gnomicon", 0, 2,TreasureKind.ONEHAND));
        
        //Creación de Mazo de los antiguos
        tesoros.add(new Treasure("Mazo de los antiguos", 0, 3,TreasureKind.ONEHAND));
        
        //Creación de Porra preternatural
        tesoros.add(new Treasure("Porra preternatural", 0, 2,TreasureKind.ONEHAND));
        
        //Creación de Varita de atizamiento
        tesoros.add(new Treasure("Varita de atizamiento", 0, 3,TreasureKind.ONEHAND));
        
        //Creación de Zapato deja-amigos
        tesoros.add(new Treasure("Zapato deja-amigos", 0, 1,TreasureKind.SHOES));
    }
    
}
