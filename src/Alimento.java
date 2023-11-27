import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alimento  extends  Producto{
    private String fechaElaboracion;
    private  String fechaExpiracion;

    List<String> listaIngredientes =new ArrayList<>();

    public Alimento(String nombre, double precio, String codigo, String marca, int cantidad, String fechaElaboracion) {
        super(nombre, precio, codigo, marca, cantidad);
        this.fechaElaboracion = fechaElaboracion;
    }
    public Alimento() {

    }


    @Override
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
        System.out.println("Ingrese la fecha de elaboracion del producto:");
        this.fechaElaboracion = sc.next();
        System.out.println("Ingrese la fecha de caducidad del producto:");
        this.fechaExpiracion = sc.next();
        System.out.println("Ingrese la cantidad del producto:");
        this.cantidad = sc.nextInt();

        while (true){
            System.out.println("Ingredientes del producto: (si desea salir escriba no):");
            String respuesta= sc.next();
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            } else {
                listaIngredientes.add(respuesta);
            }
        }

    }

    public void imprimirProducto(){
        System.out.println("Nombre del producto: "+nombre);
        System.out.println("Precio del producto:"+precio);
        System.out.println("Codigo del producto:");
        System.out.println("Marca del producto:"+marca);
        System.out.println("Cantidad del producto:"+cantidad);
        System.out.println("Elaboracion:"+fechaElaboracion);
        System.out.println("Caducidad:"+fechaExpiracion);
        System.out.println("Ingredientes:"+listaIngredientes);
    }





    public String getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(String fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public List<String> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(List<String> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

}
