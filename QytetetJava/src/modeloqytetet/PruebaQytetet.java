package modeloqytetet;

import java.util.ArrayList;

/**
 *
 * @author Javier Aranda Izquierdo Github: JArandaIzquierdo
 */
public class PruebaQytetet {

    private static ArrayList<Sorpresa> mazo = new ArrayList(); // Array donde guardarmos las sorpresas
    
    private static void inicializarSorpresas(){
        mazo.add(new Sorpresa ("Te hens pillado con chanclas y calcetines, lo sentimos, ¡debes ir a la carce!", 9,TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Un fan anonimo ha pagado tu fianza. Sales de la carcel", 0, TipoSorpresa.SALIRCARCEL));
    };
    
    public static void imprimeMazo(){
        inicializarSorpresas();
        System.out.println(mazo);
    }
   
    
    
    public static void main(String[] args) {
        
        PruebaQytetet.imprimeMazo();
    
    }
    
}
