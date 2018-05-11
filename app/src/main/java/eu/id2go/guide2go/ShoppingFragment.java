package eu.id2go.guide2go;

import android.content.res.Resources;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends AbstractSubjectFragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    // Create a list of subjects
    protected void addSubject() {

        Resources res = getResources();
        String[] strings;

        strings = res.getStringArray(R.array.the_zwolle_ball_house);
        subjects.add(new Subject(strings[0], strings[1], strings[2], strings[3], strings[4],
                R.drawable.zwols_balletjes_huis, R.raw.the_zwolle_ball_house));

        strings = res.getStringArray(R.array.waanders_in_the_brothers_church);
        subjects.add(new Subject(strings[0], strings[1], strings[2], strings[3], strings[4], R
                .drawable.waanders_boekwinkel_in_de_broeren, R.raw.waanders_in_the_brothers_church));

        strings = res.getStringArray(R.array.meinesz_bennesz);
        subjects.add(new Subject(strings[0], strings[1], strings[2], strings[3], strings[4], R
                .drawable.feestartikelen_winkel, R.raw.meinesz_and_bennesz_en));
    }

    @Override
    protected int getFragmentId() {
        return R.layout.subject_list;
    }

    @Override
    protected int getBackgroundColor() {
        return R.color.category_shopping;
    }
}

