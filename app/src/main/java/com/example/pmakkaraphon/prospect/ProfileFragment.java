package com.example.pmakkaraphon.prospect;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    EditText mDatesave;
    EditText mDatecome;

    View v;

    private int mDay;
    private int mMonth;
    private int mYear;
    static final int DATE_DIALOG_ID = 0;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_profile, container, false);

        final Calendar c = Calendar.getInstance();
        mDay = c.get(Calendar.DAY_OF_MONTH);
        mMonth = c.get(Calendar.MONTH);
        mYear = c.get(Calendar.YEAR);
        SimpleDateFormat mdformat = new SimpleDateFormat("yyyy-MM-dd ");
        c.set(mYear, mMonth, mDay);
        Date date = c.getTime();

        mDatesave = (EditText) getActivity().findViewById(R.id.btnDatesave);
        //mDatesave.setText(mDay + "-" + mMonth + "-" + mYear);

        return v;
    }


}
