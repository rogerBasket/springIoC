package com.roger.beans;

import org.springframework.stereotype.Service;

@Service
public class Calculo implements Procesos {

	@Override
	public Object ejecutar() {
		return (int)(Math.random()*100.0);
	}
}
