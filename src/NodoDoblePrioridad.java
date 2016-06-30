
import java.io.Serializable;

public class NodoDoblePrioridad implements Serializable{
    int prioridad;
    Object valor;
    NodoDoblePrioridad sig,ant;

    public NodoDoblePrioridad(Object valor,int prioridad) {
        this.prioridad = prioridad;
        this.valor = valor;
        sig = ant = null;
    }
    
    
}
