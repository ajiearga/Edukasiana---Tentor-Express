package id.tentorexpress.edukasiana.tentorexpress.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import id.tentorexpress.edukasiana.tentorexpress.R;
import id.tentorexpress.edukasiana.tentorexpress.ui.activity.ChooseOrderActivity;

/**
 * Created by Irfan on 1/1/2016.
 */
public class HomeFragment extends Fragment {


    public static HomeFragment newInstance() {
        Bundle args = new Bundle();
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        TextView tv_subject = (TextView) view.findViewById(R.id.tv_subject);
        tv_subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.tv_subject:
                        Intent i = new Intent(getActivity(), ChooseOrderActivity.class);
                        startActivity(i);
                        break;
                }
            }
        });
        return view;
    }
}

