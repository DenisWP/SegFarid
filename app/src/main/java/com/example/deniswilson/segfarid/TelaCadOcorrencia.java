package com.example.deniswilson.segfarid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TelaCadOcorrencia extends AppCompatActivity {

    TextView NomeRelator ;
    EditText Relatado, Ocorrencia;
    Spinner TipoRelato, LocalOcorrencia;
    Button enviarDados;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tela__cad_ocorrencia);

        NomeRelator = (TextView) findViewById(R.id.txtRelator);
        Relatado = (EditText) findViewById(R.id.edtCadRelatado);
        Ocorrencia = (EditText) findViewById(R.id.edtOcorrencia);
        TipoRelato = (Spinner) findViewById(R.id.spnTipoRelato);
        LocalOcorrencia = (Spinner) findViewById(R.id.spnLocalOcorrencia);
        enviarDados = (Button) findViewById(R.id.btnEnviar);


    }
}
