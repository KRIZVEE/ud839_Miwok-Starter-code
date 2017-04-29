package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an array of words

//        String[] words = new String[10];
//        words[0] = "one";
//        words[1] = "two";
//        words[2] = "three";
//        words[3] = "four";
//        words[4] = "five";
//        words[5] = "six";
//        words[6] = "seven";
//        words[7] = "eight";
//        words[8] = "nine";
//        words[9] = "ten";


//        Log.v("NumbersActivity", "Word at index 0 " + words[0]);
//        Log.v("NumbersActivity", "Word at index 1 " + words[1]);
//        Log.v("NumbersActivity", "Word at index 2 " + words[2]);
//        Log.v("NumbersActivity", "Word at index 3 " + words[3]);
//        Log.v("NumbersActivity", "Word at index 4 " + words[4]);
//        Log.v("NumbersActivity", "Word at index 5 " + words[5]);
//        Log.v("NumbersActivity", "Word at index 6 " + words[6]);
//        Log.v("NumbersActivity", "Word at index 7 " + words[7]);
//        Log.v("NumbersActivity", "Word at index 8 " + words[8]);
//        Log.v("NumbersActivity", "Word at index 9 " + words[9]);


        // Create an ArrayList of words

        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one");
       /* Word w = new Word("one","lutti");
        words.add(w); this can be written in more precise way as below */
//       words.add(new Word("one","lutti"));
//        words.add(new Word("two","ottiko"));
//        words.add(new Word("three","tolookosu"));
//        words.add(new Word("four","oyyisa"));
//        words.add(new Word("five","massokka"));
//        words.add(new Word("six","temmokka"));
//        words.add(new Word("seven","kennekaaku"));
//        words.add(new Word("eight","kawinta"));
//        words.add(new Word("nine","wo'e"));
//        words.add(new Word("ten","na'achha"));

        words.add(new Word("one","lutti",R.drawable.number_one));
        words.add(new Word("two","ottiko",R.drawable.number_two));
        words.add(new Word("three","tolookosu",R.drawable.number_three));
        words.add(new Word("four","oyyisa",R.drawable.number_four));
        words.add(new Word("five","massokka",R.drawable.number_five));
        words.add(new Word("six","temmokka",R.drawable.number_six));
        words.add(new Word("seven","kennekaaku",R.drawable.number_seven));
        words.add(new Word("eight","kawinta",R.drawable.number_eight));
        words.add(new Word("nine","wo'e",R.drawable.number_nine));
        words.add(new Word("ten","na'achha",R.drawable.number_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.

       ListView listView = (ListView) findViewById(R.id.list);
       // GridView gridView = (GridView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

        listView.setAdapter(adapter);
       // gridView.setAdapter(itemsAdapter);

//        Log.v("NumbersActivity", "Word at index 0 " + words.get(0));
//        Log.v("NumbersActivity", "Word at index 1 " + words.get(1));
//        Log.v("NumbersActivity", "Word at index 2 " + words.get(2));
//        Log.v("NumbersActivity", "Word at index 3 " + words.get(3));
//        Log.v("NumbersActivity", "Word at index 4 " + words.get(4));
//        Log.v("NumbersActivity", "Word at index 5 " + words.get(5));
//        Log.v("NumbersActivity", "Word at index 6 " + words.get(6));
//        Log.v("NumbersActivity", "Word at index 7 " + words.get(7));
//        Log.v("NumbersActivity", "Word at index 8 " + words.get(8));
//        Log.v("NumbersActivity", "Word at index 9 " + words.get(9));
        // Find the root view so we can add child views to it


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
//        while(index < words.size()) {
//            // Create a new TextView
//            TextView wordView = new TextView(this);
//            // Set the text to be word at the current index
//            wordView.setText(words.get(index));
//            // Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView);
//            // Increment the index variable by 1
//            index++;
//        }

//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//
//        // Create a variable to keep track of the current index position
//        int index = 0;
//        for(int index = 0; index < words.size(); index++) {
//
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//        }


    }
}
