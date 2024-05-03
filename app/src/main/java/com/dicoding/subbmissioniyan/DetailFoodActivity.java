package com.dicoding.subbmissioniyan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailFoodActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        Toolbar toolbar = findViewById(R.id.toolbar_account);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imgFood = findViewById(R.id.imgFood);
        TextView tvFoodName = findViewById(R.id.tvFoodName);
        TextView tvFoodDetail = findViewById(R.id.tvFoodDetail);

        Food food = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (food != null) {
            Glide.with(this)
                    .load(food.getPhoto())
                    .into(imgFood);
            tvFoodName.setText(food.getName());
            tvFoodDetail.setText(food.getDetail());
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        // Tambahkan kode aksi di sini jika diperlukan
    }
}
