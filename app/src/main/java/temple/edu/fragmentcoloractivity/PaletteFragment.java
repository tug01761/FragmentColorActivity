package temple.edu.fragmentcoloractivity;


import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;


public class PaletteFragment extends Fragment implements AdapterView.OnItemSelectedListener{

    //color list
    int[] color={Color.parseColor("white"),
            Color.parseColor("red"),
            Color.parseColor("blue"),
            Color.parseColor("yellow"),
            Color.parseColor("purple"),
            Color.parseColor("grey"),
            Color.parseColor("green"),
            Color.parseColor("cyan"),
            Color.parseColor("magenta"),
            Color.parseColor("silver")};

    int check = 0;
    ConstraintLayout mConstraintLayout;

    public static PaletteFragment newInstance(int[] color) {
        PaletteFragment myFragment = new PaletteFragment();

        Bundle args = new Bundle();
        args.putIntArray("colors", color);
        myFragment.setArguments(args);

        return myFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_palette, container, false);
        Resources res = getResources();
        String[] text = res.getStringArray(R.array.color_array);

        Spinner spinner = (Spinner)view.findViewById(R.id.mySpinner);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        ColorAdapter colorAdapter = new ColorAdapter(view.getContext(), text, getArguments().getIntArray("colors"));
        spinner.setAdapter(colorAdapter);

        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("key", position);
        this.setArguments(bundle);

        if (++check > 1) {
            ((MainActivity) getActivity()).setViewPager(1);
            TextView selectedText = view.findViewById(R.id.colorText);
            selectedText.setBackgroundColor(Color.parseColor("white"));
            mConstraintLayout = (ConstraintLayout) getActivity().findViewById(R.id.background);
            mConstraintLayout.setBackgroundColor(color[position]);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
