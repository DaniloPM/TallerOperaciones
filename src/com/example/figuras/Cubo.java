package com.example.figuras;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cubo extends Activity {
	private EditText txtarista;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cubo);
		txtarista = (EditText) findViewById(R.id.txtAristaCubo);
	}
	public void calcularCubo(View view) {
		String operacion="Volumen del cubo";
		
		 double dato, resultado = 0;
		
		if (validar()) {
			dato = Integer.parseInt(txtarista.getText().toString()) ;
			resultado=(Math.pow(dato, 3));
			
			ResultadosArea p = new ResultadosArea(operacion, dato, resultado);
			p.guardar();
			
			Toast toast = Toast.makeText(this, "Dato Guardado Exitosamente", Toast.LENGTH_SHORT);
	        toast.show();
	        
			Intent intent = new Intent(Cubo.this, ResultadoCubo.class);
			Bundle b = new Bundle();
			b.putDouble("RESULTADO", resultado);
			intent.putExtras(b);
			startActivity(intent);
			
		} else {
			Toast toast1 = Toast.makeText(getApplicationContext(),
					"Datos Incompletos", Toast.LENGTH_SHORT);
			toast1.show();
		}
		
		

	}
	public void borrar(View view) {
		txtarista.setText("");
	    txtarista.requestFocus();
	}
		public boolean validar() {
			if (txtarista.getText().toString().trim().equals("")) {
				return false;
			}  else {
				return true;
			}
	}
	
	
}
