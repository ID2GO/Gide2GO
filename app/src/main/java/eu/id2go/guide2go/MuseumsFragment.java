package eu.id2go.guide2go;

import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends AbstractWordFragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    // Create a list of words
    protected void addWord() {
        words.add(new Word("Museum the Foundation", "Museum de Fundatie",
                R.drawable.museum_de_fundatie, R.raw.museum_the_foundation));
        words.add(new Word("Herman Brood Experience", "Schilderijen, zeefdrukken en tekeningen van de kunstenaar. Daarnaast kunnen bezoekers kijken naar foto’s en persoonlijke spullen zoals beschilderde gitaren, kledingstukken, schildersmateriaal en zelfs spuitnaalden. De weduwe van Brood, Xandra, is bij het project betrokken.\n" +
                "Bij de Herman Brood Experience geven we je graag een inkijkje in het legendarische leven van de in 2001 overleden zanger en schilder. \n" +
                "Bezoekers hoeven geen entree te betalen voor de Experience, maar een vrijwillige bijdrage is altijd welkom. In de shop kun je schilderijen, zeefdrukken, tekeningen en Brood merchandise kopen.",
                R.drawable.herman_brood_museum, R.raw.herman_brood_museum_en));
//        words.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
//        words.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
//        words.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
//        words.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
//        words.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
//        words.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
//        words.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
//        words.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

    }

    @Override
    protected int getFragmentId() {
        return R.layout.word_list;
    }

    @Override
    protected int getBackgroundColor() {
        return R.color.category_colors;
    }


}
