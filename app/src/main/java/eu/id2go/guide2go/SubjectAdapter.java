/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.id2go.guide2go;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SubjectAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Subject} objects.
 */
public class SubjectAdapter extends ArrayAdapter<Subject> {

    /**
     * Resource ID for the background color for this list of subjects
     */
//    private static final String LOG_TAG = SubjectAdapter.class.getSimpleName();
    private int backgroundColor = R.color.tan_background;

    private AbstractSubjectFragment abstractSubjectFragment;

    /**
     * Create a new {@link SubjectAdapter} object.
     *
     * @param context  is the current context (i.e. Activity) that the adapter is being created in.
     * @param subjects is the list of {@link Subject}s to be displayed.
     */
    public SubjectAdapter(Activity context, ArrayList<Subject> subjects, AbstractSubjectFragment
            abstractSubjectFragment) {
        super(context, 0, subjects);
        this.abstractSubjectFragment = abstractSubjectFragment;
    }

    public void setBackgroundColor(int color) {
        backgroundColor = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listViewItem = convertView;
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        listViewItem.setBackgroundColor(ContextCompat.getColor(getContext(), backgroundColor));


        // Get the {@link Subject} object located at this position in the list
        Subject currentSubject = getItem(position);

        // Find the TextViews & ImageView in the list_item.xml layout with the ID
        // description_text_view.
        TextView descriptionTextView = listViewItem.findViewById(R.id.description_text_view);
        TextView touristicTextView = listViewItem.findViewById(R.id.touristic_text_view);
        TextView addressTextView = listViewItem.findViewById(R.id.address_text_view);
        TextView phoneTextView = listViewItem.findViewById(R.id.phone_text_view);
        TextView emailTextView = listViewItem.findViewById(R.id.email_text_view);
        ImageView imageView = listViewItem.findViewById(R.id.image);

        // Get the Object Description subject & the translation from the currentSubject object and set
        // this
        // text on
        // the Object Description TextView.
        descriptionTextView.setText(currentSubject.getObjectDescription());
        touristicTextView.setText(currentSubject.getTouristicObject());
        addressTextView.setText(currentSubject.getAddressInfo());
        phoneTextView.setText(currentSubject.getPhoneInfo());
        emailTextView.setText(currentSubject.getEmailInfo());

        // Check if an image is provided for this subject or not
        if (currentSubject.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentSubject.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listViewItem.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), backgroundColor);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        abstractSubjectFragment.setListenerForViewAudio(listViewItem,
                currentSubject.getAudioResourceId());
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listViewItem;
    }
}