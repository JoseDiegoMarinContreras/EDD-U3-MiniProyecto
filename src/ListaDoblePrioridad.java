public class ListaDoblePrioridad {
    protected NodoDoblePrioridad ini, fin, temp;

    public ListaDoblePrioridad() {
        ini = fin = temp = null;
    }
    
    public boolean soloUnElemento(){
        return ini == fin;
    }    
    public boolean estaVacia(){
        return ini == null && fin == null;
    }
    
    public void ordenarPrioridad(){
        if(ini.sig == fin){
            if(fin.prioridad<ini.prioridad){
        temp = ini;
        fin.ant = ini.sig = null;
        fin.sig = ini;
        ini.ant = fin;
        fin = ini;
        ini = ini.ant;}
        return;
        }
        if(fin.prioridad<fin.ant.prioridad){
            fin.ant = fin.ant.ant;
            fin.ant.sig.sig = null;
            fin.ant.sig.ant = fin;
            fin.sig = fin.ant.sig;
            fin.ant.sig = fin;
            fin = fin.sig;
        }else{return;}
        NodoDoblePrioridad t;
        for(temp = fin.ant,t = fin.ant.ant;t!=ini;t = t.ant,temp = temp.ant){
            if(temp.prioridad < t.prioridad){
                temp.ant = t.ant;
                temp.ant.sig = temp;
                t.sig = temp.sig;
                t.sig.ant = t;
                temp.sig = t;
                t.ant = temp;
                t = t.ant;
                temp = temp.sig;
            }else{return;}
        }
        if(ini.sig.prioridad < ini.prioridad){
            ini.sig.ant = null;
            ini.ant = ini.sig;
            ini.sig = ini.sig.sig;
            ini.sig.ant.sig = ini;
            ini.sig.ant = ini;
            ini = ini.ant;
        }
    }
    
    public boolean insertar(Object valor, int prioridad){
        temp = new NodoDoblePrioridad(valor, prioridad);
        if(temp == null){return false;}
        if(ini == null && fin == null){
            ini = fin = temp;
            return true;
        }
        fin.sig = temp;
        temp.ant = fin;
        fin = temp;
        ordenarPrioridad();
        return true;
    }
        
    public boolean eliminar(){
        if(ini == null && fin == null){return false;}
        if(ini == fin){ini = null; fin = null; return true;}
        temp = ini;
        ini = ini.sig;
        temp.sig = null;
        ini.ant = null;
        temp = null;
        return true;
    }
    
    public boolean eliminar(Object valor){
        if(ini == null && fin == null){return false;}        
        if(ini == fin){
            if(ini.valor.equals(valor)){ini=null; fin=null; return true;}
                return false;
        }
        if(ini.valor.equals(valor)){
        return eliminar();
        }
        if(fin.valor.equals(valor)){
        temp = fin;
        fin = fin.ant;
        fin.sig = null;
        temp.ant = null;
        temp = null;
        return true;
        }
        for(temp = ini.sig; temp != fin; temp = temp.sig){
            if(temp.valor.equals(valor)){
                temp.sig.ant = temp.ant;
                temp.ant.sig = temp.sig;
                temp.sig = temp.ant = null;
                temp = null;
                return true;
            }
        }
        return false;
    }
    
        public String mostrar(){
    String cad="";
    for(temp=ini;temp!=null;temp=temp.sig){
    cad+=temp.valor+", Prioridad: "+temp.prioridad+"\n";}
    return cad;
    }
    
    public boolean igual(ListaDoblePrioridad lp2){
        for(NodoDoblePrioridad temp = this.ini,temp2 = lp2.ini;temp != null;temp = temp.sig,temp2 = temp2.sig){
            if(temp == null && temp2 != null){return false;} 
            if(temp2 == null && temp != null){return false;} 
            if(temp.prioridad != temp2.prioridad && !temp.valor.equals(temp2.valor)){return false;} 
        }
        return true;
    }
    
}
