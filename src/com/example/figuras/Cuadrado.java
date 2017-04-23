package com.example.figuras;




import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cuadrado extends Activity {
	private EditText txtlado;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cuadrado);
		txtlado = (EditText) findViewById(R.id.txtLadoCuadrado);
		
	}
	
	public void calcularCuadrado(View view) {
		String operacion="Area del cuadrado";
		
		 double dato, resultado = 0;
		
		if (validar()) {
			dato = Integer.parseInt(txtlado.getText().toString()) ;
			resultado=dato*dato;
			
			ResultadosArea p = new ResultadosArea(operacion, dato, resultado);
			p.guardar();
			
			Toast toast = Toast.makeText(this, "Dato Guardado Exitosamente", Toast.LENGTH_SHORT);
	        toast.show();
	        
			Intent intent = new Intent(Cuadrado.this, ResultadoCuadrado.class);
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
		txtlado.setText("");
	    txtlado.requestFocus();
	}
		public boolean validar() {
			if (txtlado.getText().toString().trim().equals("")) {
				return false;
			}  else {
				return true;
			}
	}

	
	}
	



