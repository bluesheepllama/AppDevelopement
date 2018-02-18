package com.example.mitchelldennen.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class Main2Activity extends AppCompatActivity {

    private Button like, dislike;
    private ImageView image;


    private int likeC;
    private int dislikeC;
    private static final String KEY_INDEX = "index";
    private int mCurrentIndex = 0;
    //private String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();//
        String value = "";//
        if (extras != null) {//
             value = extras.getString("NAME_TEXT");// one way to do it
            //The key argument here must match that used in the other activity
        }
        //name = getIntent().getStringExtra("NAME_TEXT");//gets name from first activity, second way to do it
        Toast.makeText(this, "Hello " + value, Toast.LENGTH_SHORT).show();//displays name

        image = (ImageView) findViewById(R.id.imageView) ;
        like = (Button) findViewById(R.id.likeButton);
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likeC++;
                //Toast.makeText(this, "You've liked: " + likeC, Toast.LENGTH_SHORT).show();
                next();
            }
        });

        dislike = (Button) findViewById(R.id.dislikeButton);
        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dislikeC++;
                //Toast.makeText(this, "You've hated: " + likeC, Toast.LENGTH_SHORT).show();
                next();
            }
        });

    }
    void next() {
        //displays the next image
        //mCurrentIndex = (mCurrentIndex + 1) % 12;//wraps around

        switch(mCurrentIndex) {
            case 0:  image.setImageResource(R.drawable.basketball);
                //Toast.makeText(this, "0  " + likeC, Toast.LENGTH_SHORT).show();

                break;
            case 1:  image.setImageResource(R.drawable.tree);
                //image.setImageResource(R.drawable.blobfish);// doesnt like blobfish.jpg
                //Toast.makeText(this, "1  " + likeC, Toast.LENGTH_SHORT).show();

                break;
            case 2:  image.setImageResource(R.drawable.cake);
                //Toast.makeText(this, "The cake is a lie " , Toast.LENGTH_SHORT).show();

                break;
            case 3:  image.setImageResource(R.drawable.flower);
                //Toast.makeText(this, "Just smell the flowers lennie" , Toast.LENGTH_SHORT).show();
                break;
            case 4:  image.setImageResource(R.drawable.gibson);
                //Toast.makeText(this, "good choice " , Toast.LENGTH_SHORT).show();
                break;
            case 5:  image.setImageResource(R.drawable.guitar);
                //Toast.makeText(this, "rock on " , Toast.LENGTH_SHORT).show();
                break;
            case 6:  image.setImageResource(R.drawable.hammerhead);
                //Toast.makeText(this, "if only there was a nailshark" , Toast.LENGTH_SHORT).show();
                break;
            case 7:  image.setImageResource(R.drawable.kitten);
                //Toast.makeText(this, "I, the destroyer" , Toast.LENGTH_SHORT).show();
                break;
            case 8:  image.setImageResource(R.drawable.lobster);
                //Toast.makeText(this, " " , Toast.LENGTH_SHORT).show();
                break;
            case 9:  image.setImageResource(R.drawable.mantis);
                break;
            case 10:  image.setImageResource(R.drawable.pumpkin);
                break;
            case 11:  image.setImageResource(R.drawable.salad);
            mCurrentIndex = 0;
                break;

            default : image.setImageResource(R.drawable.basketball);
        }

        //image.setImageResource(R.drawable.basketball);
        mCurrentIndex++;
    }
}
