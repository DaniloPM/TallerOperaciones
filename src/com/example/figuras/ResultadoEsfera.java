package com.example.figuras;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class ResultadoEsfera extends Activity {
	private TextView txtResultado;
	private double  resultado;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resultado_esfera);
		txtResultado = (TextView) findViewById(R.id.txtResultadoEsfera);
		Bundle bundle = this.getIntent().getExtras();
		
		resultado = bundle.getDouble("RESULTADO");
		
			
		txtResultado.setText( "\t "+ "\t "+"ESFERA"+"\n "+"\n "+"\n " +"RESULTADO" +
				"\n"+
		"EL VOLUMEN ES: "+ resultado + "\n");
	}

	
}
