package com.cookandroid.weatherfashion;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;

public class Degree5 extends AppCompatActivity {

    Integer[] imgID={
            R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img7, R.drawable.img8, R.drawable.img9,
            R.drawable.img15,R.drawable.img16,R.drawable.img17
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree5);
        setTitle("5도 이하");

        GridView gv=(GridView) findViewById(R.id.gridView1);
        MyGridViewAdapter gAdapter=new MyGridViewAdapter(this);
        gv.setAdapter(gAdapter);
    }

    public class  MyGridViewAdapter extends BaseAdapter{
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
