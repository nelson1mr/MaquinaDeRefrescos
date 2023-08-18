

public class MaquinaDeRefrescos{
    
    private int costo;
    private int cantidad;
    private int caja;
    
    public MaquinaDeRefrescos(int costo, int cantidad, int caja){
        this.costo = costo;
        this.cantidad = cantidad;
        this.caja = caja;
    }
    
    public int getCosto(){
        return this.costo;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
    
    public int getCaja(){
        return this.caja;
    }
    
    public void setCosto(int costo){
        this.costo = costo;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public void setCaja(int caja){
        this.caja = caja;
    }
    
    public void solicitarRefresco(int dinero){
        if(dinero == getCosto()){
            entregarRefresco();
        }
    }
    
    public void actualizarPrecio(int monto){
        setCosto(monto);
    }
    
    public void llenarMaquina(int refrescos){
        setCantidad(getCantidad() + refrescos);
    }
    
    public void entregarRefresco(){
        setCantidad(getCantidad() - 1);
    }
}
