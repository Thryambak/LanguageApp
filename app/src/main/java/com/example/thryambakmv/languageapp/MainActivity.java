package com.example.thryambakmv.languageapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.GridLayout;
public class MainActivity extends AppCompatActivity {

MediaPlayer med;
Boolean iskan=true;
String[] kst = {"ನೀವು ಇಂಗ್ಲಿಷ್ ಮಾತನಾಡುತ್ತೀರಾ?","ನಮಸ್ತೆ","ನೀವು ಹೇಗಿದ್ದೀರಿ","ಶುಭ ದಿನ","ನಾನು ವಾಸ ಮಾಡುತ್ತಿರುವುದು ...","ನನ್ನ ಹೆಸರು...","ದಯವಿಟ್ಟು","ಸ್ವಾಗತ"};
String[] fst = {"Savez-vous l'anglais","Bonjour","Comment allez-vous","comment puis-je y aller","je m'appelle","bonne journée","S'il vous plaît","Merci"};
public void kan(View view)
{
    GridLayout g =(GridLayout) findViewById(R.id.gridlayout);
    if(!iskan)
    {
        for(int i=0;i<g.getChildCount();i++)

        {if(i==0||i==1)
            continue;
           Button b = (Button) g.getChildAt(i);

            b.setText(kst[i-2]);
        }
        iskan=true;
    }
}
public void eng(View view)
{
    GridLayout g =(GridLayout) findViewById(R.id.gridlayout);
    if(iskan)
    {
        for(int i=0;i<g.getChildCount();i++)

        {if(i==0||i==1)
            continue;
            Button b = (Button) g.getChildAt(i);

            b.setText(fst[i-2]);
        }

        iskan = false;
    }
}

    public void click( View view )  {


    if(iskan) {


        Button b = (Button) view;


        med = MediaPlayer.create(this, getResources().getIdentifier(b.getTag().toString(), "raw", getPackageName()));
        if (!med.isPlaying()) {
            med.start();
        }
    }
    else
    {

        Button b = (Button) view;


        med = MediaPlayer.create(this, getResources().getIdentifier("k"+b.getTag().toString(), "raw", getPackageName()));
        if (!med.isPlaying()) {
            med.start();
        }
    }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
