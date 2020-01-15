package com.cookandroid.weatherfashion;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Degree23 extends AppCompatActivity {

    Integer[] imgID={
            R.drawable.img47, R.drawable.img46, R.drawable.img45, R.drawable.img43,
            R.drawable.img38, R.drawable.img31,R.drawable.img36,R.drawable.img42,
            R.drawable.img39,R.drawable.img40,R.drawable.img41
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree23);

        GridView gv=(GridView) findViewById(R.id.gridView1);
        MyGridViewAdapter gAdapter=new MyGridViewAdapter(this);
        gv.setAdapter(gAdapter);
    }

    public class  MyGridViewAdapter extends BaseAdapter {
        Context context;

        public MyGridViewAdapter(Context c){
            context=c;
        }

        @Override
        public int getCount() {
            return imgID.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            ImageView imgv= new ImageView(context);
            imgv.setLayoutParams(new GridView.LayoutParams(200,300));
            imgv.setPadding(5,5,5,5);
            imgv.setImageResource(imgID[i]);

            return imgv;
        }
    }
}
