import java.io.IOException;

public class Principal {
   public static void main(String[] args) throws IOException {
    //orden de datos : largo,ancho,alto,distancia,nombre,tipo de envio,direccion,contenido
    PaquetesEstandar mostrar = new PaquetesEstandar(18, 18, 18, 18, "kevin", 
    "Estandar", "trasnversal #52a 28-35", "mochila");
    mostrar.DimensionPrecioEstandar();
    mostrar.CrearArchivo();
    mostrar.CrearFactura();
    
    DocumentosUrgentes mostrar1 = new DocumentosUrgentes(18, 18, 18, 18, "kevin", 
    "Urgente", "trasnversal #52a 28-35", "Arte antiguo");
    mostrar1.DimensionPrecioUrgente();
    mostrar1.CrearArchivoUrgente();
    mostrar1.CrearFacturaUrgente();

    ArticulosFragiles mostrar2 = new ArticulosFragiles(18, 18, 18, 18, "kevin", 
    "Fragil", "trasnversal #52a 28-35", "Platos");
    mostrar2.DimensionPrecioFragil();
    mostrar2.CrearArchivoFragil();
    mostrar2.CrearFacturaFragil();



   }
}