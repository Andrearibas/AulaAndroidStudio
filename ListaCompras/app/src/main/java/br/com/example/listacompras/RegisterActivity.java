package br.com.example.listacompras;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private TextInputEditText editTextSenha;
    private TextInputEditText confTextSenha;
    private TextInputEditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        FloatingActionButton fab = findViewById(R.id.fab_register);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botaoClicado(v);

            }
        });

        confTextSenha = findViewById(R.id.conf_text_password);
        editTextSenha = findViewById(R.id.edit_text_password);
        editTextEmail = findViewById(R.id.edit_text_email);


    }
    public void botaoClicado(View view){
        editTextSenha.setError(null);
        confTextSenha.setError(null);
        editTextEmail.setError(null);

        if (!editTextSenha.getEditableText().toString().equals(confTextSenha.getEditableText().toString())){
            editTextSenha.setError("As senhas não conferem");
            confTextSenha.setError("As senhas não conferem");

        }else if (editTextEmail.getEditableText().toString().equals("")){
            editTextEmail.setError("Campo Obrigatorio");
        } else
            {

            Snackbar.make(view,"Usuário cadastrado com sucesso",Snackbar.LENGTH_INDEFINITE)
                    .setAction("OK", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                        }
                    }).setActionTextColor(getResources().getColor(R.color.verde))
                    .show();
        }

    }
}
