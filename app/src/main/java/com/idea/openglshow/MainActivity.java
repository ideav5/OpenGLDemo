package com.idea.openglshow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.idea.openglshow.activity.SGLViewActivity;
import com.idea.openglshow.activity.TriangleActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTri = (Button) findViewById(R.id.btn_tri);
        btnTri.setOnClickListener(this);
        Button btnPic = (Button) findViewById(R.id.btn_pic);
        btnPic.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_tri:
                startActivity(new Intent(this, TriangleActivity.class));

                break;
            case R.id.btn_pic:
                startActivity(new Intent(this, SGLViewActivity.class));

                break;
        }
    }
}
