/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.id2go.dictionary2go;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        android.support.v4.view.ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
    }
//        // Find the View that shows the numbers category
//        TextView numbers = findViewById(R.id.numbers);
//        TextView family = findViewById(R.id.family);
//        TextView colors = findViewById(R.id.colors);
//        TextView phrases = findViewById(R.id.phrases);
//
//
//        // Set a click listener on that View
//        numbers.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the numbers category is clicked on.
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link NumbersActivity}
//                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
//                // Start the new activity
//                startActivity(numbersIntent);
//            }
//        });
//
//
//        family.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the family category is clicked on.
//            @Override
//            public void onClick(View view) {
//                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
//                startActivity(familyIntent);
//            }
//        });
//
//
//        colors.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the colors category is clicked on.
//            @Override
//            public void onClick(View view) {
//                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
//                startActivity(colorsIntent);
//            }
//        });
//
//
//        phrases.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the phrases category is clicked on.
//            @Override
//            public void onClick(View view) {
//                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
//                startActivity(phrasesIntent);
//            }
//        });
//    }
}
