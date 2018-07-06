package com.example.gitanjali.scorekeeperapp;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.Menu;

import android.view.MenuItem;

import android.view.View;

import android.widget.TextView;



/**
 * This activity keeps track of the basketball score for 2 teams.
 */

public class MainActivity extends AppCompatActivity {



    // Tracks the score for Team A

    int scoreTeamA = 0;



    // Tracks the score for Team B

    int scoreTeamB = 0;
    int foulsA=0;
    int foulsB=0;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }



    /**
     * Increase the score for Team A by 1 point.
     */

    public void addFoulForTeamA(View v) {

        foulsA = foulsA + 1;

        displayFoulTeamA(foulsA);

    }



    /**
     * Increase the score for Team A by 2 points.
     */

    public void addGoalForTeamA(View v) {

        scoreTeamA = scoreTeamA + 1;

        displayForTeamA(scoreTeamA);

    }






    /**
     * Increase the score for Team B by 1 point.
     */

    public void addFoulForTeamB(View v) {

        foulsB = foulsB + 1;

        displayFoulTeamB(foulsB);

    }



    /**
     * Increase the score for Team B by 2 points.
     */

    public void addGoalForTeamB(View v) {

        scoreTeamB = scoreTeamB + 1;

        displayForTeamB(scoreTeamB);

    }



    /**
     * Increase the score for Team B by 3 points.
     */





    /**
     * Resets the score for both teams back to 0.
     */

    public void resetScore(View v) {

        scoreTeamA = 0;

        scoreTeamB = 0;
        foulsA=0;
        foulsB=0;

        displayForTeamA(scoreTeamA);
        displayFoulTeamA(foulsA);
        displayFoulTeamB(foulsB);

        displayForTeamB(scoreTeamB);

    }



    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));

    }

    public void displayFoulTeamA(int score) {

        TextView foulView = (TextView) findViewById(R.id.team_a_fouls);

        foulView.setText(String.valueOf(score));

    }


    public void displayFoulTeamB(int score) {

        TextView foulView = (TextView) findViewById(R.id.team_b_fouls);

        foulView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);

        scoreView.setText(String.valueOf(score));

    }

}