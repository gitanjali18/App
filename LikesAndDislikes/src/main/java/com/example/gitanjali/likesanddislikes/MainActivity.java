package com.example.gitanjali.likesanddislikes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;



public class MainActivity extends Activity implements OnClickListener {

    Button likeButton , dislikeButton ;
    ImageView lImage,dImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        likeButton = (Button)findViewById(R.id.btn_like);
        likeButton.setOnClickListener(this);
        dislikeButton = (Button) findViewById(R.id.btn_dislike);
        dislikeButton.setOnClickListener(this);

        lImage = findViewById(R.id.like);
        dImage = findViewById(R.id.dislike);
    }

    int[] likes = {R.drawable.badminton,R.drawable.cake,R.drawable.mango,R.drawable.music};
    int[] dislikes = {R.drawable.banana,R.drawable.spider,R.drawable.guava,R.drawable.lightning};
    int n=0,m=0;

    @Override
    public void onClick(View view) {
        if (view==likeButton){
            if(n==4){
                n=0;
            }
            lImage.setImageResource(likes[n++]);

        }

        if (view==dislikeButton){
            if(m==4){
                m=0;
            }
            dImage.setImageResource(dislikes[m++]);

        }

    }
}
