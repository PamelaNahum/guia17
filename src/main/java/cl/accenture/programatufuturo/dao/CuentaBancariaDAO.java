package cl.accenture.programatufuturo.dao;

import cl.accenture.programatufuturo.model.CuentaBancaria;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CuentaBancariaDAO {
    protected Conexion conexion;
    public CuentaBancariaDAO(){
        this.conexion= new Conexion("localhost","banco","root",3306,"Pamela14","jdbc:mysql");
    }
    public void agregar (CuentaBancaria c){
        try {
            try {
                PreparedStatement psInsert = this.conexion.conectar().prepareStatement("INSERT INTO ")
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (SinconexionException e) {
                e.printStackTrace();
            }
        }


    }
}
