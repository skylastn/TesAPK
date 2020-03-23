package id.example.tesapk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterData extends RecyclerView.Adapter<AdapterData.MyViewHolder> {
    private List<Data> listData;

    Context mContext;

    public AdapterData(Context context, List<Data> dosenList){
        this.mContext = context;
        listData = dosenList;
    }

    @NonNull
    @Override
    public AdapterData.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data, parent, false);
        mContext = parent.getContext();
        return new AdapterData.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterData.MyViewHolder holder, int position) {
        String posisi = String.valueOf(position+1);
        holder.no.setText(posisi);
        holder.noberkas.setText(listData.get(position).getNoberkas());
        holder.namaobyek.setText(listData.get(position).getNamaobjek());
        holder.alamat.setText(listData.get(position).getAlamat());
        holder.lokasi.setText(listData.get(position).getLokasi());

    }

    @Override
    public int getItemCount () {
        return listData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView no,noberkas, namaobyek, alamat, lokasi;

        public MyViewHolder(View itemView) {
            super(itemView);
            no = itemView.findViewById(R.id.listid);
            noberkas = itemView.findViewById(R.id.listnoberkas);
            namaobyek = itemView.findViewById(R.id.listnamaobyek);
            alamat = itemView.findViewById(R.id.listalamat);
            lokasi = itemView.findViewById(R.id.listlokasi);
        }
    }
}
