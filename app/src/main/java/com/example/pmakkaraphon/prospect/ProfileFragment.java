package com.example.pmakkaraphon.prospect;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    TextView mDatesave;
    TextView mDatecome;
    Spinner mPrefix;
    CheckBox mChkAdd;
    LinearLayout mLayoutCompeny;

    View v;
    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_profile, container, false);

        mDatesave = (TextView) v.findViewById(R.id.txtDatesave);
        mDatecome = (TextView) v.findViewById(R.id.txtDatecome);
        mPrefix = (Spinner) v.findViewById(R.id.txtPrefix);
        mChkAdd = (CheckBox) v.findViewById(R.id.chkAdd);
        mLayoutCompeny = (LinearLayout) v.findViewById(R.id.layoutCompeny);

        // Current Date
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = df.format(c.getTime());

        // txtResult
        Log.d("runtime",formattedDate);
        mDatesave.setText(formattedDate);
        mDatecome.setText(formattedDate);
        mChkAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mChkAdd.isChecked()){
                    mLayoutCompeny.setVisibility(View.INVISIBLE);
                }else{
                    mLayoutCompeny.setVisibility(View.VISIBLE);
                }
            }
        });

        return v;
    }


}
