package latihansharedpreferences.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ShapeDrawable;
import android.media.MediaTimestamp;

import com.apps.rizkiadam.latihansharedpreferences.model.UserModel;

public class Preferences {

    private static final String PREF_SESSION = "com.apss.rizkiadam.latihansharepreferences.session";

    private final static String REGISTER_USERNAME = "REGISTER_USERNAME";
    private final static String REGISTER_PASSWORD = "REGISTER PASSWORD";
    private final static String REGISTER_PHONE = "REGISTER PHONE";
    private final static String LOGIN_STATUS = "LOGIN STATUS";

    private Context context;

    public Preferences(Context context) {
        this.context = context;
    }

    public static void setUserPreferences(Context context, UserModel usermodel) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_SESSION, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putString(REGISTER_USERNAME, usermodel.getUsername());
        editor.putString(REGISTER_PASSWORD, usermodel.getPassword());
        editor.putString(REGISTER_PHONE, usermodel.getPhone());
        editor.apply();
    }

    public static String getRegisterPassword(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_SESSION, Context.MODE_PRIVATE);
        return preferences.getString(REGISTER_PASSWORD, UtilStatic.DEFAULT_STRING);
    }


    public static void setLoginStatus(Context context, boolean statusLogin) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_SESSION, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putBoolean(LOGIN_STATUS, statusLogin);
        editor.apply();
    }

    public static boolean getLoggedInStatus(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_SESSION, Context.MODE_PRIVATE);
        return preferences.getBoolean(LOGIN_STATUS, UtilStatic.DEFAULT_BOOLEAN);
    }

    public static void setLogout(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_SESSION, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.remove(LOGIN_STATUS);
        editor.apply();
    }

}
