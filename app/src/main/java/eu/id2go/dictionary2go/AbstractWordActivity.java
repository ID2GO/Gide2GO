package eu.id2go.dictionary2go;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link AbstractWordActivity} is an {@link } that can provide the layout for each list
 * based on a data source, which is a list of {@link Word} objects.
 * Created by rob on 30-3-18.
 */
public abstract class AbstractWordActivity extends AppCompatActivity {


   @Override
   protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_category);
   getSupportFragmentManager().beginTransaction()
           .replace(R.id.container, newSpecificFragment())
           .commit();
   }

   public abstract AbstractWordFragment newSpecificFragment();

}


