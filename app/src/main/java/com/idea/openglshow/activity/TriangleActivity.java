package com.idea.openglshow.activity;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.idea.openglshow.R;
import com.idea.openglshow.render.TriangleRender;

public class TriangleActivity extends AppCompatActivity {

    private GLSurfaceView mGlSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        mGlSurfaceView = (GLSurfaceView) findViewById(R.id.gl_view);
        // 设置OpenGL版本(一定要设置)
        mGlSurfaceView.setEGLContextClientVersion(2);
        // 设置渲染器(后面会着重讲这个渲染器的类)
        mGlSurfaceView.setRenderer(new TriangleRender());
        // 设置渲染模式为连续模式(会以60fps的速度刷新)
        mGlSurfaceView.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
        /* 重点结束 */
    }
}
