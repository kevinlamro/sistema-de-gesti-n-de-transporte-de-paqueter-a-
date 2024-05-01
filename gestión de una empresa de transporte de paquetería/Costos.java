
public class Costos {
    protected float largo;
    protected float ancho;
    protected float alto;
    protected float distancia;
    protected int precioEnvio;
    protected int total;
    protected int manejoEspecial = 0;
    protected int entregaRapida = 0;

    public Costos(float largo, float ancho, float alto,float distancia) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.distancia = distancia;

    }
    //metodo peso y costo total para paquete estandar
    public void DimensionPrecioEstandar() {
        final int kilo = 500;
        final float tarifa = 1.15f;
        final int kilometraje = 800;

        float peso = (largo * ancho * alto) / 366;
        int Entero = (int) peso; // Obtener la parte entera
        float Decimal = peso - Entero; // Obtener la parte decimal
        
        if (Decimal >= 0.5f) {
            precioEnvio = (int)(((Entero + 1) * kilo * tarifa) + ( distancia* kilometraje));
            total = (int)(((Entero + 1) * kilo * tarifa) + ( distancia* kilometraje));           
        } else {
            precioEnvio =(int)((peso * kilo * tarifa) + ( distancia* kilometraje));
            total = (int)((peso * kilo * tarifa) + ( distancia* kilometraje));
        }   
    }
    //metodo peso y costo total para documento urgente 
    public void DimensionPrecioUrgente() {
        final int kilo = 500;
        final float tarifa = 1.15f;
        final int kilometraje = 800;
        entregaRapida = 2000;

        float peso = (largo * ancho * alto) / 366;
        int Entero = (int) peso; // Obtener la parte entera
        float Decimal = peso - Entero; // Obtener la parte decimal
        
        if (Decimal >= 0.5f) {
            precioEnvio = (int)(((Entero + 1) * kilo * tarifa) + ( distancia* kilometraje));
            total = (int)(((Entero + 1) * kilo * tarifa) + ( distancia* kilometraje) + entregaRapida );           
        } else {
            precioEnvio =(int)((peso * kilo * tarifa) + ( distancia* kilometraje));
            total = (int)((peso * kilo * tarifa) + ( distancia* kilometraje)+entregaRapida);
        }    
    }
    //metodo peso y costo total para articulos fragiles
    public void DimensionPrecioFragil() {
        final int kilo = 500;
        final float tarifa = 1.15f;
        final int kilometraje = 800;
        manejoEspecial = 1500;


        float peso = (largo * ancho * alto) / 366;
        int Entero = (int) peso; // Obtener la parte entera
        float Decimal = peso - Entero; // Obtener la parte decimal
        
        if (Decimal >= 0.5f) {
            precioEnvio = (int)(((Entero + 1) * kilo * tarifa) + ( distancia* kilometraje));
            total = (int)(((Entero + 1) * kilo * tarifa) + ( distancia* kilometraje) + manejoEspecial);           
        } else {
            precioEnvio =(int)((peso * kilo * tarifa) + ( distancia* kilometraje));
            total = (int)((peso * kilo * tarifa) + ( distancia* kilometraje) + manejoEspecial);
        } 
    }
    //getter
    public float getDistancia() {return distancia;}
    //setter
    public void setDistancia(float distancia) {this.distancia = distancia;}
}
