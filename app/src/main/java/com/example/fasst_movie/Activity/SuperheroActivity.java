package com.example.fasst_movie.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.example.fasst_movie.Adapter.FilmListAdapter;
import com.example.fasst_movie.Adapter.SliderAdapter;
import com.example.fasst_movie.Domain.Film;
import com.example.fasst_movie.Domain.SliderItems;
import com.example.fasst_movie.R;
import com.example.fasst_movie.databinding.ActivityMainBinding;
import com.example.fasst_movie.databinding.ActivitySuperheroBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import java.util.ArrayList;
import java.util.List;

public class SuperheroActivity extends AppCompatActivity {
    ActivitySuperheroBinding binding;
    private FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySuperheroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        database = FirebaseDatabase.getInstance();

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        initXmenMovie();
        initSpidermanMovie();
        initVenomMovie();
        initFantasticfourMovie();
        initDeadpoolMovie();
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
                startActivity(new Intent(SuperheroActivity.this, MainActivity.class));
            }
        });
        superhero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SuperheroActivity.this, SuperheroActivity.class));
            }
        });
        magic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SuperheroActivity.this, MagicActivity.class));
            }
        });
        animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SuperheroActivity.this, AnimationActivity.class));
            }
        });

    }


    private void initXmenMovie() {
        DatabaseReference myRef = database.getReference("XMenmovie");
        binding.progressBar3.setVisibility(View.VISIBLE);
        ArrayList<Film> items = new ArrayList<>();
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    for (DataSnapshot issue : snapshot.getChildren()) {
                        items.add(issue.getValue(Film.class));
                    }
                    if (!items.isEmpty()) {
                        binding.recyclerView3.setLayoutManager(new LinearLayoutManager(SuperheroActivity.this,
                                LinearLayoutManager.HORIZONTAL, false));
                        binding.recyclerView3.setAdapter(new FilmListAdapter(items));
                    }
                    binding.progressBar3.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    private void initSpidermanMovie() {
        DatabaseReference myRef = database.getReference("Spidermanmovie");
        binding.progressBar4.setVisibility(View.VISIBLE);
        ArrayList<Film> items = new ArrayList<>();
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    for (DataSnapshot issue : snapshot.getChildren()) {
                        items.add(issue.getValue(Film.class));
                    }
                    if (!items.isEmpty()) {
                        binding.recyclerView4.setLayoutManager(new LinearLayoutManager(SuperheroActivity.this,
                                LinearLayoutManager.HORIZONTAL, false));
                        binding.recyclerView4.setAdapter(new FilmListAdapter(items));
                    }
                    binding.progressBar4.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    private void initVenomMovie() {
        DatabaseReference myRef = database.getReference("Venommovie");
        binding.progressBar5.setVisibility(View.VISIBLE);
        ArrayList<Film> items = new ArrayList<>();
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    for (DataSnapshot issue : snapshot.getChildren()) {
                        items.add(issue.getValue(Film.class));
                    }
                    if (!items.isEmpty()) {
                        binding.recyclerView5.setLayoutManager(new LinearLayoutManager(SuperheroActivity.this,
                                LinearLayoutManager.HORIZONTAL, false));
                        binding.recyclerView5.setAdapter(new FilmListAdapter(items));
                    }
                    binding.progressBar5.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    private void initFantasticfourMovie() {
        DatabaseReference myRef = database.getReference("Fantasticmovie");
        binding.progressBar6.setVisibility(View.VISIBLE);
        ArrayList<Film> items = new ArrayList<>();
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    for (DataSnapshot issue : snapshot.getChildren()) {
                        items.add(issue.getValue(Film.class));
                    }
                    if (!items.isEmpty()) {
                        binding.recyclerView6.setLayoutManager(new LinearLayoutManager(SuperheroActivity.this,
                                LinearLayoutManager.HORIZONTAL, false));
                        binding.recyclerView6.setAdapter(new FilmListAdapter(items));
                    }
                    binding.progressBar6.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    private void initDeadpoolMovie() {
        DatabaseReference myRef = database.getReference("Deadpoolmovie");
        binding.progressBar7.setVisibility(View.VISIBLE);
        ArrayList<Film> items = new ArrayList<>();
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    for (DataSnapshot issue : snapshot.getChildren()) {
                        items.add(issue.getValue(Film.class));
                    }
                    if (!items.isEmpty()) {
                        binding.recyclerView7.setLayoutManager(new LinearLayoutManager(SuperheroActivity.this,
                                LinearLayoutManager.HORIZONTAL, false));
                        binding.recyclerView7.setAdapter(new FilmListAdapter(items));
                    }
                    binding.progressBar7.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}














