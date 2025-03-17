package com.example.fasst_movie.Activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.fasst_movie.Adapter.FilmListAdapter;
import com.example.fasst_movie.Domain.Film;
import com.example.fasst_movie.R;
import com.example.fasst_movie.databinding.ActivityDetailBinding;
import com.example.fasst_movie.databinding.ActivityMainBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        
        setVaiable();

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        bottomMenu();

    }

    private void bottomMenu() {
        LinearLayout home = findViewById(R.id.home);
        LinearLayout superhero = findViewById(R.id.superhero);
        LinearLayout magic = findViewById(R.id.magic);
        LinearLayout animation = findViewById(R.id.animation);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailActivity.this, MainActivity.class));
            }
        });
        superhero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailActivity.this, SuperheroActivity.class));
            }
        });
        magic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailActivity.this, MagicActivity.class));
            }
        });
        animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailActivity.this, AnimationActivity.class));
            }
        });

    }

    private void setVaiable() {
        Film item = (Film) getIntent().getSerializableExtra("object");
        RequestOptions requestOptions = new RequestOptions();
        requestOptions = requestOptions.transform(new CenterCrop(), new GranularRoundedCorners(50, 50, 50, 50));

        Glide.with(this)
                .load(item.getPoster())
                .apply(requestOptions)
                .into(binding.picMovie);

        binding.title.setText(item.getTitle());

        binding.duration.setText(item.getDuration());

        binding.summary.setText(item.getSummary());

        binding.backImage.setOnClickListener(v -> finish());

        binding.watchMovieButton.setOnClickListener(view -> {
            Intent intent = new Intent(DetailActivity.this, PlayerActivity.class);
            intent.putExtra("url",item.getVideo());
            startActivity(intent);
        });

    }
}











