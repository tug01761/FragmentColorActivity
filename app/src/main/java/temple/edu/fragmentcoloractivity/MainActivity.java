package temple.edu.fragmentcoloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        PaletteFragment paletteFragment = new PaletteFragment().newInstance(color);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_palette);




    }

}
