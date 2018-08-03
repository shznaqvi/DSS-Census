package edu.aku.hassannaqvi.dss_census_sur.get;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import edu.aku.hassannaqvi.dss_census_sur.contracts.VersionAppContract;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class GetVersion extends AsyncTask<String, String, String> {

    private final String TAG = "GetVersion()";
    HttpURLConnection urlConnection;
    private Context mContext;
    private ProgressDialog pd;

    public GetVersion(Context context) {
        mContext = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext);
        pd.setTitle("Syncing Version");
        pd.setMessage("Getting connected to server...");
        pd.show();

    }

    @Override
    protected String doInBackground(String... args) {

        StringBuilder result = new StringBuilder();

        try {
            URL url = new URL(MainApp._UPDATE_URL + VersionAppContract.VersionAppTable._URI);
            urlConnection = (HttpURLConnection) url.openConnection();
            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                String line;
                while ((line = reader.readLine()) != null) {
                    Log.i(TAG, "Version App In: " + line);
                    result.append(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();


        } finally {
            urlConnection.disconnect();
        }


        return result.toString();
    }

    @Override
    protected void onPostExecute(String result) {

        //Do something with the JSON string
        String json = result;
        Log.d(TAG, result);
        if (json.length() > 0) {
            DatabaseHelper db = new DatabaseHelper(mContext);
            try {
                JSONArray jsonArray = new JSONArray(json);
                db.syncVersionApp(jsonArray);
                pd.setMessage("Received: " + jsonArray.length());
                pd.show();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            pd.setMessage("Received: " + json.length() + "");
            pd.show();
        }
    }
}