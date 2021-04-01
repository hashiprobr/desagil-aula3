package br.edu.insper.desagil.aula3;

import java.util.List;
import java.util.Map;

public class Media {

	public double calcula(List<Map<String, Integer>> notas) {
		int num = 0;
		int den = 0;
		for (Map<String, Integer> nota: notas) {
			num += nota.get("peso") * nota.get("valor");
			den += nota.get("peso");
		}
		return (double) num / den;
	}

}
