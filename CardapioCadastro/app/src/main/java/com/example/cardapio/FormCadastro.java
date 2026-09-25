package com.example.cardapio;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cardapio.model.User;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FormCadastro extends AppCompatActivity {

    private EditText edit_name;
    private EditText edit_email;
    private EditText edit_cpf;
    private EditText edit_nascimento;
    private EditText edit_senha;
    private EditText edit_confirmSenha;

    private TextView text_teste;

    private Button button_cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form_cadastro);

        IniciarComponentes();


        button_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edit_name.getText().toString();
                String email = edit_email.getText().toString();
                String senha = edit_senha.getText().toString();
                String senhaConfirm = edit_confirmSenha.getText().toString();
                String nascimento = edit_nascimento.getText().toString();
                String cpf = edit_cpf.getText().toString();

                if (name.isEmpty() || email.isEmpty() || senha.isEmpty() || senhaConfirm.isEmpty() || nascimento.isEmpty() || cpf.isEmpty()) {
                    Snackbar snackbar = Snackbar.make(v, "Preencha todos os dados!", Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                } else {
                    createUser();
                }


            }
        });





    }

    private void IniciarComponentes(){

        button_cadastrar = findViewById(R.id.buttonCadastrar);

        edit_email = findViewById(R.id.edit_email);
        edit_name = findViewById(R.id.edit_name);
        edit_cpf = findViewById(R.id.edit_cpf);
        edit_nascimento = findViewById(R.id.edit_nascimento);
        edit_senha = findViewById(R.id.edit_senha);
        edit_confirmSenha = findViewById(R.id.edit_confirmSenha);




    }

    private void createUser(){
        User user = new User(
                edit_name.getText().toString(),
                edit_email.getText().toString(),
                edit_senha.getText().toString(),
                edit_nascimento.getText().toString(),
                edit_cpf.getText().toString()
        );

        ApiService api = RetrofitClient.getInstance().create(ApiService.class);

        Call<User> call = api.createUser(user);

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful()){
                    User userResponse = response.body();

                    Snackbar snackbar = Snackbar.make(button_cadastrar,"Cadastrado com sucesso! \n Seja bem vindo " + edit_name.getText(), Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    View view = snackbar.getView();
                    TextView textView = view.findViewById(com.google.android.material.R.id.snackbar_text);
                    textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    textView.setTextSize(18);
                    snackbar.show();

                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

                Toast.makeText(getApplicationContext(),
                        "Erro: " + t.getMessage(),
                        Toast.LENGTH_LONG).show();

                t.printStackTrace();

            }
        });
    }






    private void  buscarUsers(){
        ApiService api = RetrofitClient.getInstance().create(ApiService.class);

        Call<List<User>> call = api.getUsers();

        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if (response.isSuccessful()) {
                    List<User> user  = response.body();

                    //####################
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                t.printStackTrace();

            }
        });

    }


}