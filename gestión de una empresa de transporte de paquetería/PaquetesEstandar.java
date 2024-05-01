import java.io.*;

public class PaquetesEstandar extends Costos {
    //atributos
    private File registro;
    private FileWriter Escribir;
    private String nombre;
    private String tipoEnvio;
    private String direccion;
    private String contenido;   
    //constructor
    public PaquetesEstandar(float largo, float ancho, float alto, float distancia, String nombre, String tipoEnvio,
            String direccion, String contenido) {
        super(largo, ancho, alto, distancia);
        this.nombre = nombre;
        this.tipoEnvio = tipoEnvio;
        this.direccion = direccion;
        this.contenido = contenido;
    }
//metodo para crear el archivo
 public void CrearArchivo(){
        registro = new File("C:/Users/User/Documents/factura de envio estandar.txt");
        try {
            if (registro.createNewFile()) {System.out.println("se creo bien el archivo");}
            else{System.out.println("no se creo el archivo");} 
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
        //metodo para escribir el archivo
        public void CrearFactura() throws IOException {
        Escribir = new FileWriter(registro);
              Escribir.write("|--------------------------------------------------------------|\n");
              Escribir.write("|----------------------Lambrano Transport----------------------|\n");
              Escribir.write("|--------------------------------------------------------------|\n");
              Escribir.write("|       Nombre : " +nombre+ "                                         "+"|\n");
              Escribir.write("|ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ|\n");
              Escribir.write("|       Tipo de envio : " +tipoEnvio+ "                               "+"|\n");
              Escribir.write("|ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ|\n");
              Escribir.write("|       Direccion : " + direccion + "                     "+"|\n");
              Escribir.write("|ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ|\n");
              Escribir.write("|       Contenido : " +contenido+ "                                    "+"|\n");
              Escribir.write("|ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ|\n");
              Escribir.write("|       Precio de envio + 15% de tarifa : " +precioEnvio+ "$               "+"|\n");
              Escribir.write("|ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ|\n");
              Escribir.write("|       Manejo especial : " +manejoEspecial+ "$                                  "+" |\n");
              Escribir.write("|ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ|\n");
              Escribir.write("|       Envio  exprés : " +entregaRapida+ "$                                    "+" |\n");
              Escribir.write("|ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ|\n");
              Escribir.write("|       Preciototal : " +total+ "$                                   "+"|\n");
              Escribir.write("|ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ|\n");
              Escribir.write("|--------------------------------------------------------------|\n");        
              Escribir.close();
   }
    //getter
    public String getDireccion() {return direccion;}
    public String getContenido() {return contenido;}
    public String getNombre() {return nombre;}
    public String getTipoEnvio() {return tipoEnvio;}
    //setter
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public void setContenido(String contenido) {this.contenido = contenido;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setTipoEnvio(String tipoEnvio) {this.tipoEnvio = tipoEnvio;}
}