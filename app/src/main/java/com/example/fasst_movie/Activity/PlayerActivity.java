package com.example.fasst_movie.Activity;

import android.database.DefaultDatabaseErrorHandler;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fasst_movie.R;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

import javax.sql.DataSource;

public class PlayerActivity extends AppCompatActivity {
    private PlayerView videoPlayer;
    private ExoPlayer exoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoPlayer = findViewById(R.id.video_player);
        String videoUrl = getIntent().getStringExtra("url");
        setUpExoPlayer(videoUrl);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        );

        }
    private void setUpExoPlayer(String url) {

        // Initialize ExoPlayer
        exoPlayer = new ExoPlayer.Builder(this).build();

        // Attach the player to the PlayerView
        videoPlayer.setPlayer(exoPlayer);

        // Build the media item
        MediaItem mediaItem = MediaItem.fromUri(Uri.parse(url));

        // Set the media item to the player
        exoPlayer.setMediaItem(mediaItem);

        // Prepare the player
        exoPlayer.prepare();

        // Start playback
        exoPlayer.setPlayWhenReady(true);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (exoPlayer != null) {
            // Release the player when activity is destroyed
            exoPlayer.release();
            exoPlayer = null;
        }
    }
}












