package redittai.com.hanoalknots;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.io.Serializable;

public class youtubePlayer extends YouTubeBaseActivity implements Serializable{
    YouTubePlayerView playerView;
    TextView tv;
    ImageButton btn;
    YouTubePlayer.OnInitializedListener initializedListener;
    String name,desc,url;
    FloatingActionButton youtube;
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_youtube_player);
        name=(String) getIntent().getSerializableExtra("name");

        desc=(String) getIntent().getSerializableExtra("description");
        tv = (TextView)findViewById(R.id.tv);
        playerView = (YouTubePlayerView)findViewById(R.id.youtubePlayer);

        tv.setText(desc);
        btn = (ImageButton)findViewById(R.id.ytBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    playerView.initialize(youtubeConfig.API_KEY,initializedListener);
                } catch (Exception e) {
                    Log.i("error",e.getMessage());
                }
            }
        });
        url=(String) getIntent().getSerializableExtra("url");
        initializedListener = new YouTubePlayer.OnInitializedListener() {


            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(url);

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(getApplicationContext(),"problem Loading The Video",Toast.LENGTH_SHORT).show();
            }
        };

    }

    public youtubePlayer() {
    }

    knots thisKnot;
    public youtubePlayer(Context context, knots k1) {
        super();
        this.thisKnot=k1;
    }



}
