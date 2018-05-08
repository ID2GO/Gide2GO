package eu.id2go.guide2go;

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
        subjects.add(new Subject("The Zwolle Ball House", "Walk into the Zwolle " +
                "Ball House and imagine yourself in grandmother's time with the sweet scent of " +
                "traditional old Dutch sweets such as polka chunks and wine balls.\n" +
                "\n" +
                "The real Zwolse Balletjes are made in the traditional way in the cellar of the Zwolle " +
                "Ball House. The recipe is already ancient and still secret.\n" +
                "\n" +
                "In addition, the owner, Wies Dull, is ready to answer questions about Zwolle and " +
                "surroundings from tourists and from residents of Zwolle and to advise all visitors " +
                "to their satisfaction. In addition, at this Tourist Information Point you will find " +
                "city maps with sights, special shopping guides, beautiful city walks and cycle " +
                "routes (free as well as sales material).\n" +
                "\n" +
                "Zwolse presents\n" +
                "You will also find many Zwolse presents in the Zwolle Ball House, such as Zwols " +
                "food van Zwolse retailers and sells real Zwolle art.\n" +
                "All this from her passion for Zwolle: Zwolle is a city with allure and Zwolle info " +
                "& gifts wants to do everything to show it!", "The Zwolle Ball House \nGrote " +
                "Kerkplein 13 \n8011 VA " +
                "Zwolle, ", "038-4218815", "info@zwolseballetjes.nl", R
                .drawable.zwols_balletjes_huis, R.raw.the_zwolle_ball_house));
        subjects.add(new Subject("Waanders in the Brothers church", "Waanders In the Brothers " +
                "church:\n" +
                "more than just a book store\n" +
                "Waanders int the Brothers is divided into 'worlds'. These worlds show you the way. " +
                "In the worlds you will find books, but also all kinds of accessory articles that fit " +
                "the books on the shelf.\n" +
                "Contemporary combination\n" +
                "The cookbooks are combined with tasteful crockery. The travel books are next to " +
                "carefully selected accessories for on the road. The art books are accompanied by " +
                "design articles. In addition to children's and youth literature, the children's " +
                "department also offers contemporary and imaginative toys.\n" +
                "With this, Waanders In de Broeren gives a contemporary twist to the phenomenon of " +
                "book trade.", "Waanders in the Brothers church \nAchter de Broeren 1-3 \n8011 " +
                "VA Zwolle", "038-4215392", "info@waandersindebroeren.nl",
                R.drawable.waanders_boekwinkel_in_de_broeren, R.raw.waanders_in_the_brothers_church));
        subjects.add(new Subject("Meinesz & Bennesz", "Meinesz & Bennesz in a " +
                "bird's eye view\n" +
                "\n" +
                "It was in the autumn of 1994, on 15 October, that world famous Zwollenaar Ria van " +
                "Ommen Meinesz & Bennesz store opened at Assendorperstraat 169. Zwolle was a unique store richer. \n" +
                "Meine Boonstra and Ben van Loo started their hobby first, on Thursday evening and " +
                "Saturday, with the sale of the most diverse brocante, " +
                "second-hand items. When an Assendorper store in wooden toys stopped, Meine and Ben " +
                "took over the articles.\n" +
                "Soon they grew out of their jacket. After two years they moved to number 82, a bit " +
                "further away in the Assendorperstraat. Everything was possible, everything was sold: " +
                "lamps, religious statues, crates, wind chimes, handicrafts such as custom-made " +
                "tables, candles from a candle maker, pepper boxes from a local artist and the " +
                "nicest, most beautiful gift items. There was a gate of love where couples could " +
                "walk under, there were contests for children and Meine and Ben were always everywhere. " +
                "Since 1997, Meine has been the solid Saint of Saints, and his love for the saintly " +
                "is first and foremost in the sale of saints' images.\n" +
                "\n" +
                "In 2006 Meine and Ben opened the unique, smallest and most fun Sinterklaas Museum " +
                "under the building at number 82. The store turned from yellow to green to orange " +
                "and was used more and more efficiently. The range also changed. In 2011, Meine and " +
                "Ben decided to focus entirely on party items and party clothing. A supersuccess " +
                "decision: since then the storm has been running. Number 33, the building exactly " +
                "opposite number 82, is full of the most diverse party clothes, from carnival costumes " +
                "to lederhosen. If you want to be in the party mood, you should pay a visit to " +
                "Meinesz & Bennesz. For fun and fun!", "Meinesz & Bennesz \nAssendorperstraat 82" +
                " en 33 \n8012 CB Zwolle", "038-4211399", "meineszbennesz@planet.nl",
                R.drawable.feestartikelen_winkel, R.raw.meinesz_and_bennesz_en));
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

