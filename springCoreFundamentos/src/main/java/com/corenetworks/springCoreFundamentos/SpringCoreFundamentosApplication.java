package com.corenetworks.springCoreFundamentos;

import com.corenetworks.springCoreFundamentos.modelo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringCoreFundamentosApplication implements CommandLineRunner {
	@Autowired
	SeguroCoche sC1;
	@Autowired
	Jefe j1;
	@Autowired
	Director d1;
	@Autowired
	Secretario s1;

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreFundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Instanciar un taller,Coche y un seguro coche
		//TallerPintura tP1=new TallerPintura();

		//Coche c1=new Coche("8010CVF","Aventador");

		//SeguroCoche sC1=new SeguroCoche(tP1,"Mapfre");
		sC1.setAseguradora("Mapfre");
		System.out.println(sC1.toString());
		s1.setEmpresa("Corenetworks");
		System.out.println(s1.getInforme());
		System.out.println(j1.getInforme());
		System.out.println(d1.getInforme());
	}
}
