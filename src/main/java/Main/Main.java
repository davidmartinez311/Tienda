package Main;

import Datos.ProductoDao;
import Modelo.Producto;

public class Main {

    public static void main (String[] args)
    {
        System.out.println("1. Creando la tabla");
        ProductoDao.crearTabla();

        System.out.println("\n2. Insertando registros");
        ProductoDao.insertarProducto();

        System.out.println("\n3. Listando registros de la base de datos:");
        imprimirLista();

        System.out.println("\n4. Actualizando producto con ID 1");
        ProductoDao.actualizarProducto(1,"Teclado",50);

        System.out.println("\n5. Eliminando producto con ID 2");
        ProductoDao.eliminarProducto(2);


        System.out.println("\n6. Resultados:");
        imprimirLista();
    }

    private static void imprimirLista() {
        System.out.printf("%-5s %-25s %10s%n", "ID", "PRODUCTO", "CANTIDAD");
        System.out.println("--------------------------------------------------");
        for (Producto p : ProductoDao.listarProductos()) {
            System.out.printf("%-5d %-25s %10d%n", p.getId(), p.getNombre(), p.getCantidad());
        }
    }
}
