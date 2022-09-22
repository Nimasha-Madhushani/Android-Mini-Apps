package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        //data to populate the Recycle view with
        ArrayList<String> scoreHistory = new ArrayList<>();
        scoreHistory.add("SL vs AUS - 59/9 SL won by 63 runs");
        scoreHistory.add("SL vs AUS - 159/9 SL won by 63 runs");
        scoreHistory.add("SL vs Pak - 79/9 SL won by 24 runs");
        scoreHistory.add("SL vs IND - 119/9 SL won by 89 runs");
        scoreHistory.add("SL vs PAK - 189/9 SL won by 32 runs");

        //set up the Recycle View
        RecyclerView rvScoHistory=findViewById(R.id.rev_score_history);
        rvScoHistory.setLayoutManager(new LinearLayoutManager(this));
        HistoryViewAdapter adapter=new HistoryViewAdapter(this,scoreHistory);
        rvScoHistory.setAdapter(adapter);

    }
}