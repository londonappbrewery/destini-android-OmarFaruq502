package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//---------------------------------
//
//---------------------------------
public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;

    //------------------------------
    //      onCreate()
    //------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateStage_3();
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateStage_2();
            }
        });

    }
    //------------------------------
    //      updateStage() --> 2
    //------------------------------
    public void updateStage_2(){

        //todo: update the screen to Scenario 3
        mStoryTextView.setText(R.string.T2_Story);

        //todo: Update top button
        mButtonTop.setText(R.string.T2_Ans1);
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateStage_3();
            }
        });

        //todo: Update bottom button
        mButtonBottom.setText(R.string.T2_Ans2);

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryTextView.setText(R.string.T4_End); //T4 ending
                // After Reaching the ending
                mButtonBottom.setVisibility(View.GONE);
                mButtonTop.setVisibility(View.GONE);
            }
        });

    }

    //------------------------------
    //      updateStage() --> 3
    //------------------------------
    public void updateStage_3(){

        //todo: update the screen to Scenario 3
        mStoryTextView.setText(R.string.T3_Story);

        //todo: Update top button
        mButtonTop.setText(R.string.T3_Ans1);

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryTextView.setText(R.string.T6_End); //T6 ending
                // After Reaching the ending
                mButtonBottom.setVisibility(View.GONE);
                mButtonTop.setVisibility(View.GONE);
            }
        });

        //todo: Update bottom button
        mButtonBottom.setText(R.string.T3_Ans2);

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mStoryTextView.setText(R.string.T5_End); //T5 ending

                // After Reaching the ending
                mButtonBottom.setVisibility(View.GONE);
                mButtonTop.setVisibility(View.GONE);
            }
        });

    }
}
