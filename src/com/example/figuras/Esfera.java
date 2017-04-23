package com.example.figuras;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Esfera extends Activity {
	private EditText txtradio;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_esfera);
		txtradio = (EditText) findViewById(R.id.txtRadioEsfera);
	}

	public void calcularEsfera(View view) {
		String operacion="Volumen de la esfera";
		
		
		double dato, resultado = 0, pi=3.1415;
		
		if (validar()) {
			dato = Integer.parseInt(txtradio.getText().toString()) ;
			resultado=((4/3)*(pi)*(Math.pow(dato, 3)));
			
			ResultadosArea p = new ResultadosArea(operacion, dato, resultado);
			p.guardar();
			
			Toast toast = Toast.makeText(this, "Dato Guardado Exitosamente", Toast.LENGTH_SHORT);
	        toast.show();
	        
			Intent intent = new Intent(Esfera.this, ResultadoEsfera.class);
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
		txtradio.setText("");
	    txtradio.requestFocus();
	}
		public boolean validar() {
			if (txtradio.getText().toString().trim().equals("")) {
				return false;
			}  else {
				return true;
			}
	}
	
	
}
