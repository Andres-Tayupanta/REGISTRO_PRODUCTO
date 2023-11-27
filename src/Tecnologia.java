import java.util.Scanner;

public class Tecnologia extends Producto{
    private String garantia;
    private int vidaUtil;

    public Tecnologia(String nombre, double precio, String codigo, String marca, int cantidad, String garantia, int vidaUtil) {
        super(nombre, precio, codigo, marca, cantidad);
        this.garantia = garantia;
        this.vidaUtil = vidaUtil;
    }

    public Tecnologia() {

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
        System.out.println("Ingrese la garantia del producto:");
        this.garantia = sc.next();
    }

    public void imprimirProducto(){
        System.out.println("Nombre del producto: "+nombre);
        System.out.println("Precio del producto:"+precio);
        System.out.println("Codigo del producto:");
        System.out.println("Marca del producto:"+marca);
        System.out.println("Cantidad del producto:"+cantidad);
        System.out.println("Garantia del producto:"+garantia);

    }




    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

}
