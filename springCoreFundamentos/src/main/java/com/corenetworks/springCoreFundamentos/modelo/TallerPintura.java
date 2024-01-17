package com.corenetworks.springCoreFundamentos.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@Component("tp")

public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "El coche se esta pìntando"+c.getMatricula()+"modelo"+c.getModelo()+"\n ya ha salido de la pintura";
    }
}
