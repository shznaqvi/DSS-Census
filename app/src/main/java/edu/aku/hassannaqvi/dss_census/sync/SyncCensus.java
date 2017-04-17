package edu.aku.hassannaqvi.dss_census.sync;

/**
 * Created by hassan.naqvi on 12/2/2016.
 */

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;

import edu.aku.hassannaqvi.dss_census.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census.MainApp;
import edu.aku.hassannaqvi.dss_census.contracts.CensusContract;

/**
 * Created by hassan.naqvi on 7/26/2016.
 */
public class SyncCensus extends AsyncTask<String, Void, String> {

    private static final String TAG = "SyncCensus";
    private Context mContext;
    private ProgressDialog pd;

    public SyncCensus(Context context) {
        mContext = context;
    }

    /*public static void longInfo(String str) {
        if (str.length() > 4000) {
            Log.i("TAG: ", str.substring(0, 4000));
            longInfo(str.substring(4000));
        } else
            Log.i("TAG: ", str);
    }*/

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext);
        pd.setTitle("Please wait... Processing Census");
        pd.show();

    }


    @Override
    protected String doInBackground(String... urls) {

        String line = "No Response";
        try {
            return downloadUrl(MainApp._HOST_URL + "");
        } catch (IOException e) {
            return "Unable to upload data. Server may be down.";
        }

    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);

        JSONArray json = null;
        try {
            json = new JSONArray(result);
            DatabaseHelper db = new DatabaseHelper(mContext);
            for (int i = 0; i < json.length(); i++) {
                db.updateCensus(json.getString(i));
            }
            Toast.makeText(mContext, "Successfully Synced " + json.length() + " Census", Toast.LENGTH_SHORT).show();

            pd.setMessage(json.length() + " Census synced.");
            pd.setTitle("Done uploading Census data");
            pd.show();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(mContext, "Failed Sync " + result, Toast.LENGTH_SHORT).show();

            pd.setMessage(result);
            pd.setTitle("Census Sync Failed");
            pd.show();

        }

    }

    private String downloadUrl(String myurl) throws IOException {
        InputStream is = null;
        // Only display the first 500 characters of the retrieved
        // web page content.
        int len = 500;
        //DatabaseHelper db = new DatabaseHelper(mContext);
        //Collections<CensusContract> Census = db.getUnsyncedForm

        try {
            URL url = new URL(myurl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(10000 /* milliseconds */);
            conn.setConnectTimeout(15000 /* milliseconds */);
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("charset", "utf-8");
            conn.setUseCaches(false);
            // Starts the query
            conn.connect();
            JSONArray jsonSync = new JSONArray();
            try {
                DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
                DatabaseHelper db = new DatabaseHelper(mContext);
                Collection<CensusContract> Census = db.getAllCensus();
                Log.d(TAG, String.valueOf(Census.size()));
                for (CensusContract fc : Census) {

                    jsonSync.put(fc.toJSONObject());

                }
                wr.writeBytes(jsonSync.toString().replace("\uFEFF", "") + "\n");
                //longInfo(jsonSync.toString().replace("\uFEFF", "") + "\n");
                wr.flush();
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            int response = conn.getResponseCode();
            Log.d(TAG, "The response is: " + response);
            is = conn.getInputStream();

            // Convert the InputStream into a string
            String contentAsString = readIt(is, len);
            return contentAsString;

            // Makes sure that the InputStream is closed after the app is
            // finished using it.
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    public String readIt(InputStream stream, int len) throws IOException {
        Reader reader = null;
        reader = new InputStreamReader(stream, "UTF-8");
        char[] buffer = new char[len];
        reader.read(buffer);
        return new String(buffer);
    }
}