package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;

    private TextView
            mReplyTextView1,
            mReplyTextView2,
            mReplyTextView3,
            mReplyTextView4,
            mReplyTextView5,
            mReplyTextView6,
            mReplyTextView7,
            mReplyTextView8,
            mReplyTextView9,
            mReplyTextView10;

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("textview1", mReplyTextView1.getText().toString());
        outState.putString("textview2", mReplyTextView2.getText().toString());
        outState.putString("textview3", mReplyTextView3.getText().toString());
        outState.putString("textview4", mReplyTextView4.getText().toString());
        outState.putString("textview5", mReplyTextView5.getText().toString());
        outState.putString("textview6", mReplyTextView6.getText().toString());
        outState.putString("textview7", mReplyTextView7.getText().toString());
        outState.putString("textview8", mReplyTextView8.getText().toString());
        outState.putString("textview9", mReplyTextView9.getText().toString());
        outState.putString("textview10", mReplyTextView10.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

        mReplyTextView1 = findViewById(R.id.textView1);
        mReplyTextView2 = findViewById(R.id.textView2);
        mReplyTextView3 = findViewById(R.id.textView3);
        mReplyTextView4 = findViewById(R.id.textView4);
        mReplyTextView5 = findViewById(R.id.textView5);
        mReplyTextView6 = findViewById(R.id.textView6);
        mReplyTextView7 = findViewById(R.id.textView7);
        mReplyTextView8 = findViewById(R.id.textView8);
        mReplyTextView9 = findViewById(R.id.textView9);
        mReplyTextView10 = findViewById(R.id.textView10);

        if (savedInstanceState != null) {
            if (savedInstanceState.getString("textview1") != "") {
                  mReplyTextView1.setText(savedInstanceState.getString("textview1"));
                  mReplyTextView1.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getString("textview2") != "") {
                mReplyTextView2.setText(savedInstanceState.getString("textview2"));
                mReplyTextView2.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getString("textview3") != "") {
                mReplyTextView3.setText(savedInstanceState.getString("textview3"));
                mReplyTextView3.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getString("textview4") != "") {
                  mReplyTextView4.setText(savedInstanceState.getString("textview4"));
                  mReplyTextView4.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getString("textview5") != "") {
                  mReplyTextView5.setText(savedInstanceState.getString("textview5"));
                  mReplyTextView5.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getString("textview6") != "") {
                  mReplyTextView6.setText(savedInstanceState.getString("textview6"));
                  mReplyTextView6.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getString("textview7") != "") {
                  mReplyTextView7.setText(savedInstanceState.getString("textview7"));
                  mReplyTextView7.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getString("textview8") != "") {
                  mReplyTextView8.setText(savedInstanceState.getString("textview8"));
                  mReplyTextView8.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getString("textview9") != "") {
                  mReplyTextView9.setText(savedInstanceState.getString("textview9"));
                  mReplyTextView9.setVisibility(View.VISIBLE);
            }
            if(savedInstanceState.getString("textview10") != "") {
                  mReplyTextView10.setText(savedInstanceState.getString("textview10"));
                  mReplyTextView10.setVisibility(View.VISIBLE);
            }
        }
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Add Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);

                if(mReplyTextView1.getText().toString() == ""){
                    mReplyTextView1.setText(reply);
                    mReplyTextView1.setVisibility(View.VISIBLE);
                }else if(mReplyTextView2.getText().toString() == ""){
                    mReplyTextView2.setText(reply);
                    mReplyTextView2.setVisibility(View.VISIBLE);
                }else if(mReplyTextView3.getText().toString() == ""){
                    mReplyTextView3.setText(reply);
                    mReplyTextView3.setVisibility(View.VISIBLE);
                }else if(mReplyTextView4.getText().toString() == ""){
                    mReplyTextView4.setText(reply);
                    mReplyTextView4.setVisibility(View.VISIBLE);
                }else if(mReplyTextView5.getText().toString() == ""){
                    mReplyTextView5.setText(reply);
                    mReplyTextView5.setVisibility(View.VISIBLE);
                }else if(mReplyTextView6.getText().toString() == ""){
                    mReplyTextView6.setText(reply);
                    mReplyTextView6.setVisibility(View.VISIBLE);
                }else if(mReplyTextView7.getText().toString() == ""){
                    mReplyTextView7.setText(reply);
                    mReplyTextView7.setVisibility(View.VISIBLE);
                }else if(mReplyTextView8.getText().toString() == ""){
                    mReplyTextView8.setText(reply);
                    mReplyTextView8.setVisibility(View.VISIBLE);
                }else if(mReplyTextView9.getText().toString() == ""){
                    mReplyTextView9.setText(reply);
                    mReplyTextView9.setVisibility(View.VISIBLE);
                }else{
                    mReplyTextView10.setText(reply);
                    mReplyTextView10.setVisibility(View.VISIBLE);
                }

            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
}