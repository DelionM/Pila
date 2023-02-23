
public class NTF {
    private String Accion;
    private double Precio;

    public NTF(String Accion, double Precio) {
        this.Accion = Accion;
        this.Precio = Precio;
    }

    public String getAccion() {
        return Accion;
    }

    public double getPrecio() {
        return Precio;
    }

    String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
