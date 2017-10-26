package modeloqytetet;

/**
 *
 * @author Javier Aranda Izquierdo GitHub:JArandaIzquierdo
 */
public class TituloPropiedad {
    private String nombre;
    boolean hipotecada;
    int alquilerBase;
    float factorRevalorizacion;
    int hipotecaBase;
    int precioEdificar;
    
    
    /**
     * Constructor de la clase 
     * @param nombre: nombre de la propiedad
     * @param alquilerBase: si esta alquilado o no
     * @param factorRevalorizacion: cuanto se revaloriza con el tiempo
     * @param hipotecaBase: precio de la hipoteca base
     * @param precioEdificar: precio por edificar 
     */
    public TituloPropiedad(String nombre,int alquilerBase,float factorRevalorizacion, int hipotecaBase, int precioEdificar) {
    
        this.nombre=nombre;
        this.hipotecada=false;
        this.alquilerBase=alquilerBase;
        this.factorRevalorizacion=factorRevalorizacion;
        this.hipotecaBase=hipotecaBase;
        this.precioEdificar=precioEdificar;
    }
    
    //Devuelve el nombre de la propiedad
    public String gerNombre(){
        return nombre;
    }
    
    //Devuelve true si la propiedad esta hipotecada, y false en caso contrario
    public boolean getHipotecada(){
        return hipotecada;
    }
    
    //Devuelve el valor del alquiler basico
    public int getAlquilerBase(){
        return alquilerBase;
    }
    
    //Devuelve el valor del factor de revalorizacion 
    public float getfactorRevalorizacion(){
        return factorRevalorizacion;
    }
    
    //Devuelve el valor de la hipoteca base
    public int getHipotecaBase(){
        return hipotecaBase;
    }
    
    //Devuelve el valor del precio para edificar
    public int getPrecioEdificar(){
        return precioEdificar;
    }
    
    //Modifica el valor de la variable hipotecada
    public void setHipotecada(boolean hipotecada){
       this.hipotecada=hipotecada;
    }
    
    //Metodo toString que muertra los valores para un Titulo de propiedad
    public String toString(){
        return "Titulo de propiedad:"+
            " Nombre: "+ this.nombre+
            ", hipotecada: "+ this.hipotecada +
            ", alquiler base: "+ this.alquilerBase +
            ", factor revalorizacion: "+ this.factorRevalorizacion+
            ", hipoteca base: "+ this.hipotecaBase+
            ", precio edificar: "+this.precioEdificar;
    }

}


