package com.example.figuras;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cono extends Activity {
	private EditText txtradio;
	private EditText txtaltura;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cono);
	
		txtradio = (EditText) findViewById(R.id.txtRadioCono);
		txtaltura = (EditText) findViewById(R.id.txtAlturaCono);
		
	}

	public void calcularCono(View view) {
		 String operacion="Volumen del cono";
		
		 double dato,altura, resultado = 0 ,pi=3.1415;
		
		if (validar()) {
			dato = Integer.parseInt(txtradio.getText().toString()) ;
			altura = Integer.parseInt(txtaltura.getText().toString()) ;
			resultado=(((pi)*(Math.pow(dato,2))*(altura))/3);
			
			ResultadosArea p = new ResultadosArea(operacion, dato, resultado);
			p.guardar();
			
			Toast toast = Toast.makeText(this, "Dato Guardado Exitosamente", Toast.LENGTH_SHORT);
	        toast.show();
	        
			Intent intent = new Intent(Cono.this, ResultadoCono.class);
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
		txtaltura.setText("");
	    txtradio.requestFocus();
	}
		public boolean validar() {
			if (txtradio.getText().toString().trim().equals("")) {
				return false;
			}  else if (txtaltura.getText().toString().trim().equals("")) {
				return false;
			}  else {
				return true;
			}
	}

	
	
	
}
