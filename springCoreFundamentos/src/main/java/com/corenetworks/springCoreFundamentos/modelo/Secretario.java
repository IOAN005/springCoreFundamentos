package com.corenetworks.springCoreFundamentos.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Secretario implements Empleado{
    @Autowired

    private IInforme i;
    private String empresa;
    private String email;

    @Override
    public String getTareas() {
        return "Lleva el registro de las reuniones";
    }

    @Override
    public String getInforme() {
        return i.getInforme();
    }
}
