package eu.id2go.guide2go;

import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends AbstractSubjectFragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }

    // Create a list of subjects
    protected void addSubject() {
        subjects.add(new Subject("Restaurant the Librije", "Restaurant the Librije " +
                "is the restaurant of star chef Jonnie and his wife Thérèse: \n" +
                "'We eat and drink every day, but we are happy to make this daily requirement a treat " +
                "for you, so that you can share our love for good food and fine wines. We both grew " +
                "up in this environment. A world of catching pike-perch, picking water-mint, searching " +
                "for boletus and chanterelles and entering with small boats the duck decoy. Hence, is " +
                "it so strange that we have fallen in love with all those beautiful regional products?" +
                "Many people call cooking with regional products our specialty, but we think that we " +
                "are special precisely because we do not have a specialty. When you cook and " +
                "serve with heart and soul, from your feeling, everything is special. Together with " +
                "our team we explore every day the possibilities of marrying wine and food into a " +
                "lovely relationship. We want to let you taste the things we discover over and over " +
                "again, to spoil you, without a fuss.'", "Restaurant the Librije \nSpinhuisplein" +
                " 1, \n8011 ZZ Zwolle\n", "038-8530000", "info@librije.com",
                R.drawable.jonnie_en_therese_boer, R.raw.restaurant_de_librije_en));
        subjects.add(new Subject("Bistro de Kwaak", "Welcome on board Bistro the Kwaak. \n" +
                "The freighter which was launched in 1904 was given a second destination in the 1980s: " +
                "a sailing theater ship, as many of the Kwaak still know. In the winter of 2017 we, " +
                "Andras Schoorl and Carien van Hasselt, gave the ship a third life, Bistro De Kwaak!\n" +
                "With a view to the traditional character of the ship, a comfortable ship's compartment " +
                "has been created with a maximum of 40 seats and 60 pitches. This third life is " +
                "dominated by surprising and pure dishes that are often slightly different than normal. " +
                "Prepared with passion and served with attention in and on the most beautiful canal " +
                "of Zwolle.", "Bistro de Kwaak \nPletterstraat 22 \n8011 VG Zwolle",
                "038-3377044", "info@dekwaak.nl", R.drawable.bistro_de_kwaak_zwolle, R.raw.bistro_de_kwaak_en));
        subjects.add(new Subject("CITY BREWERY HETTINGA BEER", "Hettinga Bier was " +
                "founded in January 2008 by Focke Hettinga and Joyce Orsel. The brewery initiative was " +
                "born from the passion for enjoying a good and delicious beer. Hettinga Bier is brewed " +
                "in the traditional way in Zwolle with vitalized water. The vitalized water has a " +
                "positive influence on the taste and quality of the beer. In 2009 we were elected the " +
                "hero of the taste for the province of Overijssel for brewing regional beers.\n" +
                "We brew our beer in an authentic way, ie with purely natural raw materials, without " +
                "filtration and pasteurization. All our beers ferment in the bottle which gives the " +
                "beers a full and round taste.", "CITY BREWERY HETTINGA \nEsdoornstraat 3 \n" +
                "(Dieze west) \n8021 WB Zwolle, ", "038-4662902", "info@hettingabier.nl",
                R.drawable.city_brewery_hettinga_zwolle, R.raw.city_brewery_zwolle));
    }

    @Override
    protected int getFragmentId() {
        return R.layout.subject_list;
    }

    @Override
    protected int getBackgroundColor() {
        return R.color.category_restaurants;
    }


}
