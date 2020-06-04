package com.example.bxc_logowanie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

import com.google.android.material.navigation.NavigationView;

import static com.example.bxc_logowanie.R.id.menuZaloguj;

public class HomePage extends AppCompatActivity {

    Button Login;
    Button Register;
    ViewFlipper v_flipper;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Login = (Button) findViewById(R.id.btHPLogin);
        Register = (Button) findViewById(R.id.btHPRegister);


        int images[] = {R.drawable.tokaido_slide, R.drawable.blood_rage_slide};

        v_flipper = findViewById(R.id.v_flipper);

        for (int i = 0; i<images.length; i++){
            flipperImages(images[i]);
        }

            Login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(HomePage.this, Login.class);
                    startActivity(intent);
                }
            });

            Register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(HomePage.this, AddNewUser.class);
                    startActivity(intent);
                }
            });


        final DrawerLayout drawerLayout = findViewById(R.id.drawerLayout2);
        findViewById(R.id.imageMenu2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        NavigationView navigationView = findViewById(R.id.navigationView2);
        navigationView.setItemIconTintList(null);

        NavController navController = Navigation.findNavController(this,R.id.navHostFragment);
        NavigationUI.setupWithNavController(navigationView, navController);
        }



    public void flipperImages(int image){

        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}
