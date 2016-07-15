package com.roger.beans;

import org.springframework.stereotype.Service;

@Service
public class ServicioRemoto {
	public int numeroAleatorio() {
		return (int)(Math.random()*10.0);
	}
}
