
package com.emergentes.modelo;

/**
 *
 * @author ESMERALDA
 */
import java.util.ArrayList;
import java.util.Iterator;
public class GestorTareas {
    private ArrayList<Tarea> Lista;
    
    public GestorTareas(){
        Lista = new ArrayList<Tarea>();
    }
    public ArrayList<Tarea> getLista(){
        return Lista;
    }
    public void setLista(ArrayList<Tarea>Lista){
        this.Lista=Lista;
    }

    /**
     *
     * @param item
     */
    public void insertarTarea(Tarea item){
        Lista.add(item);
    }
    public void modificarTrea(int pos,Tarea item){
        Lista.set(pos,item);
    }
    public void eliminarTarea(int pos){
        Lista.remove(pos);
    }
    public int obtieneId(){
        int idaux=0;
        for(Tarea item : Lista){
            idaux = item.getId();
        }
        return idaux +1;
    }
    public int ubicarTarea(int id){
        int pos =-1;
        Iterator<Tarea>it=Lista.iterator();
        while(it.hasNext()){
        ++pos;
        Tarea aux = it.next();
        if (aux.getId()==id){
            break;
        }
    }
        return pos;
    }

   

    public void modificarTarea(int pos, Tarea objTarea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
