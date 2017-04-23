package com.example.figuras;

import java.util.ArrayList;


import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Mostrar extends Activity {

	private TableLayout tabla;
	private ArrayList<ResultadosArea> resultados;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mostrar);
		
		resultados=DatosG.Obtener();
		tabla =(TableLayout)findViewById(R.id.tblResultados);
		
		for(int i=0;i<resultados.size();i++){
			TableRow fila = new TableRow(this);
			TextView columna1= new TextView(this);
			TextView columna2= new TextView(this);
			TextView columna3= new TextView(this);
			TextView columna4= new TextView(this);
			
			columna1.setGravity(Gravity.CENTER_HORIZONTAL);
			columna2.setGravity(Gravity.CENTER_HORIZONTAL);
			columna3.setGravity(Gravity.CENTER_HORIZONTAL);
			columna4.setGravity(Gravity.CENTER_HORIZONTAL);
			
			columna1.setText(""+(i+1));
			columna2.setText(resultados.get(i).getOperacion());
			columna3.setText(""+resultados.get(i).getDato());
			columna4.setText(""+resultados.get(i).getResultado());
			
			fila.addView(columna1);
			fila.addView(columna2);
			fila.addView(columna3);
			fila.addView(columna4);
			tabla.addView(fila);
			
			
			
		}
		
		
		
	}


}
