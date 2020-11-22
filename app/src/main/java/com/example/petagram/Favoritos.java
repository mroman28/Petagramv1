package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {
    private RecyclerView listPets;
    ArrayList<Pet> pets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton btnestrella = (ImageButton) findViewById(R.id.btnestrella);
        btnestrella.setVisibility(View.GONE);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        listPets = (RecyclerView) findViewById(R.id.FavoritoRV);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listPets.setLayoutManager(llm);

        initMascotas();
        inicilizarAdaptador();
    }
    private void inicilizarAdaptador(){
        PetAdaptador  adaptador = new PetAdaptador(pets,this);
        listPets.setAdapter(adaptador);
    }

    public void initMascotas(){
        pets = new ArrayList<Pet>();

        pets.add(new Pet(R.drawable.perro1,"Toby", "2"));
        pets.add(new Pet(R.drawable.perro3,"Firulay", "5"));
        pets.add(new Pet(R.drawable.perro5,"Rambo", "6"));
        pets.add(new Pet(R.drawable.perro7,"Ranger", "3"));
        pets.add(new Pet(R.drawable.perro8,"Bonny", "5"));


    }
}