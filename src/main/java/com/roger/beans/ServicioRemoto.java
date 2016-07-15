package com.roger.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioRemoto {
	
	@Autowired
	private Procesos numeros;
	
	public Object datos() {
		return numeros.ejecutar();
	}
}
