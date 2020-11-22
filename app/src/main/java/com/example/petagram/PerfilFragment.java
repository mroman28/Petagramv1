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
import androidx.recyclerview.widget.GridLayoutManager;

import java.util.ArrayList;

public class PerfilFragment extends Fragment {
    ArrayList<Pet> pets;
    private RecyclerView listaPets;

    public PerfilFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaPets = (RecyclerView) v.findViewById(R.id.rvPerfilPet);
        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        listaPets.setLayoutManager(glm);

        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador(){
        PetAdaptador adaptador = new PetAdaptador(pets);
        listaPets.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        pets = new ArrayList<Pet>();

        pets.add(new Pet(R.drawable.perro1,"Toby", "2"));
        pets.add(new Pet(R.drawable.perro1,"Toby", "3"));
        pets.add(new Pet(R.drawable.perro1,"Toby", "5"));
        pets.add(new Pet(R.drawable.perro1,"Toby", "1"));
        pets.add(new Pet(R.drawable.perro1,"Toby", "6"));
        pets.add(new Pet(R.drawable.perro1,"Toby", "2"));
        pets.add(new Pet(R.drawable.perro1,"Toby","3"));
        pets.add(new Pet(R.drawable.perro1,"Toby", "5"));




    }
}
