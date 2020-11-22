package com.example.petagram;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PetFragment extends Fragment {

    ArrayList<Pet> pets;
    private RecyclerView listaPets;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
      View v = inflater.inflate(R.layout.fragmentpet, container,false);
        listaPets = (RecyclerView) v.findViewById(R.id.rvPet);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaPets.setLayoutManager(llm);
        inicializarListaPets();
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador(){
        PetAdaptador adaptador = new PetAdaptador(pets);
        listaPets.setAdapter(adaptador);
    }

    public void inicializarListaPets(){
        pets = new ArrayList<Pet>();

        pets.add(new Pet(R.drawable.perro1,"Toby", "2"));
        pets.add(new Pet(R.drawable.perro2,"Tano", "3"));
        pets.add(new Pet(R.drawable.perro3,"Firulay", "5"));
        pets.add(new Pet(R.drawable.perro4,"Roky", "1"));
        pets.add(new Pet(R.drawable.perro5,"Rambo", "6"));
        pets.add(new Pet(R.drawable.perro6,"Doky", "2"));
        pets.add(new Pet(R.drawable.perro7,"Ranger","3"));
        pets.add(new Pet(R.drawable.perro8,"Bonny", "5"));

    }
}
