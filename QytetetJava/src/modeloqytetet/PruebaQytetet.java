package modeloqytetet;

import java.util.ArrayList;

/**
 *
 * @author Javier Aranda Izquierdo Github: JArandaIzquierdo
 */
public class PruebaQytetet {

    private static ArrayList<Sorpresa> mazo = new ArrayList(); // Array donde guardarmos las sorpresas
    /**
     * Metodo privado para inicializar 2 sorpresas dentro del array mazo
     */
    private static void inicializarSorpresas(){
        mazo.add(new Sorpresa ("Te hemos pillado con chanclas y calcetines, lo sentimos, ¡debes ir a la carce!", 9,TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Un fan anonimo ha pagado tu fianza. Sales de la carcel", 0, TipoSorpresa.SALIRCARCEL));
    };
    
    /**Metodo que devuelve un array de Sorpresas que tienen el valor Mayor que 0
     * 
     * @return mazoAux
     */
    private static ArrayList<Sorpresa> valorMayor0(){
        
        ArrayList<Sorpresa> mazoAux = new ArrayList();//Creamos un Array auxiliar de tipo Sorpresa
        PruebaQytetet.inicializarSorpresas();
        for ( Sorpresa s : mazo){
            if(s.getValor()>0){
                mazoAux.add(s);
            }
        }
        return mazoAux;
    }
    
    /**Metodo que devuelve un array de Sorpresas cuyo tipo es IRACASILLA
     * 
     * @return mazoAux
     */
    private static ArrayList<Sorpresa> tipoSorpresaIRACASILLA(){
        
        ArrayList<Sorpresa> mazoAux = new ArrayList();//Creamos un Array auxiliar de tipo Sorpresa
        PruebaQytetet.inicializarSorpresas();
        for ( Sorpresa s : mazo){
            if(s.getTipo()==TipoSorpresa.IRACASILLA){
                mazoAux.add(s);
            }
        }
        return mazoAux;
    }
    
    /**Metodo que devuelve un array de Sorpresas cuyo tipo es el especificado en el argumento
     * 
     * @return mazoAux
     */
    private static ArrayList<Sorpresa> tipoSorpresaEspecificado(TipoSorpresa especificado){
        
        ArrayList<Sorpresa> mazoAux = new ArrayList();//Creamos un Array auxiliar de tipo Sorpresa
        PruebaQytetet.inicializarSorpresas(); //Inicializamos el mazo de sorpresas
        for ( Sorpresa s : mazo){
            if(s.getTipo()==especificado){
                mazoAux.add(s);
            }
        }
        return mazoAux;
    }
    
    
   /**
     * Metodo publico para imprimir por pantalla las sorpresas del Array mazo
     */
    public static void imprimeMazo(){
        inicializarSorpresas();
        System.out.println(mazo);
    }
    
  /**
   * Metodo que imprime un mazo con las sorpresas con un valor mayor de 0
   */ 
   public static void imprimirMazoValorMayor0(){
       System.out.println(valorMayor0());
   }
   
   /**
   * Metodo que imprime un mazo con las sorpresas de tipo IRACASILLA
   */ 
   public static void imprimirTipoSorpresaIRACASILLA(){
       System.out.println(tipoSorpresaIRACASILLA());
   }
   
   /**
   * Metodo que imprime un mazo con las sorpresas del tipo pasado en el argumento
   */ 
   public static void imprimirTipoSorpresaEspecificado(TipoSorpresa tipo){
       System.out.println(tipoSorpresaEspecificado(tipo));
   }
    
    
    
public static void main(String[] args) {
    
    //PruebaQytetet.imprimeMazo(); // Imprime las sorpresas del array mazo
    //PruebaQytetet.imprimirMazoValorMayor0();
    //PruebaQytetet.imprimirTipoSorpresaIRACASILLA();
    PruebaQytetet.imprimirTipoSorpresaEspecificado(TipoSorpresa.SALIRCARCEL);


}

    
}
