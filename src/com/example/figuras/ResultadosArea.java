package com.example.figuras;


public class ResultadosArea {
	
		 private String operacion;
		 private double dato;
		 private double resultado;
		 
		public ResultadosArea(String operacion, double dato, double resultado) {
			this.operacion = operacion;
			this.dato = dato;
			this.resultado = resultado;
		}

		public String getOperacion() {
			return operacion;
		}

		public void setOperacion(String operacion) {
			this.operacion = operacion;
		}

		public double getDato() {
			return dato;
		}

		public void setDato(double dato) {
			this.dato = dato;
		}

		public double getResultado() {
			return resultado;
		}

		public void setResultado(double resultado) {
			this.resultado = resultado;
		}
		
		public void guardar(){
			DatosG.Guardar(this); 
		
		
}
		}
