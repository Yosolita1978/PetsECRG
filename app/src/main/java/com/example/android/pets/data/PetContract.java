package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {

    // Empty constructor so will not have instances.
    private PetContract() {}

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class PetEntry implements BaseColumns {

        /** Name of database table for pets */
        public final static String TABLE_NAME = "pets";
        /** Column for ID */
        public final static String _ID = BaseColumns._ID;
        /** Column for name of the pet */
        public final static String COLUMN_PET_NAME ="name";
        /** Column for breed of the pet */
        public final static String COLUMN_PET_BREED = "breed";
        /** Column for gender of the pet */
        public final static String COLUMN_PET_GENDER = "gender";
        /** Column for weight of the pet */
        public final static String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for the gender of the pet.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}
