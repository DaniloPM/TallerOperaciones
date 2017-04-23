package com.example.figuras;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Circulo extends Activity {
	private EditText txtradio;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_circulo);
		txtradio = (EditText) findViewById(R.id.txtRadioCirculo);
	}
		public void calcularCirculo(View view) {
			String operacion="Area del circulo";
			
			
			double dato, resultado = 0, pi=3.1415;
			
			if (validar()) {
				dato = Integer.parseInt(txtradio.getText().toString()) ;
				resultado=((dato*dato)*pi);
				
				ResultadosArea p = new ResultadosArea(operacion, dato, resultado);
				p.guardar();
				
				Toast toast = Toast.makeText(this, "Dato Guardado Exitosamente", Toast.LENGTH_SHORT);
		        toast.show();
		        
				Intent intent = new Intent(Circulo.this, ResultadoCirculo.class);
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
