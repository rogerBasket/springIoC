package com.roger.beans;

import org.springframework.stereotype.Service;

@Service
public class Mensaje implements Procesos {

	@Override
	public Object ejecutar() {
		return new StringBuilder().append("hola").append(" mundo").toString();
	}
}
