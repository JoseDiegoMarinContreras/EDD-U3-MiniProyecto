
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class BaseDeDatos {
    protected ListaDoblePrioridad lp;
    protected String url;
    
    BaseDeDatos(){
    url = null;
    lp = new ListaDoblePrioridad();
    }
    
    BaseDeDatos(String url){
        this.url = url;
    try{
    ObjectInputStream io = new ObjectInputStream(new FileInputStream(url));
    lp = new ListaDoblePrioridad();
    for(NodoDoblePrioridad temp = (NodoDoblePrioridad)io.readObject();temp!=null;temp = (NodoDoblePrioridad)io.readObject()){
        lp.insertar(temp.valor, temp.prioridad);
    }
    io.close();
    }catch(FileNotFoundException err){} 
    catch (IOException ex) {} 
    catch (ClassNotFoundException ex) {}     
    }

    public boolean borrar(Object val){
        if(lp.eliminar(val)){return guardar();}
        return false;
    }
    
    public boolean guardar(){
    try{    
    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(url));
    for(NodoDoblePrioridad temp = lp.ini;temp != null;temp = temp.sig){
    os.writeObject(temp);}
    os.close();}catch(FileNotFoundException err){} catch (IOException ex) {return false;}
    return true;
}
}
