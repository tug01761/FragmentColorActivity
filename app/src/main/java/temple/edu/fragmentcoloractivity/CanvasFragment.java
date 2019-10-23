package temple.edu.fragmentcoloractivity;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CanvasFragment extends Fragment {

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
    View background;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_canvas, container, false);

        /*
        background = (View) getView().findViewById(R.id.background);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            int position = bundle.getInt("key", 0);
        }

        background.setBackgroundColor(color[position]);
*/



    }

}
