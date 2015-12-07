package jp.shipper.app.network;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

import jp.shipper.app.ShipperApplication;
import jp.shipper.app.utils.Logger;

public class APIClient {

    private static String TAG = APIClient.class.getSimpleName();

    private static APIClient mIntance;

    private APIClient(){}

    public static APIClient getInstance() {
        if(mIntance == null){
            mIntance = new APIClient();
        }
        return mIntance;
    }

    private void stringRequest(int method, String url, Response.Listener listener, Response.ErrorListener error, String tag, final Map<String, String> params){
        Logger.d(TAG, "[request] url: "+url);
        Logger.d(TAG, "[request] params: "+params);
        StringRequest strReq = new StringRequest(method, url, listener, error){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                super.getParams();
                return params;
            }
        };
        ShipperApplication.getInstance().addToRequestQueue(strReq, tag);
    }

    public void stringRequestGet(String url, Response.Listener listener, Response.ErrorListener error, String tag){
        stringRequest(Request.Method.GET, url, listener, error, tag, null);
    }

    public void stringRequestPost(String url, Response.Listener listener, Response.ErrorListener error, String tag, Map<String, String> params){
        stringRequest(Request.Method.POST, url, listener, error, tag, params);
    }

}
