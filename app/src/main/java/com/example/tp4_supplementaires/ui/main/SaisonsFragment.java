package com.example.tp4_supplementaires.ui.main;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.example.tp4_supplementaires.R;

public class SaisonsFragment extends Fragment {
    // Les champs utilisés par chaque Fragment
    //Ils sont distincts pour chaque NatureFragment instancié
    int image1,image2,image3,image4;
    private int page;
    private String title;

    /**
     * Pour la sauvegarde et la récupération des données
     * dans un Bundle
     */
    private static final String ARG_SECTION_NUMBER = "numero_page";
    private static final String ARG_SECTION_TITLE = "titre_page";
    private static final String ARG_SECTION_IMAGE = "titre_image";
    private static final String ARG_SECTION_IMAGE1 = "titre_image1";
    private static final String ARG_SECTION_IMAGE2 = "titre_image2";
    private static final String ARG_SECTION_IMAGE3 = "titre_image3";
    /**
     * Retourne une nouvelle instance de ce fragment
     * pour le numéro de section donné.
     */
    public static SaisonsFragment newInstance(int position, String title,int image,int image1,int image2,int image3) {
        SaisonsFragment fragment = new SaisonsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, position);
        args.putString(ARG_SECTION_TITLE, title);
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
        title = getArguments().getString(ARG_SECTION_TITLE);
        image1 = getArguments().getInt(ARG_SECTION_IMAGE);
        image2 = getArguments().getInt(ARG_SECTION_IMAGE1);
        image3 = getArguments().getInt(ARG_SECTION_IMAGE2);
        image4 = getArguments().getInt(ARG_SECTION_IMAGE3);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main2, container, false);
        ImageView images1 = (ImageView) view.findViewById(R.id.imageView1);
        ImageView images2 = (ImageView) view.findViewById(R.id.imageView2);
        ImageView images3 = (ImageView) view.findViewById(R.id.imageView3);
        ImageView images4 = (ImageView) view.findViewById(R.id.imageView4);
        images1.setImageResource(image1);
        images2.setImageResource(image2);
        images3.setImageResource(image3);
        images4.setImageResource(image4);

        return view;
    }
}