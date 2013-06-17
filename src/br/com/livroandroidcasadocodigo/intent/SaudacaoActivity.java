package br.com.livroandroidcasadocodigo.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import br.com.livroandroidcasadocodigo.R;

public class SaudacaoActivity extends Activity {
	
	public static final String EXTRA_NOME_USUARIO = "helloandroid.EXTRA_NOME_USUARIO";
	public static final String ACAO_EXIBIR_SAUDACAO = "helloandroid.ACAO_EXIBIR_SAUDACAO";
	public static final String CATEGORIA_SAUDACAO = "helloandroid.CATEGORIA_SAUDACAO";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.saudacao);
		
		TextView txtSaudacao = (TextView) findViewById(R.id.txtSaudacao);
		
		Intent intent = getIntent();
		if (intent.hasExtra(EXTRA_NOME_USUARIO)) {
			String saudacao = getResources().getString(R.string.saudacao);
			txtSaudacao.setText(saudacao + " " + intent.getStringExtra(EXTRA_NOME_USUARIO));
		} else {
			txtSaudacao.setText("O nome do usuário não foi informado");
		}
	}

}
