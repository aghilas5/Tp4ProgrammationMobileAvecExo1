package com.example.tp4.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tp4.R;

public class NatureFragment extends Fragment {
    // Les champs utilisés par chaque Fragment
    //Ils sont distincts pour chaque NatureFragment instancié
    private String title;
    int image;
    private int page;
    /**
     * Pour la sauvegarde et la récupération des données
     * dans un Bundle
     */
    private static final String ARG_SECTION_NUMBER = "numero_page";
    private static final String ARG_SECTION_TITLE = "titre_page";
    private static final String ARG_SECTION_IMAGE = "titre_image";

    /**
     * Retourne une nouvelle instance de ce fragment
     * pour le numéro de section donné.
     */
    public static NatureFragment newInstance(int position, String title, int image) {
        NatureFragment fragment = new NatureFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, position);
        args.putString(ARG_SECTION_TITLE, title);
        args.putInt(ARG_SECTION_IMAGE,image);
        fragment.setArguments(args);
        return fragment;
    }
    // retrouver les valeurs des champs à partir du bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(ARG_SECTION_NUMBER, 0);
        title = getArguments().getString(ARG_SECTION_TITLE);
        image = getArguments().getInt(ARG_SECTION_IMAGE);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.section_label);
        ImageView imageee = (ImageView) view.findViewById(R.id.imageView);
        imageee.setImageResource(image);
        if(page==1){tvLabel.setText("Il existe plusieurs définitions du printemps, notamment météorologique (demi-saison se trouvant entre les saisons froide et chaude) et calendaire (dont les dates varient selon les pays).\n" +
                "\n" +
                "Dans l’hémisphère nord, le printemps se situe entre le premier et le deuxième trimestre de l'année et dans l'hémisphère sud, il se situe entre le troisième et le dernier trimestre de l'année.\n" +
                "\n" +
                "Cette saison, marquant traditionnellement le renouveau dans la nature, se caractérise par un radoucissement par à coups de la température, la fonte des neiges, le bourgeonnement et la floraison des plantes, le réveil des animaux hibernants et le retour de certains animaux migrateurs. ");}
            if(page==2){tvLabel.setText("L’été est l'une des quatre saisons de l'année, dans les zones tempérées et polaires de la planète. L'été suit le printemps et précède l'automne.\n" +
                    "\n" +
                    "Il existe plusieurs définitions de l'été : astronomique (saison définie par des phénomènes astronomiques marquants), météorologique (saison comprenant les mois les plus chauds de l’année) et calendaire (dont les dates varient selon les pays).\n" +
                    "\n" +
                    "Dans l’hémisphère nord, l'été se situe entre les deuxième et troisième trimestres de l'année et dans l'hémisphère sud, il se situe entre le dernier trimestre de l'année et le premier de l'année suivante. ");}
                if(page==3){tvLabel.setText("L’automne est l'une des quatre saisons de l’année dans les zones tempérées. L'automne suit l'été et précède l'hiver.\n" +
                        "\n" +
                        "Il existe plusieurs définitions de l'automne : astronomique, météorologique (demi-saison se trouvant entre les saisons chaude et froide), et calendaire (dont les dates varient selon les pays).\n" +
                        "\n" +
                        "Dans l’hémisphère nord, l'automne se situe entre le troisième et le dernier trimestre de l'année ; dans l'hémisphère sud, il se situe entre le premier et le deuxième trimestre de l'année. ");}
                    if(page==4){tvLabel.setText("L'hiver est l’une des quatre saisons de l’année dans les zones tempérées et polaires de la Terre. L'hiver suit l'automne et précède le printemps. Il existe plusieurs définitions de l'hiver : astronomique (saison comprenant les jours les plus courts de l'année), météorologique (saison comprenant les mois les plus froids de l'année), et calendaire (dont les dates varient selon les pays). ");}



        return view;
    }
}