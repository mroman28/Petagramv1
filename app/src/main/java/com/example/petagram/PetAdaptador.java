package com.example.petagram;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.ArrayList;

public class PetAdaptador  extends RecyclerView.Adapter<PetAdaptador.PetViewHolder>{
    ArrayList<Pet> pets;
    Activity  activity;
    public  PetAdaptador(ArrayList<Pet> pets, Activity activity){

        this.pets=pets;
      //  this.activity= activity;
    }
    public  PetAdaptador(ArrayList<Pet> pets) { // Activity activity){

        this.pets=pets;

    }

    // Inflar el layout y lo pasara al viewholder para que obtengas los views
    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pet,parent,false);
        return new PetViewHolder(v);
    }
     // asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(@NonNull PetViewHolder petViewHolder, int position) {
        final Pet pet = pets.get(position);
        petViewHolder.imgFoto.setImageResource(pet.getFoto());
        petViewHolder.tvNombreCV.setText(pet.getNombre());
        petViewHolder.tvCounterLikes.setText(pet.getNoLike());
        petViewHolder.btnLikePet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pet.sumLike();
                Toast.makeText(activity,"Click like a : "+pet.getNombre() + " Cuenta con "+ pet.getNoLike() + " Likes" , Toast.LENGTH_SHORT).show();
                petViewHolder.tvCounterLikes.setText(pet.getNoLike());
            }
        });


    }


    @Override
    public int getItemCount() {
        return pets.size();
    }

    public  static  class  PetViewHolder extends RecyclerView.ViewHolder{
            private ImageView imgFoto;
            private TextView tvNombreCV;
            private TextView tvCounterLikes;
            private ImageButton  btnLikePet;


           public PetViewHolder(@NonNull View itemView) {
               super(itemView);
               imgFoto=(ImageView) itemView.findViewById(R.id.imgFoto);
               tvNombreCV = (TextView) itemView.findViewById(R.id.tvNombreCV);
               tvCounterLikes =  itemView.findViewById(R.id.tvCounterLikes);
               btnLikePet = (ImageButton) itemView.findViewById(R.id.btnLikePet);
           }
       }

}
