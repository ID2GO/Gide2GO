package eu.id2go.guide2go;


import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhrasesFragment extends AbstractWordFragment {


    public PhrasesFragment() {
        // Required empty public constructor
    }

    // Create a list of words
    protected void addWord() {
        words.add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_im_coming));
        words.add(new Word("I’m coming.", "әәnәm", R.raw.phrase_yes_im_coming));
        words.add(new Word("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
        words.add(new Word("Come here.", "әnni'nem", R.raw.phrase_come_here));
    }

    // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
    // adapter knows how to create list items for each item in the list.
    @Override
    protected int getFragmentId() {
        return R.layout.word_list;
    }

    @Override
    protected int getBackgroundColor() {
        return R.color.category_phrases;
    }

}