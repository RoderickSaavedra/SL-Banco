package com.siempreListobanco.banco.dao.mapper.interfaces;

import java.sql.ResultSet;

public interface BaseMapper <T>{
    public T toModel(ResultSet s);
}
