package eu.id2go.guide2go;


import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class FestivityFragment extends AbstractWordFragment {

    public FestivityFragment() {
        // Required empty public constructor
    }

    // Create a list of words
    protected void addWord() {
        words.add(new Word("Carnival, February 9th-12th 2018", "Carnaval, 9 t/m 12 februari " +
                "2018", R.drawable.carnaval, R.raw.carnaval_9_tot_12_februari_2018_binnenstad));
        words.add(new Word("Carnival tour February 10th 2018", "Carnavalsoptocht 10 februari " +
                "2018", R.drawable.carnavalsoptocht, R.raw.carnavalsoptocht_10_februari_2018_binnenstad));
        words.add(new Word("Music on the square, every 2nd sunday of april through october 2018," +
                " Assendorp square", "Muziek aan het Plein, iedere 2e zondag vd " +
                "maand van april t/m oktober 2018, Assendorperplein", R.drawable.carnaval, R.raw
                .carnavalsoptocht_10_februari_2018_binnenstad));
        words.add(new Word("Kings night, april 26th 2018", "Koningsnacht, 26 april 2018", R
                .drawable.carnaval, R.raw.koningsnacht_26_april_2018_binnenstad));
        words.add(new Word("Liberation festival, 5 mei 2018", "Koningsnacht, 26 april " +
                "2018", R
                .drawable.carnaval, R.raw.koningsnacht_26_april_2018_binnenstad));
    }

    @Override
    protected int getFragmentId() {
        return R.layout.word_list;
    }

    @Override
    protected int getBackgroundColor() {
        return R.color.category_numbers;
    }


}
