package eu.id2go.guide2go;

import android.content.res.Resources;
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
        Resources res = getResources();
        String[] strings;

        strings = res.getStringArray(R.array.restaurant_the_librije);
        subjects.add(new Subject(strings[0], strings[1], strings[2], strings[3], strings[4],
                R.drawable.jonnie_en_therese_boer, R.raw.restaurant_de_librije_en));

        strings = res.getStringArray(R.array.bistro_de_kwaak);
        subjects.add(new Subject(strings[0], strings[1], strings[2], strings[3], strings[4], R
                .drawable.bistro_de_kwaak_zwolle, R.raw.bistro_de_kwaak_en));

        strings = res.getStringArray(R.array.city_brewery_hettinga_beer);
        subjects.add(new Subject(strings[0], strings[1], strings[2], strings[3], strings[4], R
                .drawable.city_brewery_hettinga_zwolle, R.raw.city_brewery_zwolle));
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
