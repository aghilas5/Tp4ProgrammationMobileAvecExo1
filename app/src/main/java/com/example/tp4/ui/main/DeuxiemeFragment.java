package com.example.tp4.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.tp4.R;

public class DeuxiemeFragment extends Fragment {
    // Les champs utilisés par chaque Fragment
    //Ils sont distincts pour chaque NatureFragment instancié

    int image,image1,image2,image3;
    private int page;
    /**
     * Pour la sauvegarde et la récupération des données
     * dans un Bundle
     */
    private static final String ARG_SECTION_NUMBER = "numero_page";

    private static final String ARG_SECTION_IMAGE = "titre_image";
    private static final String ARG_SECTION_IMAGE1 = "titre_image1";
    private static final String ARG_SECTION_IMAGE2 = "titre_image2";
    private static final String ARG_SECTION_IMAGE3 = "titre_image3";

    /**
     * Retourne une nouvelle instance de ce fragment
     * pour le numéro de section donné.
     */
    public static DeuxiemeFragment newInstance(int position,int image,int image1,int image2,int image3) {
        DeuxiemeFragment fragment = new DeuxiemeFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, position);

        args.putInt(ARG_SECTION_IMAGE,image);
        args.putInt(ARG_SECTION_IMAGE1,image1);
        args.putInt(ARG_SECTION_IMAGE2,image2);
        args.putInt(ARG_SECTION_IMAGE3,image3);
        fragment.setArguments(args);
        return fragment;
    }
    // retrouver les valeurs des champs à partir du bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(ARG_SECTION_NUMBER, 0);

        image = getArguments().getInt(ARG_SECTION_IMAGE);
        image1 = getArguments().getInt(ARG_SECTION_IMAGE1);
        image2 = getArguments().getInt(ARG_SECTION_IMAGE2);
        image3 = getArguments().getInt(ARG_SECTION_IMAGE3);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout, container, false);

        ImageView imageee = (ImageView) view.findViewById(R.id.imageView11);
        ImageView imageee1 = (ImageView) view.findViewById(R.id.imageView22);
        ImageView imageee2 = (ImageView) view.findViewById(R.id.imageView33);
        ImageView imageee3 = (ImageView) view.findViewById(R.id.imageView44);
        imageee.setImageResource(image);
        imageee1.setImageResource(image1);
        imageee2.setImageResource(image2);
        imageee3.setImageResource(image3);


        return view;
    }

}