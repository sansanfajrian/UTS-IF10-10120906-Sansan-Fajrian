package com.example.myselfapps;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import butterknife.BindString;
import butterknife.ButterKnife;

/**
 NIM : 10120906
 NAMA : Sansan Fajrian
 KELAS : IF10K
 */
public class ProfileFragment extends Fragment {

    @SuppressLint("NonConstantResourceId")
    @BindString(R.string.dialog_title)
    String dialogTitle;
    @SuppressLint("NonConstantResourceId")
    @BindString(R.string.dialog_desc)
    String dialogDesc;
    @SuppressLint("NonConstantResourceId")
    @BindString(R.string.dialog_type)
    String dialogType;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // TODO: Rename and change types of parameters
            getArguments().getString(ARG_PARAM1);
            getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        ButterKnife.bind(this, view);

        TextView whatsapp = view.findViewById(R.id.text_whatsapp);
        TextView facebook = view.findViewById(R.id.text_facebook);
        TextView instagram = view.findViewById(R.id.text_instagram);
        TextView email = view.findViewById(R.id.text_email);
        TextView find_me = view.findViewById(R.id.text_find_me);

        // whatsapp
        whatsapp.setOnClickListener(view1 -> myWhatsapp());
        // facebook
        facebook.setOnClickListener(view1 -> myFacebook());
        // instagram
        instagram.setOnClickListener(view1 -> myInstagram());
        // email
        email.setOnClickListener(view1 -> myEmail());
        // find me
        find_me.setOnClickListener(view1 -> myLocation());

        return view;
    }


    //my instagram
    private void myWhatsapp() {
        String url = "https://wa.me/6282115630882";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    //my instagram
    private void myFacebook() {
        String url = "https://www.facebook.com/sandwichforfree/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    //my instagram
    private void myInstagram() {
        String url = "https://www.instagram.com/sansan_fajrian/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    //my email
    private void myEmail() {
        String url = "mailto:sansan.10120906@mahasiswa.unikom.ac.id";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    //my location
    private void myLocation() {
        String url = "https://goo.gl/maps/Fa8M7C5JGtF3afbW6";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    // costum dialog
    private void alert() {
        final Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.activity_profile_dialog);
        dialog.setTitle(dialogType);

        TextView textTitle = dialog.findViewById(R.id.txtWarningDialogTitle);
        TextView text = dialog.findViewById(R.id.txtWarningDialogDesc);
        Button dialogButton = dialog.findViewById(R.id.btnWarningDialogOk);

        textTitle.setText(dialogTitle);
        text.setText(dialogDesc);

        dialogButton.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }
}