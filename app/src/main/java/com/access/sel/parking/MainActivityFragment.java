package com.access.sel.parking;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.nhn.android.mapviewer.NMapViewer;

import java.util.logging.Logger;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private final String TAG = MainActivityFragment.class.getSimpleName();

    public MainActivityFragment() {
    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int viewId = v.getId();
            if ( viewId == R.id.btn_navi ) {
                Log.d(TAG, "navi");
                MainActivityFragment.this.startActivity(new Intent(getActivity(), NMapViewer.class));

            }
            else if ( viewId == R.id.btn_exit ) {
                Log.d(TAG, "exit");
                getActivity().finish();
            }
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        view.findViewById(R.id.btn_navi).setOnClickListener(onClick);
        view.findViewById(R.id.btn_exit).setOnClickListener(onClick);

        return view;
    }
}
