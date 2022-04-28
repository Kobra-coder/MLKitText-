package Guide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rcjoshi.mlkittext.R;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    ArrayList<Manual> manualArrayList;
    public MyAdapter(Context context, ArrayList<Manual> manualArrayList){
        this.context=context;
        this.manualArrayList=manualArrayList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType)
    {
        View v= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Manual manual=manualArrayList.get(position);
        holder.tvHeading.setText(manual.heading);
        holder.brif.setText(manual.brif);
        boolean isVis= manual.visibilty;
        holder.constraintLayout.setVisibility(isVis? View.VISIBLE:View.GONE);

    }


    @Override
    public int getItemCount() {

        return manualArrayList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvHeading;
        TextView brif;

        ConstraintLayout constraintLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvHeading=itemView.findViewById(R.id.heading);
            brif=itemView.findViewById(R.id.brief);
            constraintLayout=itemView.findViewById(R.id.expandedLayout);

            tvHeading.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Manual manual=manualArrayList.get(getAdapterPosition());
                    manual.setVisibilty(!manual.isVisibilty());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}

