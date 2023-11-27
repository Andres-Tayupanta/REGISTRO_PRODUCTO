import java.util.Scanner;

public class Producto {
    String nombre;
    double precio;
    String codigo;

    String marca;
    int cantidad;

    public Producto(String nombre, double precio, String codigo, String marca, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public Producto() {

    }

    public void ingresarProducto(){
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

    }

    public void imprimirProducto(){
        System.out.println("Nombre del producto: "+nombre);
        System.out.println("Precio del producto:"+precio);
        System.out.println("Codigo del producto:");
        System.out.println("Marca del producto:"+marca);
        System.out.println("Cantidad del producto:"+cantidad);

    }

    public void TotalPrecio(){
        double total =precio*cantidad;
        System.out.println("El total a pagar es:"+total);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
