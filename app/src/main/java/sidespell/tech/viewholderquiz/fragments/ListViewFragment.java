package sidespell.tech.viewholderquiz.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import sidespell.tech.viewholderquiz.R;

/**
 * A placeholder fragment containing a {@link android.widget.ListView}.
 */
public class ListViewFragment extends Fragment {
 ListView mylistview;
    int[] images={R.drawable.angrybirds,R.drawable.deadpool,R.drawable.findingdory,R.drawable.kungfupanda3,R.drawable.apocalypse,R.drawable.civilwar,
            R.drawable.junglebook,R.drawable.fan,R.drawable.airlift,R.drawable.moana};
    String[] movie_titles;
    public static ListViewFragment newInstance() {
        return new ListViewFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


     View view=inflater.inflate(R.layout.fragment_listview, container, false);
mylistview=(ListView) view.findViewById(R.id.listView);
        movie_titles= getResources().getStringArray(R.array.movie_titles);

        return  view;

    }

}
