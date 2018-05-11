package eu.id2go.guide2go;

import android.content.res.Resources;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends AbstractSubjectFragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    // Create a list of subjects
    protected void addSubject() {
        Resources res = getResources();
        String[] strings;

        strings = res.getStringArray(R.array.museum_the_foundation);
        subjects.add(new Subject(strings[0], strings[1], strings[2], strings[3], strings[4],
                R.drawable.museum_de_fundatie, R.raw.museum_the_foundation));

        strings = res.getStringArray(R.array.herman_brood_experience);
        subjects.add(new Subject(strings[0], strings[1], strings[2], strings[3], strings[4], R
                .drawable.herman_brood_museum, R.raw.herman_brood_museum_en));

        strings = res.getStringArray(R.array.dutch_bakery_museum);
        subjects.add(new Subject(strings[0], strings[1], strings[2], strings[3], strings[4], R
                .drawable.nederlands_bakkerij_museum, R.raw.dutch_bakery_museum));
    }

    @Override
    protected int getFragmentId() {
        return R.layout.subject_list;
    }

    @Override
    protected int getBackgroundColor() {
        return R.color.category_museums;
    }
}
