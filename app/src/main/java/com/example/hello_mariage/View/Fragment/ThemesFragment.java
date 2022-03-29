package com.example.hello_mariage.View.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.hello_mariage.Controler.Adapter.AdapterThemes;
import com.example.hello_mariage.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ThemesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThemesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ThemesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ThemesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ThemesFragment newInstance(String param1, String param2) {
        ThemesFragment fragment = new ThemesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // data test ====================================
        ArrayList<String> l = new ArrayList<>();
        l.add("title 1");
        l.add("title 2");
        l.add("title 3");
        l.add("title 4");
        l.add("title 5");
        l.add("title 6");
        l.add("title 7");
        l.add("title 8");
        l.add("title 9");

        ArrayList<String>l2 = new ArrayList<>();
        l2.add("https://st4.depositphotos.com/20524830/26271/i/1600/depositphotos_262716896-stock-photo-computer-generated-image-website-construction.jpg");
        l2.add("https://st3.depositphotos.com/1008939/12603/i/950/depositphotos_126032722-stock-photo-roaring-singing-woman.jpg");
        l2.add("https://st3.depositphotos.com/1008939/12603/i/950/depositphotos_126032722-stock-photo-roaring-singing-woman.jpg");
        l2.add("https://st3.depositphotos.com/1008939/12603/i/950/depositphotos_126032722-stock-photo-roaring-singing-woman.jpg");
        l2.add("https://st4.depositphotos.com/20524830/26271/i/1600/depositphotos_262716896-stock-photo-computer-generated-image-website-construction.jpg");
        l2.add("https://st3.depositphotos.com/1008939/12603/i/950/depositphotos_126032722-stock-photo-roaring-singing-woman.jpg");
        l2.add("https://st3.depositphotos.com/1008939/12603/i/950/depositphotos_126032722-stock-photo-roaring-singing-woman.jpg");
        l2.add("https://st4.depositphotos.com/20524830/26271/i/1600/depositphotos_262716896-stock-photo-computer-generated-image-website-construction.jpg");
        l2.add("https://st3.depositphotos.com/1008939/12603/i/950/depositphotos_126032722-stock-photo-roaring-singing-woman.jpg");
        // =================================================

        View rootView = inflater.inflate(R.layout.fragment_themes, container, false);
        GridView grid = rootView.findViewById(R.id.gridThemesDisponible);

        AdapterThemes adt = new AdapterThemes(getActivity(), l, l2);
        grid.setAdapter(adt);

        // select theme
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), l.get(position), Toast.LENGTH_SHORT).show();
                //getActivity().getSupportFragmentManager().beginTransaction().
                //        remove(getActivity().getSupportFragmentManager().findFragmentById(R.id.frame)).commit();
                //AccueilFragment frag = new AccueilFragment();
                //getActivity().getSupportFragmentManager().beginTransaction().add(R.id.frame, frag).commit();
            }
        });

        return rootView;
    }
}