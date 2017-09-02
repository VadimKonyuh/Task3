package epam.com.task3;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by homepc on 10.05.2017.
 */

public class FirstFragment extends Fragment implements View.OnClickListener {
    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.first_fragment, container, false);
        Button buttonn = (Button) view.findViewById(R.id.button);
        buttonn.setOnClickListener(this);
        Button buttonn1 = (Button) view.findViewById(R.id.button1);
        buttonn1.setOnClickListener(this);
        Button buttonn2 = (Button) view.findViewById(R.id.button2);
        buttonn2.setOnClickListener(this);
        return view;

    }
        int x;

    public void onClick(View view)
        {

        x = (int) (4*Math.random());
        if (x == 0) {
            view.setBackgroundColor(Color.GREEN);
        }
        if (x == 1) {
            view.setBackgroundColor( Color.YELLOW);
        }
        if (x == 2) {
            view.setBackgroundColor(Color.RED);
        }
        if (x == 3) {
            view.setBackgroundColor(Color.BLUE);}


        }
}

    /*
    @Override
    public void onSaveInstanceState(Bundle outState) {

        ColorDrawable buttonColor = (ColorDrawable) buttonn.getBackground();
        outState.putInt("buttonFirstColor", buttonColor.getColor());
        buttonColor = (ColorDrawable) buttonSecond.getBackground();
        outState.putInt("buttonSecondColor", buttonColor.getColor());
        buttonColor = (ColorDrawable) buttonThird.getBackground();
        outState.putInt("buttonThirdColor", buttonColor.getColor());

        super.onSaveInstanceState(outState);
    }


    @Override
     protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        buttonFirst= (Button) findViewById(R.id.button);
        buttonSecond= (Button) findViewById(R.id.button1);
        buttonThird= (Button) findViewById(R.id.button2);
        buttonFirst.setBackgroundColor(savedInstanceState.getInt("buttonFirstColor"));
        buttonSecond.setBackgroundColor(savedInstanceState.getInt("buttonSecondColor"));
        buttonThird.setBackgroundColor(savedInstanceState.getInt("buttonThirdColor"));
    }
    */

