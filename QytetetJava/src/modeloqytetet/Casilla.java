package modeloqytetet;

/**
 *
 * @author Javier Aranda Izquierdo GitHub:JArandaIzquierdo
 */
public class Casilla {

    private int numeroCasilla;
    private int coste;
    private int numHoteles;
    private int numCasas;
    private TipoCasilla tipoCasilla;
    private TituloPropiedad titulo;
    
    /**
     * Constructor de clase para las casillas de tipo CALLE
     * @param numeroCasilla: es el numero de la casilla
     * @param coste: coste de esa casilla
     * @param titulo: el tiulo de esa casilla
     */
    public Casilla(int numeroCasilla,int coste, TituloPropiedad titulo){
        this.numeroCasilla=numeroCasilla;
        this.coste=coste;
        this.numHoteles=0;
        this.numCasas=0;
        this.tipoCasilla=tipoCasilla.CALLE;
        this.titulo=titulo;
    } 
    
    /**
     * Constructor de clase para las casilla que no son de tipo CALLE
     * @param numeroCasilla: es el numero de la casilla
     * @param coste: es el coste de la casilla
     * @param tipo: es el tipo de la casilla
     */
    public Casilla(int numeroCasilla, int coste, TipoCasilla tipo){
        this.numeroCasilla=numeroCasilla;
        this.coste=coste;
        this.numHoteles=0;
        this.numCasas=0;
        tipoCasilla=tipo;
    }
    
    //Devuelve el numero de la casilla
    public int getNumeroCasilla(){
        return this.numeroCasilla;
    }
    
    //Devuelve el coste de la casilla
    public int getCoste(){
        return this.coste;
    }
    
    //Devuelve el numero de hoteles
    public int getNumHoteles(){
        return this.numHoteles;
    }
    
    //Devuelve el numero de casas
    public int getNumCasa(){
        return this.numCasas;
    }
    
    //Devuelve el tipo de la casilla
    public TipoCasilla getTipoCasilla(){
        return this.tipoCasilla;
    }
    
    //Devuelve el titulo de la propiedad
    public TituloPropiedad getTituloPropiedad(){
        return this.titulo;
    }
    
    //Modifica el numero de hoteles
    public void setNumHoteles(int numHoteles){
       this.numHoteles=numHoteles;
    }
    
    //Modifica el numero de casas
    public void setNumCasas(int numCasas){
       this.numCasas=numCasas;
    }
    
    //Modifica el Titulo de Propuedad
    private void setTituloPropiedad(TituloPropiedad titulo){
        this.titulo=titulo;
    }
    
    public String toString(){
        return "Casilla: "+
                "Numero de casilla: "+this.numeroCasilla+
                ", Coste: "+ this.coste +
                ", Numero de Hoteles: "+this.numHoteles+
                ", Numero de Casas: "+ this.numCasas +
                ", Tipo de Casilla: "+ this.tipoCasilla+
                ", Titulo de la Propiedad: "+this.titulo;
    }
    
}

