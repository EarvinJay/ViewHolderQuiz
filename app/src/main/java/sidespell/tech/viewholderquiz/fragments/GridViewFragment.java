package sidespell.tech.viewholderquiz.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import sidespell.tech.viewholderquiz.R;

/**
 * A placeholder fragment containing a {@link android.widget.GridView}.
 */
public class GridViewFragment extends Fragment {
private GridView mygridview;
    public static GridViewFragment newInstance() {
        return new GridViewFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        populatelistview();
        View view= inflater.inflate(R.layout.fragment_gridview, container, false);
    mygridview=(GridView) view.findViewById(R.id.gridView);
    return view;
    }

    public void populatelistview()
    {
        //
        String[] mymovies={"AngryBirds","Deadpool","Finding Dory","Kung Fu Panda 3","X-men Apocalypse","Captain America Civil War","Jungle Book","Fan","Airlift","Moana"};
       int[] images={R.drawable.angrybirds,R.drawable.deadpool,R.drawable.findingdory,R.drawable.kungfupanda3,R.drawable.apocalypse,R.drawable.civilwar,
               R.drawable.junglebook,R.drawable.fan,R.drawable.airlift,R.drawable.moana};
        //



    }
}
