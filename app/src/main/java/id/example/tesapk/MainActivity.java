package id.example.tesapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText NoBerkas, NamaObyek, Alamat, Lokasi;
    Button send;
    RecyclerView dataRecyclerView;
    Context mContext;
    AdapterData mAdapter;
    List<Data> datasemua = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NoBerkas = findViewById(R.id.noberkas);
        NamaObyek = findViewById(R.id.namaobyek);
        Alamat = findViewById(R.id.alamat);
        Lokasi = findViewById(R.id.lokasi);
        send = findViewById(R.id.send);
        mContext = MainActivity.this;
        dataRecyclerView = findViewById(R.id.listdata);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(mContext);
        dataRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new AdapterData( mContext,datasemua);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Data semuaData = new Data(NoBerkas.getText().toString(), NamaObyek.getText().toString(),Alamat.getText().toString(),Lokasi.getText().toString());
                datasemua.add(semuaData);
                mAdapter.notifyDataSetChanged();
                dataRecyclerView.setAdapter(mAdapter);

            }
        });

    }
}
