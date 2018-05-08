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
 * {@link Subject} represents a vocabulary subject that the user wants to learn.
 * It contains a default object, an Object Description, and an image for that subject.
 */
public class Subject {

    /**
     * Constant value that represents no image was provided for this subject
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the subject
     */
    private String mTouristicObject;
    /**
     * Object Description for the subject
     */
    private String mObjectDescription;

    private String mAddressInfo;

    private String mPhoneInfo;

    private String mEmailInfo;
    /**
     * Image resource ID for the subject
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    /**
     * Create a new Subject object.
     *
     * @param touristicObject   is the subject in a language that the user is already familiar with
     *                          (such as English)
     * @param objectDescription is the subject in the subject array list
     */
    public Subject(String touristicObject, String objectDescription, String addressInfo, String
            phoneInfo,
                   String emailInfo, int audioResourceId) {
        mTouristicObject = touristicObject;
        mObjectDescription = objectDescription;
        mAddressInfo = addressInfo;
        mPhoneInfo = phoneInfo;
        mEmailInfo = emailInfo;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Subject object.
     *
     * @param touristicObject   is the subject in a language that the user is already familiar with
     *                          (such as English)
     * @param objectDescription is the subject in the Description array
     * @param addressInfo       is the subject in the Address array
     * @param imageResourceId   is the drawable resource ID for the image associated with the
     *                          subject
     * @param audioResourceId   is the drawable resource ID for the audio file associated with
     *                          the subject
     */
    public Subject(String touristicObject, String objectDescription, String addressInfo, String
            phoneInfo,
                   String emailInfo, int imageResourceId, int audioResourceId) {
        mTouristicObject = touristicObject;
        mObjectDescription = objectDescription;
        mAddressInfo = addressInfo;
        mPhoneInfo = phoneInfo;
        mEmailInfo = emailInfo;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the subject.
     */
    public String getTouristicObject() {
        return mTouristicObject;
    }

    /**
     * Get the Description translation of the subject array TouristicObject.
     */
    public String getObjectDescription() {
        return mObjectDescription;
    }

    public String getAddressInfo() {
        return mAddressInfo;
    }

    public String getPhoneInfo() {
        return mPhoneInfo;
    }

    public String getEmailInfo() {
        return mEmailInfo;
    }

    /**
     * Return the image resource ID of the subject.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this subject.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }


}
