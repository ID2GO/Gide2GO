package eu.id2go.guide2go;


import android.support.v4.app.Fragment;
//import java.util.ResourceBundle.getString();

/**
 * A simple {@link Fragment} subclass.
 */
public class FestivityFragment extends AbstractSubjectFragment {

    public FestivityFragment() {
        // Required empty public constructor
    }

    // Create a list of subjects
    protected void addSubject() {
        subjects.add(new Subject(R.string.liberation_festival, R.string
                .liberation_festival_description, R.string.liberation_festival_office,
                R.string.liberation_festival_phone, R.string.liberation_festival_email, R
                .drawable.bevrijdingsfestival_overijssel, R.raw.liberation_festival_overijssel));

//        subjects.add(new Subject("Liberation Festival Overijssel",
//                "Liberation " +
//                "Festival Overijssel Zwolle\n" +
//                "Every May 5th the largest liberation festival in the Netherlands happens in " +
//                "Zwolle with more than 50 performances and more than 130,000 visitors.\n" +
//                "The festival on May 5th. with various venues, more than dozens of performances, " +
//                "hundreds of volunteers and many substantive projects, the festival is worth a visit!\n" +
//                "Starting at the Main Stage? Or first along the Danstheater? The choice is overwhelming. \n" +
//                "Would you like to sing along with the famous hits like ''A Million Ways'', " +
//                "''Say Heaven Say Hell'' and ''Wish I Could''. This is possible, because Miss Montreal " +
//                "will also perform again this year at the liberation festival Overijssel.",
//                "Office Liberation Festival Overijssel \nCeintuurbaan 15 \n8022 AW " +
//                        "Zwolle", "038-4532660", "info@bevrijdingsfestivaloverijssel.nl", R
//                .drawable.bevrijdingsfestival_overijssel, R.raw.liberation_festival_overijssel));
//        subjects.add(new Subject("City festival", "The City Festival is a multi-day " +
//                "theater festival with a varied selection of music, theater, dance, opera, food and drinks in Zwolle. \n" +
//                "The festival transforms the Noordereiland, next to Theater De Spiegel, into a lively festival site.\n" +
//                "More information on the website: www.stadsfestival.nl", "Office City festival " +
//                "\nSpinhuisplein 14 \n8011 ZZ Zwolle", "038-4288280", "info@stadsfestival.nl",
//                R.drawable.stadsfestival_zwolle, R.raw.city_festival_zwolle));
//        subjects.add(new Subject("Zwolle Unlimited", "At the Broerenkerkplein Three days full of " +
//                "stories, street theater and music. And on Sundays the Zwolle book market.\n" +
//                "Zwolle Unlimited has in recent years developed into a defining festival in the field " +
//                "of national and international storytelling theater, and related linguistic disciplines. " +
//                "With top international street theater and with a nice nose for music as a retiring " +
//                "program around the stories. All this brought in the intimate, atmospheric setting of " +
//                "the historic city center of Zwolle. No festival 'out of packages and bags', but " +
//                "'prepared' with pure, natural ingredients or: the artisan, pure art.\n" +
//                "Entrance: via valuation afterwards. You give after every performance what it is worth " +
//                "to you, nothing more but nothing less. You can pay with money and with festival " +
//                "coins.", "Office Zwolle Unlimited (De Verhalenboot) \nPletterstraat 20" +
//                "\n8011 VG Zwolle", "06-50252300", "organisatie@zwolleunlimited.nl",
//                R.drawable.zwolle_unlimited, R.raw.zwolle_unlimited_en));
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
