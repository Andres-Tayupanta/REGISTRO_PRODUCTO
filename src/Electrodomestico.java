import java.util.Scanner;

public class Electrodomestico extends Producto {
    private int  vidaUtilAnios;
    private String sitioFabricacion;
    private double voltajeAlimentacion;
    private  String garantia;

    public Electrodomestico() {

    }

    public Electrodomestico(String nombre, double precio, String codigo, String marca, int cantidad, int vidaUtilAnios, String sitioFabricacion, double voltajeAlimentacion, String garantia) {
        super(nombre, precio, codigo, marca, cantidad);
        this.vidaUtilAnios = vidaUtilAnios;
        this.sitioFabricacion = sitioFabricacion;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
    }
    @Override
    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto:");
        this.nombre = sc.next();
        System.out.println("Ingrese el precio del producto:");
        this.precio = sc.nextDouble();
        System.out.println("Ingrese el codigo del producto:");
        this.codigo = sc.next();
        System.out.println("Ingrese la marca del producto:");
        this.marca = sc.next();
        System.out.println("Ingrese la cantidad del producto:");
        this.cantidad = sc.nextInt();
        System.out.println("Ingrese la vida util en años del producto:");
        this.vidaUtilAnios = sc.nextInt();
        System.out.println("Ingrese el sitio de frabiracion  del producto:");
        this.sitioFabricacion = sc.next();
        System.out.println("Ingrese la capacitacion en voltaje  del producto:");
        this.voltajeAlimentacion =sc.nextDouble();
        System.out.println("Ingrese garantia  del producto en años:");
        this.garantia=sc.next();

    }

    public void imprimirProducto(){
        System.out.println("Nombre del producto: "+nombre);
        System.out.println("Precio del producto:"+precio);
        System.out.println("Codigo del producto:");
        System.out.println("Marca del producto:"+marca);
        System.out.println("Cantidad del producto:"+cantidad);
        System.out.println("Vida util en años:"+vidaUtilAnios);
        System.out.println("Voltaje:"+voltajeAlimentacion);
        System.out.println("Garantia:"+garantia);
        System.out.println("Lugra de fabricacion:"+sitioFabricacion);
    }

    public double  intervaloMantenimiento(){
        double intervalo = vidaUtilAnios/5;
        return intervalo;

    }


    public String toString(){
        return "El electrodomestico "+this.nombre+"es de marca"+this.marca;
    }

    public int getVidaUtilAnios() {
        return vidaUtilAnios;
    }

    public void setVidaUtilAnios(int vidaUtilAnios) {
        this.vidaUtilAnios = vidaUtilAnios;
    }

    public String getSitioFabricacion() {
        return sitioFabricacion;
    }

    public void setSitioFabricacion(String sitioFabricacion) {
        this.sitioFabricacion = sitioFabricacion;
    }

    public double getVoltajeAlimentacion() {
        return voltajeAlimentacion;
    }

    public void setVoltajeAlimentacion(double voltajeAlimentacion) {
        this.voltajeAlimentacion = voltajeAlimentacion;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
}
