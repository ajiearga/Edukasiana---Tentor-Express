package id.tentorexpress.edukasiana.tentorexpress.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.tentorexpress.edukasiana.tentorexpress.R;

/**
 * Created by Irfan on 1/2/2016.
 */
public class ViewTentorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view_tentor, container, false);
        return view;
    }

}