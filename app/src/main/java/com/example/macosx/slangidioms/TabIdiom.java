package com.example.macosx.slangidioms;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabIdiom extends Fragment {

    CustomAdapter adapter;
    Context context;

    String[] idiomisi= {"Kemampuan Anak ku","Makan Malam",
            "Perampokan","Selangkah Menjadi Dokter",
            "Berburu Hantu","Cerita Website","Liburan Panjang","Bebas Penjara",
            "Kisah Sang Tentara","Email Terakhir","Perampokan Bank"};
    String[] artiisi= {
            "a","b","c","d","e","f","g","h","i","j","k"
    };

    public TabIdiom() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_idiom, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.listRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return view;



    }


    public interface OnFragmentInteractionListener {
    }

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.list_view, parent, false);

            MyViewHolder holder = new MyViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

            holder.txtidiom.setText(idiomisi[position]);
            holder.txtarti.setText(artiisi[position]);

        }

        @Override
        public int getItemCount() {
            return idiomisi.length;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView txtidiom,txtarti;
            public MyViewHolder(View itemView) {
                super(itemView);

                txtidiom = itemView.findViewById(R.id.txtIdiom);
                txtarti = itemView.findViewById(R.id.txtartinya);

            }
        }
    }
}
