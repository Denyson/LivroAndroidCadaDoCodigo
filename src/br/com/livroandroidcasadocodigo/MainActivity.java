package br.com.livroandroidcasadocodigo;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText edtNome;
	private TextView txtSaudacao;
	private String saudacao;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		edtNome = (EditText) findViewById(R.id.edtNome);
		txtSaudacao = (TextView) findViewById(R.id.txtSaudacao);
		saudacao = getResources().getString(R.string.saudacao);
	}
	
	public void surpreenderUsuario(View v) {
		Editable texto = edtNome.getText();
		txtSaudacao.setText(saudacao + " " + texto.toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
