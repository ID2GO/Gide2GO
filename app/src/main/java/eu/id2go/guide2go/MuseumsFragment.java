package eu.id2go.guide2go;

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
        subjects.add(new Subject("Museum the Foundation", "Come and see this " +
                "extensive museum, it is definitely worth it! \n" +
                "Palace at the Blijmarkt is the location of Museum de Foundation in Zwolle.\n" +
                "This neoclassical building was built between 1838 and 1841, after a design by the " +
                "Hague architect Eduard Louis de Coninck. It served as the Palace of Justice and " +
                "later hosted, among other things, the Provincial Planning Service. \n" +
                "In 2004/2005 the Palace at the Blijmarkt was converted into an art museum after a " +
                "design by architect Gunnar Daan. Since June 2005, the Palace and the Het Nijenhuis " +
                "Museum have formed the Fundatie. On the ground floor there is an extensive choice " +
                "from the museum's own collection of visual art, from the late Middle Ages to the present.\n" +
                "This collection was mainly brought together by collector Dirk Hannema (1895-1984, " +
                "former director Boymans Museum in Rotterdam) and includes works by old masters such " +
                "as Strozzi, Vroom and Weenix, international masterpieces by Picabia, Turner, " +
                "Bernini and Canova and many Dutch art from, among others, Mondrian, Israel, Toorop, " +
                "van der Leck, Apple, Lucebert, Carter and many others. On the top floor, regularly " +
                "changing exhibitions are put together.", "Museum the Foundation \nBlijmarkt 20 " +
                "\n8011 NE Zwolle", "0572-388188", "info@museumdefundatie.nl",
                R.drawable.museum_de_fundatie, R.raw.museum_the_foundation));
        subjects.add(new Subject("Herman Brood Experience", "At the Herman Brood " +
                "Experience we like to give you an insight into the legendary life of the singer " +
                "and painter who died in 2001.\n" +
                "Paintings, screen prints and drawings by the artist. Visitors can also look at photos " +
                "and personal items such as painted guitars, clothing, painting material and even" +
                " needles.\n" +
                "The widow of Brood, Xandra, is involved in the project.\n" +
                "Visitors do not have to pay an entrance fee for the Experience, but a voluntary " +
                "contribution is always welcome. In the shop you can buy paintings, screen prints, " +
                "drawings and bread merchandise.", "Herman Brood Experience \nBlijmarkt 21 \n8011" +
                " ND Zwolle", "06-55336540", "info@hermanbroodexperience.nl",
                R.drawable.herman_brood_museum, R.raw.herman_brood_museum_en));
        subjects.add(new Subject("Dutch Bakery Museum", "The Dutch Bakery museum " +
                "is in Hattem, near Zwolle. \n" +
                "What a nice and delicious museum!\n" +
                "In the nicest and largest bakery museum in the Netherlands there is a lot to do for " +
                "young and old. In the historic buildings you will find everything about the tasty " +
                "history of bread and pastry. Seeing, tasting, smelling and feeling are of paramount importance.\n" +
                "Children can bake themselves every day during school holidays. Check our website for " +
                "more baking activities and packages.\n" +
                "What a nice and tasty museum!", "Dutch Bakery Museum \nKerkhofstraat 13 \n8051 " +
                "GG Hattem", "038-4441715", "info@bakkerijmuseum.nl",
                R.drawable.nederlands_bakkerij_museum, R.raw.dutch_bakery_museum));
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
