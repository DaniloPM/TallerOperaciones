package com.example.figuras;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class ResultadoTriangulo extends Activity {
	private TextView txtResultado;
	private double  resultado;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resultado_triangulo);
		
		txtResultado = (TextView) findViewById(R.id.txtResultadoTriangulo);
		Bundle bundle = this.getIntent().getExtras();
		
		resultado = bundle.getDouble("RESULTADO");
		
			
		txtResultado.setText( "\t "+ "\t " +"TRIANGULO"+"\n "+"\n "+"\n " +"RESULTADO" +
				"\n"+
		"EL AREA ES: "+ resultado + "\n");
	}

	

}
