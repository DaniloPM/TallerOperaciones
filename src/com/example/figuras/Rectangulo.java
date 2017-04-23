package com.example.figuras;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Rectangulo extends Activity {
	private EditText txtbase;
	private EditText txtaltura;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rectangulo);
		txtbase = (EditText) findViewById(R.id.txtBaseRectangulo);
		txtaltura = (EditText) findViewById(R.id.txtAlturaRectangulo);
	}
	public void calcularRectangulo(View view) {
		String operacion="Area del rectangulo";
		
		double dato,altura, resultado = 0;
		
		if (validar()) {
			dato = Integer.parseInt(txtbase.getText().toString()) ;
			altura = Integer.parseInt(txtaltura.getText().toString()) ;
			resultado=dato*altura;
			
			ResultadosArea p = new ResultadosArea(operacion, dato, resultado);
			p.guardar();
			
			Toast toast = Toast.makeText(this, "Dato Guardado Exitosamente", Toast.LENGTH_SHORT);
	        toast.show();
	        
			Intent intent = new Intent(Rectangulo.this, ResultadoRectangulo.class);
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
		txtbase.setText("");
		txtaltura.setText("");
	    txtbase.requestFocus();
	}
		public boolean validar() {
			if (txtbase.getText().toString().trim().equals("")) {
				return false;
			}  else if (txtaltura.getText().toString().trim().equals("")) {
				return false;
			}  else {
				return true;
			}
	}

	
	}
	


