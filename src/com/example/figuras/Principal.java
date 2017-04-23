package com.example.figuras;


import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Principal extends Activity {
	private ListView lv;
	private Resources recursos;
	private String [] opc;
	private Intent i;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
	
		recursos=this.getResources();
		lv=(ListView)findViewById(R.id.lstFiguras);
		opc= recursos.getStringArray(R.array.lstPrincipal);
		ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
		lv.setAdapter(adapter);
		
		 lv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			 public void onItemClick(AdapterView<?> parent, View v, int posicion, long id) {	
				
				switch(posicion){
				case 0:
					i= new Intent(Principal.this,Areas.class);
					startActivity(i);
					break;
				case 1:
					i= new Intent(Principal.this,Volumenes.class);
					startActivity(i);
					break;
				case 2:
					i= new Intent(Principal.this,Mostrar.class);
					startActivity(i);
					break;
				}
				
				
			}
			
			
		});
	
	
	}

}
