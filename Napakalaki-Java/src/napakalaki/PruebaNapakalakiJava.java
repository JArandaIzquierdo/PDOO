package napakalaki;


/**
 *
 * @author Javier Aranda
 */
public class PruebaNapakalakiJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bienvenido a Napakalaki");
        
        // Creacion de un objeto de cada tipo
        BadConsequence malRollo = new BadConsequence("El peor mal rollo",5,2,2);
        Prize buenRollo = new Prize(4,5);
        Monster monstruo = new Monster("Joker",2,malRollo, buenRollo);
        
        System.out.println("El mal rollo es: ");
        System.out.println(malRollo);
        
        System.out.println("El buen rollo es: ");
        System.out.println(buenRollo);
        
        System.out.println("El monstruo es: ");
        System.out.println(monstruo);
    }
    
}
