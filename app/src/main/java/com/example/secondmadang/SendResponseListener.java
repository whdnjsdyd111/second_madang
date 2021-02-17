package com.example.secondmadang;

import com.android.volley.VolleyError;

public interface SendResponseListener {
    public void onRequestStarted();
    public void onRequestCompleted();
    public void onRequestWithError(VolleyError error);
}
