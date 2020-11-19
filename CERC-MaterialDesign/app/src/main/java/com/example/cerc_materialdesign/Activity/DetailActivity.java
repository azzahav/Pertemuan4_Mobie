package com.example.cerc_materialdesign.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.cerc_materialdesign.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {

    private CircleImageView circleImageView;
    private TextView tvNama;
    private TextView tvFrom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        circleImageView = findViewById(R.id.image);
        tvNama = findViewById(R.id.tv_item_name);
        tvFrom = findViewById(R.id.tv_item_from);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String from = intent.getStringExtra("from");
        String photo = intent.getStringExtra("foto");
        Glide.with(getApplicationContext())
                .load(photo)
                .apply(new RequestOptions().override(350, 550))
                .into(circleImageView);
        tvNama.setText(name);
        tvFrom.setText(from);
    }
}