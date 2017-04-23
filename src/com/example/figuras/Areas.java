package com.example.figuras;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Areas extends Activity {
	private ListView lv;
	private Resources recursos;
	private String [] opc;
	private Intent i;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_areas);
	
		recursos=this.getResources();
		lv=(ListView)findViewById(R.id.lstArea);
		opc= recursos.getStringArray(R.array.lstAreas);
		ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
		lv.setAdapter(adapter);
		
		 lv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			 public void onItemClick(AdapterView<?> parent, View v, int posicion, long id) {	
				
				switch(posicion){
				case 0:
					i= new Intent(Areas.this,Cuadrado.class);
					startActivity(i);
					break;
				case 1:
					i= new Intent(Areas.this,Rectangulo.class);
					startActivity(i);
					break;
				case 2:
					i= new Intent(Areas.this,Triangulo.class);
					startActivity(i);
					break;
				case 3:
					i= new Intent(Areas.this,Circulo.class);
					startActivity(i);
					break;
				}
				
				
			}
			
			
		});
	}

	
}
