package com.badruivan.chatting;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import org.jetbrains.annotations.NotNull;

public class FirebaseFCMService extends FirebaseMessagingService {

    private static String TAG = FirebaseFCMService.class.getSimpleName();


    public FirebaseFCMService() {
        super();
    }

    @Override
    public void onNewToken( String token) {
        super.onNewToken(token);

        Log.d(TAG, "Refreshed token: " + token);

    }

    @Override
    public void onMessageReceived(@NonNull @NotNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        Log.d(TAG, "From: " + remoteMessage.getFrom());

        

    }
}
