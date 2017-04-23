package com.example.figuras;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultadoRectangulo extends Activity {
	private TextView txtResultado;
	private double  resultado;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resultado_rectangulo);

		txtResultado = (TextView) findViewById(R.id.txtResultadoRectangulo);
		Bundle bundle = this.getIntent().getExtras();
		
		resultado = bundle.getDouble("RESULTADO");
		
			
		txtResultado.setText( "\t "+ "\t " +"RECTANGULO"+"\n "+"\n "+"\n " +"RESULTADO" +
				"\n"+
		"EL AREA ES: "+ resultado + "\n");
	}

	
	

}
