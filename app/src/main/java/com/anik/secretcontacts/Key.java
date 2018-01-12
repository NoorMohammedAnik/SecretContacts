package com.anik.secretcontacts;

/**
 * Created by Noor Mohammed on 27-Dec-2017.
 */

public class Key {


    //access db from device
    //for mobile device cmd>ipconfig>ipv4 address copy

    //for local host-Emulator public static final String SIGNUP_URL = "http://10.0.2.2/contacts/signup.php";

    public static final String SIGNUP_URL = "http://android.cseiiuc.cf/contacts/signup.php";
    public static final String LOGIN_URL = "http://android.cseiiuc.cf/contacts/login.php";

    //Keys for email and password as defined in our $_POST['key'] in login.php
    public static final String KEY_NAME = "name";
    public static final String KEY_CELL = "cell";
    public static final String KEY_PASSWORD = "password";
}
