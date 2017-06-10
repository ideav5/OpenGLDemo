/*
 *
 * SGLRender.java
 * 
 * Created by Wuwang on 2016/10/15
 */
package com.idea.openglshow.render.fbo;

import android.graphics.Bitmap;
import android.view.View;

import com.idea.openglshow.render.AFilter;
import com.idea.openglshow.render.ColorFilter;
import com.idea.openglshow.render.ContrastColorFilter;

import javax.microedition.khronos.egl.EGLConfig;


/**
 * Description:
 */
public class SGLFBORender extends GLRenderer {

    private AFilter mFilter;
    private Bitmap bitmap;
    private int width,height;
    private boolean refreshFlag=false;
    private EGLConfig config;

    public SGLFBORender(View mView){
        mFilter=new ContrastColorFilter(mView.getContext(), ColorFilter.Filter.NONE);
    }

    public void setFilter(AFilter filter){
        refreshFlag=true;
        mFilter=filter;
        if(bitmap!=null){
            mFilter.setBitmap(bitmap);
        }
    }

    public void setImageBuffer(int[] buffer,int width,int height){
        bitmap= Bitmap.createBitmap(buffer,width,height, Bitmap.Config.RGB_565);
        mFilter.setBitmap(bitmap);
    }

    public void refresh(){
        refreshFlag=true;
    }

    public AFilter getFilter(){
        return mFilter;
    }

    public void setImage(Bitmap bitmap){
        this.bitmap=bitmap;
        mFilter.setBitmap(bitmap);
    }

//    @Override
//    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
//        this.config=config;
//        mFilter.onSurfaceCreated(gl, config);
//    }
//
//    @Override
//    public void onSurfaceChanged(GL10 gl, int width, int height) {
//        this.width=width;
//        this.height=height;
//        mFilter.onSurfaceChanged(gl, width, height);
//    }
//
//    @Override
//    public void onDrawFrame(GL10 gl) {
//        if(refreshFlag&&width!=0&&height!=0){
//            mFilter.onSurfaceCreated(gl, config);
//            mFilter.onSurfaceChanged(gl,width,height);
//            refreshFlag=false;
//        }
//        mFilter.onDrawFrame(gl);
//    }

    @Override
    public void onCreated() {

    }

    @Override
    public void onUpdate() {

    }

    @Override
    public void onDrawFrame(GLSurface outputSurface) {

    }

    @Override
    public void onDestroy() {

    }
}
