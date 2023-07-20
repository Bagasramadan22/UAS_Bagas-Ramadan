package com.sata.izonovel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.EditText;

import com.sata.izonovel.adpter.FavoritNovelAdapter;

public class FavoritActivity extends AppCompatActivity {
    EditText fav;
    private RecyclerView recyclerView;
    private FavoritNovelAdapter favNovelAdapter;

    private ProgressDialog progressDialog;
    private Object FavoriteNovelRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_novel);

        setTitle(R.string.title_daftar_novel);

        recyclerView = findViewById(R.id.reycle_daftar_novel);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);

        onLoadData();
    }

    private void onLoadData() {
    }
}