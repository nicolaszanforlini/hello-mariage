package com.example.hello_mariage.View.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.hello_mariage.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AccueilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AccueilFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AccueilFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AccueilFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AccueilFragment newInstance(String param1, String param2) {
        AccueilFragment fragment = new AccueilFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_accueil, container, false);

        LinearLayout linear1 = rootView.findViewById(R.id.linearReco1);
        LinearLayout linear2 = rootView.findViewById(R.id.linearReco2);
        LinearLayout linear3 = rootView.findViewById(R.id.linearReco3);
        linear1.setOnClickListener(listenerLinear1);
        linear2.setOnClickListener(listenerLinear2);
        linear3.setOnClickListener(listenerLinear3);

        return rootView;
    }

    public View.OnClickListener listenerLinear1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getActivity(), "recommandation 1", Toast.LENGTH_SHORT).show();
            //getActivity().getSupportFragmentManager().beginTransaction().
            //        remove(getActivity().getSupportFragmentManager().findFragmentById(R.id.frame)).commit();
            //AccueilFragment frag = new AccueilFragment();
            //getActivity().getSupportFragmentManager().beginTransaction().add(R.id.frame, frag).commit();
        }
    };

    public View.OnClickListener listenerLinear2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getActivity(), "recommandation 2", Toast.LENGTH_SHORT).show();
            //getActivity().getSupportFragmentManager().beginTransaction().
            //        remove(getActivity().getSupportFragmentManager().findFragmentById(R.id.frame)).commit();
            //AccueilFragment frag = new AccueilFragment();
            //getActivity().getSupportFragmentManager().beginTransaction().add(R.id.frame, frag).commit();
        }
    };

    public View.OnClickListener listenerLinear3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getActivity(), "recommandation 3", Toast.LENGTH_SHORT).show();
            //getActivity().getSupportFragmentManager().beginTransaction().
            //        remove(getActivity().getSupportFragmentManager().findFragmentById(R.id.frame)).commit();
            //AccueilFragment frag = new AccueilFragment();
            //getActivity().getSupportFragmentManager().beginTransaction().add(R.id.frame, frag).commit();
        }
    };
}
