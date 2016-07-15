package com.roger.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Numeros implements Procesos {

	@Override
	public Object ejecutar() {
		List<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++)
			lista.add(i);
		
		return lista;
	}
}
