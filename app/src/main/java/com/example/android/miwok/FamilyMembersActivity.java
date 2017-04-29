package com.example.android.miwok;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutCompat;
        import android.util.Log;
        import android.widget.ArrayAdapter;
        import android.widget.GridView;
        import android.widget.LinearLayout;
        import android.widget.ListView;
        import android.widget.TextView;

        import java.util.ArrayList;


public class FamilyMembersActivity extends AppCompatActivity {

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
//        words.add(new Word("father","әpә"));
//        words.add(new Word("mother","әṭa"));
//        words.add(new Word("son","angsii"));
//        words.add(new Word("daughter","tune"));
//        words.add(new Word("older brother","taachi"));
//        words.add(new Word("younger brother","temmokka"));
//        words.add(new Word("older sister","kennekaaku"));
//        words.add(new Word("younger sister","kawinta"));
//        words.add(new Word("grand mother","kennekaaku"));
//        words.add(new Word("grand father","kawinta"));

        words.add(new Word("father","әpә",R.drawable.family_father));
        words.add(new Word("mother","әṭa",R.drawable.family_mother));
        words.add(new Word("son","angsii",R.drawable.family_son));
        words.add(new Word("daughter","tune",R.drawable.family_daughter));
        words.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        words.add(new Word("younger brother","temmokka",R.drawable.family_younger_brother));
        words.add(new Word("older sister","kennekaaku",R.drawable.family_older_sister));
        words.add(new Word("younger sister","kawinta",R.drawable.family_younger_sister));
        words.add(new Word("grand mother","kennekaaku",R.drawable.family_grandmother));
        words.add(new Word("grand father","kawinta",R.drawable.family_grandfather));
        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.

        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);

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
