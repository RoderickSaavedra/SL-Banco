package com.siempreListobanco.banco.modelos;

import com.siempreListobanco.banco.modelos.cons.Estatus;
import com.siempreListobanco.banco.modelos.cons.Recursos;
import java.time.LocalDateTime;

public class movimiento {

    private Recursos tipoMovimiento;
    private Estatus estatusMovimiento;
    private LocalDateTime fechaMovimiento;
    private String IdentificadorCuenta;
    private String IdentificadorCliente;

    public movimiento(Recursos tipoMovimiento, Estatus estatusMovimiento, LocalDateTime fechaMovimiento, String identificadorCuenta, String identificadorCliente) {
        this.tipoMovimiento = tipoMovimiento;
        this.estatusMovimiento = estatusMovimiento;
        this.fechaMovimiento = fechaMovimiento;
        IdentificadorCuenta = identificadorCuenta;
        IdentificadorCliente = identificadorCliente;
    }

    public Recursos getTipoMovimiento() {
        return tipoMovimiento;
    }

    public Estatus getEstatusMovimiento() {
        return estatusMovimiento;
    }

    public LocalDateTime getFechaMovimiento() {
        return fechaMovimiento;
    }

    public String getIdentificadorCuenta() {
        return IdentificadorCuenta;
    }

    public String getIdentificadorCliente() {
        return IdentificadorCliente;
    }
}
