package com.example.myselfapps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

/**
 NIM : 10120906
 NAMA : Sansan Fajrian
 KELAS : IF10K
 */
public class MusicFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public MusicFragment() {
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
        View view = inflater.inflate(R.layout.fragment_music, container, false);

        YouTubePlayerView youTubePlayerView1 = view.findViewById(R.id.youtube_player_view1);
        YouTubePlayerView youTubePlayerView2 = view.findViewById(R.id.youtube_player_view2);
        YouTubePlayerView youTubePlayerView3 = view.findViewById(R.id.youtube_player_view3);
        YouTubePlayerView youTubePlayerView4 = view.findViewById(R.id.youtube_player_view4);
        YouTubePlayerView youTubePlayerView5 = view.findViewById(R.id.youtube_player_view5);

        getLifecycle().addObserver(youTubePlayerView1);
        getLifecycle().addObserver(youTubePlayerView2);
        getLifecycle().addObserver(youTubePlayerView3);
        getLifecycle().addObserver(youTubePlayerView4);
        getLifecycle().addObserver(youTubePlayerView5);

        return view;
    }

}