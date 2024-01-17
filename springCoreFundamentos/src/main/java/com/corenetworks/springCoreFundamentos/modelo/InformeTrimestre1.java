package com.corenetworks.springCoreFundamentos.modelo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("it1")
public class InformeTrimestre1 implements IInforme{
    @Override
    public String getInforme() {
        return "Informe trimestre 1";
    }
}
