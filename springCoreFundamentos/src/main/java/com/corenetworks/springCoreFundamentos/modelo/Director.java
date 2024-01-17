package com.corenetworks.springCoreFundamentos.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Director implements Empleado {
    @Autowired

    private IInforme i;

    @Override
    public String getTareas() {
        return "El director marca el rumbo a la empresa";
    }

    @Override
    public String getInforme() {
        return i.getInforme();
    }
}
