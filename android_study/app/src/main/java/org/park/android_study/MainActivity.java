package org.park.android_study;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    int mCount = 0;
    TextView mTextCount;
    View image,vw;
    Button btn;
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        mTextCount=(TextView)findViewById(R.id.count);
        findViewById(R.id.down).setOnLongClickListener(mLongClickListener);
        findViewById(R.id.up).setOnLongClickListener(mLongClickListener);

        //레이아웃에 사용한 버튼 연결
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"버튼을 눌렀어요!!!!",Toast.LENGTH_SHORT).show();
            }
        });

        image=(View)findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"영상이 아직 없어요",Toast.LENGTH_SHORT).show();
            }
        });
        vw=(View)findViewById(R.id.vw);
        vw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"화면터치",Toast.LENGTH_SHORT).show();
            }
        });



    }

    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.down:
                mCount--;
                mTextCount.setText("" + mCount);
                break;
            case R.id.up:
                mCount++;
                mTextCount.setText("" + mCount);
                break;
        }
    }

    View.OnLongClickListener mLongClickListener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            switch (v.getId()) {
                case R.id.down:
                    mCount = 0;
                    mTextCount.setText("" + mCount);
                    return true;
                case R.id.up:
                    mCount = 100;
                    mTextCount.setText("" + mCount);
                    break;
            }
            return false;
        }
    };


}


