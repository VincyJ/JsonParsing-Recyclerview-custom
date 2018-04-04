package example.com.jsonparsing_recyclerview_custom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    Context context;
    ArrayList<ListModel> arrayList = new ArrayList<>();

    public CustomAdapter(Context context, ArrayList<ListModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View appearance = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(appearance);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ListModel listModel = arrayList.get(position);
        Log.e("VINCY", listModel.getRank() + "");
        holder.tv1.setText(listModel.getRank() + "");
        holder.tv2.setText(listModel.getCountryname());
        holder.tv3.setText(listModel.getPopulation());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2, tv3;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.textView_rank);
            tv2 = itemView.findViewById(R.id.textView_country);
            tv3 = itemView.findViewById(R.id.textView_population);
        }
    }
}
