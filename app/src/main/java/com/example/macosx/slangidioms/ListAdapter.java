package com.example.macosx.slangidioms;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Hoidar on 4/1/18.
 */

public class ListAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private class listViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView txtIdiom,txtartinya;

        public listViewHolder(View itemview){

            super(itemview);

            txtartinya = itemview.findViewById(R.id.txtartinya);
            txtIdiom = itemview.findViewById(R.id.txtIdiom);
            itemview.setOnClickListener(this);
        }

        public void bindView(int position){
            txtIdiom.setText(OurData.idiomnya[position]);
            txtartinya.setText(OurData.artinya[position]);
        }
        public void onClick(View view){

        }
    }
}
