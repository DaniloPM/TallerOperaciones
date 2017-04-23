package com.example.figuras;

import java.util.ArrayList;

public class DatosG {
private static ArrayList<ResultadosArea> base = new ArrayList<ResultadosArea>();
	
	public static void Guardar(ResultadosArea p){
		base.add(p);
	}
	
	public static ArrayList<ResultadosArea> Obtener(){
		return base;
	}
}
