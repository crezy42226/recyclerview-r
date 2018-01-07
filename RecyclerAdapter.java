package com.alshahri.crezy.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crezy on 1/7/2018.
 */



class RecyclerHodler extends RecyclerView.ViewHolder{

    TextView name;
    TextView Des;
    ImageView imageView;

    public RecyclerHodler(View itemView) {
        super(itemView);

        name = (TextView)itemView.findViewById(R.id.textName);
        Des = (TextView)itemView.findViewById(R.id.textDes);
        imageView = (ImageView)itemView.findViewById(R.id.imageViewShow);

    }
}

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerHodler> {

    List<ListItemD> listItemDs = new ArrayList<>();

    public RecyclerAdapter(List<ListItemD> listItemDs) {
        this.listItemDs = listItemDs;
    }

    @Override
    public RecyclerHodler onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_recyclerview,parent,false);
        return new RecyclerHodler(view);
    }

    @Override
    public void onBindViewHolder(RecyclerHodler holder, int position) {

        holder.name.setText(listItemDs.get(position).getName());
        holder.Des.setText(listItemDs.get(position).getDes());
        holder.imageView.setImageResource(listItemDs.get(position).getImages());


    }

    @Override
    public int getItemCount() {
        return listItemDs.size();
    }
}
