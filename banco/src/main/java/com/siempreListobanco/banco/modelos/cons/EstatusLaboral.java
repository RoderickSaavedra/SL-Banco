package com.siempreListobanco.banco.modelos.cons;

public enum EstatusLaboral {

    DESEMPLEADO(1), EMPLEADO(2);

    private int estatus;

    EstatusLaboral(int estatus){
        this.estatus = estatus;
    }

    public int getEstatus(){
        return estatus;
    }

}
