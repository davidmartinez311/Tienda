package Datos;

import Modelo.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao {

    public static void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS producto(" +
                "id INT PRIMARY KEY, nombre VARCHAR(50), cantidad INT)";
        try (Connection cn = ConexionDB.obtenerConexion();
             Statement st = cn.createStatement()) {
            st.execute(sql);
            System.out.println("Tabla producto lista.");
        } catch (SQLException e) {
            System.out.println("Error al crear la tabla: " + e.getMessage());
        }
    }

    public static void insertarProducto() {
        String sql = "INSERT INTO producto (id, nombre, cantidad) VALUES (?, ?, ?)";
        try (Connection cn = ConexionDB.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, 1);
            ps.setString(2, "PS10");
            ps.setInt(3, 15);
            ps.executeUpdate();

            ps.setInt(1, 2);
            ps.setString(2, "Pantalla");
            ps.setInt(3, 8);
            ps.executeUpdate();
/*
            ps.setInt(1, 3);
            ps.setString(2, "PS10");
            ps.setInt(3, 50);
            ps.executeUpdate();
*/
            System.out.println("Productos insertados.");
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }

    public static List<Producto> listarProductos() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT id, nombre, cantidad FROM producto";

        try (Connection cn = ConexionDB.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setCantidad(rs.getInt("cantidad"));

                lista.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar: " + e.getMessage());
        }

        return lista;
    }


    public static void actualizarProducto(int id, String nuevoNombre, int nuevaCantidad) {
        String sql = "UPDATE producto SET nombre = ?, cantidad = ? WHERE id = ?";

        try (Connection cn = ConexionDB.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, nuevoNombre);
            ps.setInt(2, nuevaCantidad);
            ps.setInt(3, id);

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Producto actualizado correctamente.");
            } else {
                System.out.println("No se encontró ningún producto con el ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }


    public static void eliminarProducto(int id) {
        String sql = "DELETE FROM producto WHERE id = ?";

        try (Connection cn = ConexionDB.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, id);

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Producto eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún producto con el ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
    }
}
