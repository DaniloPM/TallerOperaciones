package com.example.figuras;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class ResultadoCono extends Activity {
	private TextView txtResultado;
	private double  resultado;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resultado_cono);
		
		txtResultado = (TextView) findViewById(R.id.txtResultadoCono);
		Bundle bundle = this.getIntent().getExtras();
		
		resultado = bundle.getDouble("RESULTADO");
		
			
		txtResultado.setText( "\t "+ "\t " +"CONO"+"\n "+"\n "+"\n " +"RESULTADO" +
				"\n"+
		"EL VOLUMEN ES: "+ resultado + "\n");
	}

	

}
