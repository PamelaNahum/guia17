package cl.accenture.programatufuturo.model;

public class CuentaBancaria {
    protected String idcuenta;
    protected int saldoDisponible;
    protected String tipoCuenta;

    public CuentaBancaria(String idcuenta, int saldoDisponible, String tipoCuenta) {
        this.idcuenta = idcuenta;
        this.saldoDisponible = saldoDisponible;
        this.tipoCuenta = tipoCuenta;
    }

    public String getIdcuenta() {
        return idcuenta;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }
}
