
import java.util.Stack;

public class PilaConLibreria {
    Stack<NTF>pilaNTF;
    public PilaConLibreria(){
        pilaNTF = new Stack();  
    }
    public void addNtf(NTF NTF){
        pilaNTF.add(NTF);
    }
        public String LitaNtf(){
            String Cadena = "Lista";
            if (!pilaNTF.empty()){
                for(int i =0; i<pilaNTF.size(); i++ ){
                   Cadena+="\n Id"+pilaNTF.get(i).getId();
                   Cadena+="\n Nombre de la Acción"+pilaNTF.get(i).getAccion();
                   Cadena+="\n Precio de la acción al día 27 de Febrero 2022"+pilaNTF.get(i).getPrecio();
                }
            }
            else {
            Cadena += "\n VACIA";
            }
            return Cadena;
        }
        
          public String getNtf(String Accion){
            String Cadena = "Lista";
            if (!pilaNTF.empty()){
                for(int i =0; i<pilaNTF.size(); i++ ){
                    
                    if (pilaNTF.get(i).getAccion().equals(Accion)){
                        Cadena+="\n Id"+pilaNTF.get(i).getId();
                        Cadena+="\n Nombre de la Acción"+pilaNTF.get(i).getAccion();
                        Cadena+="\n Precio de la acción al día 27 de Febrero 2022"+pilaNTF.get(i).getPrecio();
                        return Cadena;
                    }
                }
            }
            else {
            Cadena += "\n VACIA";
            }
            return Cadena;
        }
    }

