package ie.iamshanedoyle.android;

import android.app.Application;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by shane on 10/12/2013.
 */
public class MainApplication extends Application {

    private static Bus mEventBus;

    public static Bus getEventBus() {
        return mEventBus;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mEventBus = new Bus(ThreadEnforcer.ANY);
    }
}