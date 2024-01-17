package com.corenetworks.springCoreFundamentos.modelo;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Data
@Component("it2")
@Primary
public class InformeTrimestre2 implements IInforme{
    @Override
    public String getInforme() {
        return "Informe trimestre 2";
    }
}
