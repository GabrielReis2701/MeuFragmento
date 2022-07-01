package com.example.meufragmento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt_conversas,bt_contatos;
    private SegundoFragment contatoFragment;
    private FirstFragment conversaFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Remover sobra do ActionBar
        getSupportActionBar().setElevation(0);
        bt_contatos = findViewById(R.id.bt_contatos);
        bt_conversas = findViewById(R.id.bt_conversas);

        conversaFragment = new FirstFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frame_conteudo,conversaFragment);
        fragmentTransaction.commit();

        bt_contatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contatoFragment = new SegundoFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_conteudo,contatoFragment);
                fragmentTransaction.commit();

            }
        });
        bt_conversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conversaFragment = new FirstFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_conteudo,conversaFragment);
                fragmentTransaction.commit();
            }
        });

    }
}