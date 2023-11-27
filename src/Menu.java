import java.util.Scanner;

public class Menu {
    int respuesta, cant;


    public Menu() {
    }

    public Menu(int respuesta, int cant) {
        this.respuesta = respuesta;
        this.cant = cant;
    }

    public void menu (){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----MENU DEL REGISTRO DE PRODUCTOS-----");
        System.out.println("1. ALIMENTO");
        System.out.println("2. ELECTRODOMESTICO");
        System.out.println("3. TECNOLOGIA");
        System.out.println("INGRESE QUE TIPO DE PRODUCTO DESEA REGISTRAR: ");
        this.respuesta = sc.nextInt();

        if (respuesta==1){
            Alimento a1 = new Alimento();
            a1.ingresarProducto();
            a1.imprimirProducto();
            a1.TotalPrecio();

        } else if (respuesta==2){
            Electrodomestico e1 = new Electrodomestico();
            e1.ingresarProducto();
            e1.imprimirProducto();
            e1.TotalPrecio();
        }else if(respuesta==3){
            Tecnologia t1 = new Tecnologia();
            t1.ingresarProducto();
            t1.imprimirProducto();
            t1.TotalPrecio();
        }else{
            System.out.println("NO EXISTE OPCION");
        }

    }

    public void registroProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("COLOQUE LA CANTIDAD DE PRODUCTOS A REGISTRAR: ");
        this.cant= sc.nextInt();
        for(int i=0;i<cant;i++) {
            menu();
        }
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }
}
