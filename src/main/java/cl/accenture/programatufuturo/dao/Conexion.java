package cl.accenture.programatufuturo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
class SinconexionException extends Exception{
    public SinconexionException (String mensaje){
        super(mensaje);
    }
}

public class Conexion {
    protected String host, baseDeDatos, usuario, Driver;
    protected int puerto;
    private String contraseña;

    public Conexion(String host, String baseDeDatos, String usuario, int puerto, String contraseña, String Driver) {
        this.host = host;
        this.baseDeDatos = baseDeDatos;
        this.usuario = usuario;
        this.puerto = puerto;
        this.contraseña=contraseña;
        this.Driver=Driver;
    }
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getBaseDeDatos() {
        return baseDeDatos;
    }
    public void setBaseDeDatos(String baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getDriver() {
        return Driver;
    }
    public void setDriver(String driver) {
        Driver = driver;
    }
    public int getPuerto() {
        return puerto;
    }
    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Connection conectar() throws SinconexionException{
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(this.Driver+"://" + this.host + ":" + this.puerto + "/" + this.baseDeDatos , this.usuario , this.contraseña);
        } catch (ClassNotFoundException e) {
            System.out.println("no funciono");

        } catch (SQLException e) {
            throw new SinconexionException("no se pudo concetar");
            }
        return conexion;
    }
}

