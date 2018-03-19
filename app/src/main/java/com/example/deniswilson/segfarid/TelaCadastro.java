package com.example.deniswilson.segfarid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class TelaCadastro extends AppCompatActivity {

    EditText edtEmail, edtSenhaCad, edtSenhaConf, edtTelefone;
    Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tela_cadastro);


        edtEmail = (EditText)findViewById(R.id.edtCadEmail);
        edtSenhaCad = (EditText)findViewById(R.id.edtCadSenha);
        edtSenhaConf = (EditText)findViewById(R.id.edtCadSenhaConf);
        edtTelefone = (EditText)findViewById(R.id.edtCadTelefone);
        btnCadastrar = (Button)findViewById(R.id.btnCadastrar);





    }
}
