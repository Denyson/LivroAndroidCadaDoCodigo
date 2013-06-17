package br.com.livroandroidcasadocodigo.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import br.com.livroandroidcasadocodigo.R;

public class MainActivity extends Activity {
	
	private EditText edtNome;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_intent);
		
		edtNome = (EditText) findViewById(R.id.edtNome);
	}
	
	public void surpreenderUsuario(View v) {
		Intent intent = new Intent(SaudacaoActivity.ACAO_EXIBIR_SAUDACAO);
		intent.addCategory(SaudacaoActivity.CATEGORIA_SAUDACAO);
		
		String texto = edtNome.getText().toString();
		intent.putExtra(SaudacaoActivity.EXTRA_NOME_USUARIO, texto);
		
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
