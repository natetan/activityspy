package edu.washington.swifties.activityspy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

  public static final String TAG = MainActivity.class.getName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Log.i(TAG, "onCreate event fired");
  }

  @Override
  protected void onStart() {
    Log.i(TAG, "onStart event fired");
  }

  @Override
  protected void onResume() {
    Log.i(TAG, "onResume event fired");
  }

  @Override
  protected void onPause() {
    Log.i(TAG, "onPause event fired");
  }

  @Override
  protected void onStop() {
    Log.i(TAG, "onStop event fired");
  }

  @Override
  protected void onRestart() {
    Log.i(TAG, "onRestart event fired");
  }

  @Override
  protected void onDestroy() {
    Log.e(TAG, "We're going down, Captain!");
  }
}
