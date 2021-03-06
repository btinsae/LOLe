package com.irolitech.lole.fragments;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TimePicker;


import com.irolitech.maoo.R;

import java.util.Calendar;
import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Laundry.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Laundry#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Laundry extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    EditText datePicker;
    Calendar myCalendar = Calendar.getInstance();
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String am_pm;
    private OnFragmentInteractionListener mListener;
    private EditText timePickerEditText;
    private TimePickerDialog mTimePicker;

    public Laundry() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Laundry.
     */
    // TODO: Rename and change types and number of parameters
    public static Laundry newInstance(String param1, String param2) {
        Laundry fragment = new Laundry();
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_laundry, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CardView washFold = (CardView) view.findViewById(R.id.wash_fold);
        washFold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView= (ImageView) v.findViewById(R.id.wash_fold_image);
                imageView.setImageResource(R.drawable.laundry_active);
            }
        });



        datePicker = (EditText) view.findViewById(R.id.pick_up_time_date);
        timePickerEditText = (EditText) view.findViewById(R.id.pick_up_time_hour_min);


        final TimePickerDialog.OnTimeSetListener time = new TimePickerDialog.OnTimeSetListener() {

            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                myCalendar.set(Calendar.HOUR, hourOfDay);
                myCalendar.set(Calendar.MINUTE, minute);
            }
        };
        timePickerEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTimePicker = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        am_pm = (myCalendar.get(Calendar.AM_PM) == Calendar.SUNDAY) ? "AM" : "PM";
                        timePickerEditText.setText(hourOfDay + ":" + minute + " " +am_pm);
                    }
                }, myCalendar.get(Calendar.HOUR), myCalendar.get(Calendar.MINUTE), true);
                mTimePicker.show();
            }
        });
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                datePicker.setText(getMonthName(monthOfYear) + " " + dayOfMonth + ", " + year);
                //Toast.makeText(getActivity(), year + " " + monthOfYear + " " + dayOfMonth, Toast.LENGTH_LONG).show();
            }

        };


        datePicker.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(getActivity(), date,
                        myCalendar.get(Calendar.YEAR),
                        myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
                //editText.setText(myCalendar.);
            }
        });

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private String getMonthName(int month) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Jan");
        hashMap.put(1, "Feb");
        hashMap.put(2, "Mar");
        hashMap.put(3, "Apr");
        hashMap.put(4, "May");
        hashMap.put(5, "Jun");
        hashMap.put(6, "Jul");
        hashMap.put(7, "Aug");
        hashMap.put(8, "Sep");
        hashMap.put(9, "Oct");
        hashMap.put(10, "Nov");
        hashMap.put(11, "Dec");
        return hashMap.get(month);
    }
}
