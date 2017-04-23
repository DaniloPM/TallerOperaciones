package com.example.figuras;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class ResultadoCubo extends Activity {
	private TextView txtResultado;
	private double  resultado;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resultado_cubo);
	

		txtResultado = (TextView) findViewById(R.id.txtResultadoCubo);
		Bundle bundle = this.getIntent().getExtras();
		
		resultado = bundle.getDouble("RESULTADO");
		
			
		txtResultado.setText( "\t "+ "\t "+"CUBO"+"\n "+"\n "+"\n " +"RESULTADO" +
				"\n"+
		"EL VOLUMEN ES: "+ resultado + "\n");
	}

	

}
