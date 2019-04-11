package rafis.univalle.com.widgets;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainaActivity extends AppCompatActivity {
    VideoView miVideo;

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainAct","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainAct","onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainAct","onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainAct","onDestroy()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainAct","onStart()");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miVideo=(VideoView) findViewById(R.id.Video_Main);
        String video1=""+"android.resource://"+ getPackageName()+"/"+R.raw.joker;
        miVideo.setVideoURI(Uri.parse(video1));
        miVideo.start();
        miVideo.setMediaController(new MediaController( this));
        miVideo.start();
        miVideo.requestFocus();
        System.out.println("onCreate()");
        Log.d("MainAct","onCreate()");
    }

}
