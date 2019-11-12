package em.myapplication.myeconomy.infra.gui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import em.myapplication.myeconomy.R;
import em.myapplication.myeconomy.usuario.dominio.Usuario;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextLogin;
    private EditText editTextPass;
    private Button buttonL;

    private final Usuario usuario = new Usuario(this);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextLogin = (EditText) findViewById(R.id.editTextLogin);
        editTextPass = (EditText) findViewById(R.id.editTextPass);
        buttonL = (Button) findViewById(R.id.buttonL);

        buttonL.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.buttonL):{
                boolean valido = true;
                usuario.setEmail(editTextLogin.getText().toString().trim().toLowerCase());
                usuario.setSenha(editTextPass.getText().toString().trim());

                if (usuario.getEmail().equals("")) {
                    editTextLogin.setError("Campo obrigatório");
                    valido = false;
                }
                if (usuario.getSenha().equals("")) {
                    editTextPass.setError("Campo obrigatório");
                    valido = false;
                }
            }
        }

    }
}
