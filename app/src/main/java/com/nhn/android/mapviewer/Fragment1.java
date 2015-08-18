package com.nhn.android.mapviewer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.access.sel.parking.R;

public class Fragment1 extends NMapFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.nhn_mapview_fragment1, container, false);
	}
}
