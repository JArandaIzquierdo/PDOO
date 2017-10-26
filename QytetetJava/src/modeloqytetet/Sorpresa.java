package modeloqytetet;

/**
 *
 * @author Javier Aranda Izquierdo Github: JArandaIzquierdo
 */
public class Sorpresa {

    private String texto; //Texto de la sorpresa
    private TipoSorpresa tipo; //Tipo de sorpresa
    private int valor; //Valor de la sorpresa


    Sorpresa(String texto,int valor,TipoSorpresa tipo){

        this.texto = texto;
        this.valor = valor;
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "Sorpresa ->" + "Texto: " + texto + ", Valor: " + 
                Integer.toString(valor) + ", Tipo: " + tipo + "}";
                }
  
    public int getValor(){
        return valor;
    }
    
    public TipoSorpresa getTipo(){
        return tipo;
    }
    
}