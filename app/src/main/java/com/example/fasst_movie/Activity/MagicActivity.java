package com.example.fasst_movie.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.fasst_movie.Adapter.FilmListAdapter;
import com.example.fasst_movie.Domain.Film;
import com.example.fasst_movie.R;
import com.example.fasst_movie.databinding.ActivityMagicBinding;
import com.example.fasst_movie.databinding.ActivitySuperheroBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import java.util.ArrayList;

public class MagicActivity extends AppCompatActivity {
    ActivityMagicBinding binding;
    private FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMagicBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        database = FirebaseDatabase.getInstance();

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        initHarrypotterMovie();
        initFantasticBeastMovie();
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
                startActivity(new Intent(MagicActivity.this, MainActivity.class));
            }
        });
        superhero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MagicActivity.this, SuperheroActivity.class));
            }
        });
        magic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MagicActivity.this, MagicActivity.class));
            }
        });
        animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MagicActivity.this, AnimationActivity.class));
            }
        });

    }


    private void initHarrypotterMovie() {
        DatabaseReference myRef = database.getReference("HarryPottermovie");
        binding.progressBar8.setVisibility(View.VISIBLE);
        ArrayList<Film> items = new ArrayList<>();
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    for (DataSnapshot issue : snapshot.getChildren()) {
                        items.add(issue.getValue(Film.class));
                    }
                    if (!items.isEmpty()) {
                        binding.recyclerView8.setLayoutManager(new LinearLayoutManager(MagicActivity.this,
                                LinearLayoutManager.HORIZONTAL, false));
                        binding.recyclerView8.setAdapter(new FilmListAdapter(items));
                    }
                    binding.progressBar8.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    private void initFantasticBeastMovie() {
        DatabaseReference myRef = database.getReference("FantasticBeastmovie");
        binding.progressBar9.setVisibility(View.VISIBLE);
        ArrayList<Film> items = new ArrayList<>();
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    for (DataSnapshot issue : snapshot.getChildren()) {
                        items.add(issue.getValue(Film.class));
                    }
                    if (!items.isEmpty()) {
                        binding.recyclerView9.setLayoutManager(new LinearLayoutManager(MagicActivity.this,
                                LinearLayoutManager.HORIZONTAL, false));
                        binding.recyclerView9.setAdapter(new FilmListAdapter(items));
                    }
                    binding.progressBar9.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}