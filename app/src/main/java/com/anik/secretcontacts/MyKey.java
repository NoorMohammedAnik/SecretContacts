package com.anik.secretcontacts;

/**
 * Created by Noor Mohammed on 27-Dec-2017.
 */

public class MyKey {


    //access db from device
    //for mobile device cmd>ipconfig>ipv4 address copy

    //for local host-Emulator public static final String SIGNUP_URL = "http://10.0.2.2/contacts/signup.php";

    //main url or address
    public static final String MAIN_URL = "http://android.cseiiuc.cf";

    public static final String SIGNUP_URL = MAIN_URL+"/contacts/signup.php";
    public static final String LOGIN_URL = MAIN_URL+"/contacts/login.php";
    public static final String SAVE_URL = MAIN_URL+"/contacts/save_contact.php";
    public static final String UPDATE_URL = MAIN_URL+"/contacts/update_contact.php";
    public static final String DELETE_URL = MAIN_URL+"/contacts/delete_contact.php";


    //url for contacts view
    public static final String CONTACT_VIEW_URL = MAIN_URL+"/contacts/view_contact.php?cell=";

    //Keys for email and password as defined in our $_POST['key'] in login.php
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    public static final String KEY_CELL = "cell";
    public static final String KEY_USER_CELL = "user_cell";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";

//share preference
    //We will use this to store the boolean in sharedpreference to track user is loggedin or not
    public static final String SHARED_PREF_NAME = "com.anik.secretcontacts.userlogin"; //pcakage name+ id
    //This would be used to store the cell of current logged in user
    public static final String CELL_SHARED_PREF = "cell";


    public static final String JSON_ARRAY = "result";


}
