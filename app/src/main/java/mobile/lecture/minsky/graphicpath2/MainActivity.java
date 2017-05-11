package mobile.lecture.minsky.graphicpath2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    class MyView extends View {
        public MyView(Context context){
            super(context);
            setBackgroundColor(Color.YELLOW);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint paint = new Paint();
            Matrix m = new Matrix();
            m.preScale(1, -1);
            Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.house);
            Bitmap mb = Bitmap.createBitmap(b, 0, 0, b.getWidth(), b.getHeight(), m, false);
            Bitmap sb = Bitmap.createScaledBitmap(b, 200, 200, false);
            canvas.drawBitmap(mb, 0, 0, null);
            canvas.drawBitmap(sb, 100, 100, null);
        }

    }

    LinearLayout mLinearLayout;

    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
//        mLinearLayout = new LinearLayout(this);
//
//        ImageView i = new ImageView(this);
//        i.setImageDrawable(getResources().getDrawable(R.drawable.oval));
//        i.setMinimumHeight(100);
//        i.setMinimumWidth(100);
//
//        mLinearLayout.addView(i);
//        setContentView(mLinearLayout);
    }

}
