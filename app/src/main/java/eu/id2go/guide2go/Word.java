/*
 * Copyright (C) 2018 The Android Open Source Project
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


/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default object, an Object Description, and an image for that word.
 */
public class Word {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the word
     */
    private String mTouristicObject;
    /**
     * Object Description for the word
     */
    private String mObjectDescription;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param touristicObject is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param objectDescription  is the word in the word array list
     */
    public Word(String touristicObject, String objectDescription, int audioResourceId) {
        mTouristicObject = touristicObject;
        mObjectDescription = objectDescription;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param touristicObject is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param objectDescription   is the word in the Description array
     * @param imageResourceId    is the drawable resource ID for the image associated with the word
     * @param audioResourceId    is the drawable resource ID for the audio file associated with
     *                           the word
     */
    public Word(String touristicObject, String objectDescription, int imageResourceId,
                int
            audioResourceId) {
        mTouristicObject = touristicObject;
        mObjectDescription = objectDescription;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getTouristicObject() {
        return mTouristicObject;
    }

    /**
     * Get the Description translation of the word array TouristicObject.
     */
    public String getObjectDescription() {
        return mObjectDescription;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }


}
