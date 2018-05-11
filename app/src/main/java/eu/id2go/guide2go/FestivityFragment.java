package eu.id2go.guide2go;


import android.content.res.Resources;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class FestivityFragment extends AbstractSubjectFragment {

    public FestivityFragment() {
        // Required empty public constructor
    }

    // Create a list of subjects
    protected void addSubject() {
        Resources res = getResources();
        String[] strings;

        strings = res.getStringArray(R.array.liberation_festival);
        subjects.add(new Subject(strings[0], strings[1], strings[2], strings[3], strings[4], R
                .drawable.bevrijdingsfestival_overijssel, R.raw.liberation_festival_overijssel));

        strings = res.getStringArray(R.array.city_festival);
        subjects.add(new Subject(strings[0], strings[1], strings[2], strings[3], strings[4], R
                .drawable.stadsfestival_zwolle, R.raw.city_festival_zwolle));

        strings = res.getStringArray(R.array.zwolle_unlimited);
        subjects.add(new Subject(strings[0], strings[1], strings[2], strings[3], strings[4], R
                .drawable.zwolle_unlimited, R.raw.zwolle_unlimited_en));

    }

    @Override
    protected int getFragmentId() {
        return R.layout.subject_list;
    }

    @Override
    protected int getBackgroundColor() {
        return R.color.category_festivity;
    }


}
