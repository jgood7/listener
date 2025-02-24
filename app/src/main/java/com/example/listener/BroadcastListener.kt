package com.example.listener;

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification

class BroadcastListener : NotificationListenerService() {

    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        // Handle notification posted
        sbn?.let {
            // You can access the notification's content here
            val packageName = sbn.packageName
            val notificationText = sbn.notification?.extras?.getCharSequence("android.text")
            println("Notification from $packageName: $notificationText")
        }
    }

    override fun onNotificationRemoved(sbn: StatusBarNotification?) {
        // Handle notification removed
        sbn?.let {
            val packageName = sbn.packageName
            println("Notification from $packageName removed.")
        }
    }
}
