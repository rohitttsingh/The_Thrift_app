package com.example.smartkartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class UserUploadingProducts extends AppCompatActivity {
    int SELECT_PICTURE = 200;
    Button BSelectImage;
    ImageView IVPreviewImage;
    EditText proname, prodetail,proprice;
    Button upload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_uploading_products);
            BSelectImage = findViewById(R.id.BSelectImage);
            IVPreviewImage = findViewById(R.id.IVPreviewImage);
            proname = findViewById(R.id.productname);
            prodetail = findViewById(R.id.prodetail);
            proprice = findViewById(R.id.price);
            upload = findViewById(R.id.uploadbtn);

            BSelectImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageChooser();
                }
            });

            upload.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String name = proname.getText().toString();
                    String detail = prodetail.getText().toString();
                    String price = proprice.getText().toString();

                    if(name.isEmpty()){
                        Toast.makeText(getApplicationContext(), "Name is Empty", Toast.LENGTH_SHORT).show();
                    }
                    else if(detail.isEmpty()){
                        Toast.makeText(getApplicationContext(), "Details is Empty", Toast.LENGTH_SHORT).show();

                    }
                    else if(price.isEmpty()){
                        Toast.makeText(getApplicationContext(), "Price is Empty", Toast.LENGTH_SHORT).show();

                    }

                    else {
                        Toast.makeText(getApplicationContext(), "Product "+name+" with price"+ price+"Added Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(),HomePageActivity.class));

                    }

                }
            });
        }

        void imageChooser() {

            Intent i = new Intent();
            i.setType("image/*");
            i.setAction(Intent.ACTION_GET_CONTENT);

            // pass the constant to compare it
            // with the returned requestCode
            startActivityForResult(Intent.createChooser(i, "Select Picture"), SELECT_PICTURE);
        }

        // this function is triggered when user
        // selects the image from the imageChooser
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);

            if (resultCode == RESULT_OK) {

                // compare the resultCode with the
                // SELECT_PICTURE constant
                if (requestCode == SELECT_PICTURE) {
                    // Get the url of the image from data
                    Uri selectedImageUri = data.getData();
                    if (null != selectedImageUri) {
                        // update the preview image in the layout
                        IVPreviewImage.setImageURI(selectedImageUri);
                    }
                }
            }
        }
    }