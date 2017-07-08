package com.example.asus.lifecycle;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected MyApplication mMyApplication;
    private Button mBtn, mBtn1;
    private ImageView mImageView;
    private RelativeLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn = (Button) findViewById(R.id.btn_add);
        mBtn1 = (Button) findViewById(R.id.btn_add1);
        mImageView = (ImageView) findViewById(R.id.tv_text);
        mLayout = (RelativeLayout) findViewById(R.id.lt_layout);
        mBtn.setOnClickListener(this);
        mBtn1.setOnClickListener(this);

    }

    @Override
    protected void onResume() {

        super.onResume();
    }

    @Override
    protected void onPause() {

        super.onPause();
    }

    @Override
    public void onClick(View v) {
      /*  ShapeDrawable circle = new ShapeDrawable(new OvalShape());
        circle.setIntrinsicHeight(dpToPx(80));
        circle.setIntrinsicWidth(dpToPx(80));
        circle.getPaint().setAntiAlias(true);
        circle.getPaint().setColor(Color.RED);


        ShapeDrawable ring = new ShapeDrawable(new OvalShape());
        ring.setIntrinsicHeight(dpToPx(90));
        ring.setIntrinsicWidth(dpToPx(90));
        ring.getPaint().setColor(Color.GREEN);
        ring.getPaint().setStyle(Paint.Style.STROKE);
        ring.getPaint().setAntiAlias(true);
        ring.getPaint().setStrokeWidth(dpToPx(5));
        ring.setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);

        LayerDrawable drawable = new LayerDrawable(new Drawable[]{circle,ring});*/

       /* GradientDrawable circle = new GradientDrawable();
        circle.setColor(Color.RED);
        circle.setShape(GradientDrawable.OVAL);
        circle.setSize(200, 200);
        //circle.setStroke(15,Color.BLUE);


        GradientDrawable ring = new GradientDrawable();
        ring.setColor(Color.BLACK);
        ring.setShape(GradientDrawable.OVAL);
        ring.setSize(250, 250);
       // ring.setStroke(15,Color.GREEN);

        LayerDrawable drawable = new LayerDrawable(new Drawable[]{ring,circle});*/
        //drawable.setLayerInset(1,10,10,10,10);
        // drawable.setLayerGravity(1,Gravity.CENTER);
        // mImageView.setBackground(drawable);

        /*Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);*/
      /*
        ViewGroup.LayoutParams lp = mImageView.getLayoutParams();
        lp.height = mImageView.getHeight() - 100;
        lp.width = mImageView.getWidth() - 100;
        mImageView.setLayoutParams(lp);*/
        switch (v.getId()) {
            case R.id.btn_add:
                Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ring);
                Bitmap b = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                drawable.setBounds(0, 0, b.getHeight(), b.getWidth());
                drawable.draw(new Canvas(b));
                mImageView.setImageBitmap(b);

                // mLayout.requestLayout();
                break;
            case R.id.btn_add1:
                drawable = ContextCompat.getDrawable(this, R.drawable.ring);
                b = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);

                drawable.draw(new Canvas(b));
                mImageView.setImageBitmap(Bitmap.createScaledBitmap(b,30,30,false));

                //  mLayout.requestLayout();
        }


    }

    private float scale = 0;

    private float getScale() {
        if (scale == 0)
            scale = this.getResources().getDisplayMetrics().densityDpi / 160f;
        return scale;
    }

    public int dpToPx(float dp) {
        return (int) (dp * getScale());
    }
}
