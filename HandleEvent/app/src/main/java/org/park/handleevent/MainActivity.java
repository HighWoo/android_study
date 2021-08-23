package org.park.handleevent;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

class HandleEvent extends Activity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View vw=new MyView(this);
        setContentView(vw);
    }
    class MyView extends View{
        public MyView(Context context){
            super(context);
        }
        public boolean onTouchEvent(MotionEvent event){
            super.onTouchEvent(event);
            if(event.getAction()==MotionEvent.ACTION_DOWN){
                Toast.makeText(HandleEvent.this,"Touch Event Reaaa",
                        Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }
}