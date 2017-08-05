package calorieconting.com.pattern.chonlakant.ph;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import calorieconting.com.pattern.chonlakant.ph.activity.ListMenuActivity;
import calorieconting.com.pattern.chonlakant.ph.adapter.CustomAdapter;

public class ListActivity extends AppCompatActivity {

    CustomAdapter customAdapter;
    GridView gd;

    String[] menu = {"เครื่องดื่ม", "ขนมหวาน", "ข้าวต้ม/โจ๊ก", "อาหาร(กับข้าว)", "อาหารนานาชาติ"
            , "อาหารจานเดียว", "อาหารจานเดียว(เส้น)", "ซุป", "อาหาร(ยำ)", "ผลไม้"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        gd = (GridView) findViewById(R.id.gd);
        customAdapter = new CustomAdapter(getApplicationContext(), menu);
        gd.setAdapter(customAdapter);

        gd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i =new Intent(getApplicationContext(), ListMenuActivity.class);
                    i.putExtra("code","IPD-BEV-ALL");
                    i.putExtra("title",menu[0]);
                    startActivity(i);
                }
                if (position == 1) {
                    Intent i =new Intent(getApplicationContext(), ListMenuActivity.class);
                    i.putExtra("code","IPD-DES-THA");
                    i.putExtra("title",menu[1]);
                    startActivity(i);
                }
                if (position == 2) {
                    Intent i =new Intent(getApplicationContext(), ListMenuActivity.class);
                    i.putExtra("code","IPD-FD-BOR");
                    i.putExtra("title",menu[2]);
                    startActivity(i);
                }
                if (position == 3) {
                    Intent i =new Intent(getApplicationContext(), ListMenuActivity.class);
                    i.putExtra("code","IPD-FD-CON");
                    i.putExtra("title",menu[3]);
                    startActivity(i);
                }
                if (position == 4) {
                    Intent i =new Intent(getApplicationContext(), ListMenuActivity.class);
                    i.putExtra("code","IPD-FD-INT");
                    i.putExtra("title",menu[4]);
                    startActivity(i);
                }
                if (position == 5) {
                    Intent i =new Intent(getApplicationContext(), ListMenuActivity.class);
                    i.putExtra("code","IPD-FD-MAI");
                    i.putExtra("title",menu[5]);
                    startActivity(i);
                }
                if (position == 6) {
                    Intent i =new Intent(getApplicationContext(), ListMenuActivity.class);
                    i.putExtra("code","IPD-FD-NOO");
                    i.putExtra("title",menu[6]);
                    startActivity(i);
                }
                if (position == 7) {
                    Intent i =new Intent(getApplicationContext(), ListMenuActivity.class);
                    i.putExtra("code","IPD-FD-SOP");
                    i.putExtra("title",menu[7]);
                    startActivity(i);
                }
                if (position == 8) {
                    Intent i =new Intent(getApplicationContext(), ListMenuActivity.class);
                    i.putExtra("code","IPD-FD-SPI");
                    i.putExtra("title",menu[8]);
                    startActivity(i);
                }
                if (position == 9) {
                    Intent i =new Intent(getApplicationContext(), ListMenuActivity.class);
                    i.putExtra("code","IPD-FD-SPI");
                    i.putExtra("title",menu[9]);
                    startActivity(i);
                }
                if (position == 10) {
                    Intent i =new Intent(getApplicationContext(), ListMenuActivity.class);
                    i.putExtra("code","IPD-FRE-FRU");
                    i.putExtra("title",menu[10]);
                    startActivity(i);
                }
            }
        });

    }

}
