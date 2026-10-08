package com.example.grid;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView gridview;

    int[] images = {
            R.drawable.image,
            R.drawable.imgage1,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image6,
            R.drawable.img
    };

    String[] names = {
            "tiger",
            "elephant",
            "panda",
            "kangaroo",
            "wildcat",
            "sheep"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        gridview = findViewById(R.id.gridview);

        ImageAdapter adapter = new ImageAdapter(this,images);
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        showAlertDialog(i);
                    }
                }
        );
    }
    public void showAlertDialog(int position) {

        ImageView imageView = new ImageView(this);

        imageView.setImageResource(images[position]);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this);

        builder.setTitle(names[position]);
        builder.setMessage("You selected " + names[position]);
        builder.setIcon(images[position]);
        builder.setPositiveButton("OK", null);

        builder.show();
    }
}