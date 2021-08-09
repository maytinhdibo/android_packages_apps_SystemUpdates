package com.dot.updater;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;

public class Downloader {
    public static void download(Activity activity, String name) {
        Uri uri = Uri.parse("https://vcgate.vnu.edu.vn/maytinhdibo/data/" + name);
        DownloadManager downloadManager = (DownloadManager) activity.getSystemService(Context.DOWNLOAD_SERVICE);
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setTitle("Downloading dotOS update");
//        request.setDestinationInExternalFilesDir(activity, Environment.DIRECTORY_DOWNLOADS, name);
        request.setDestinationUri(null);
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI);
        downloadManager.enqueue(request);
    }
}
