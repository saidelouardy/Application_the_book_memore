package com.example.firstprojet.prancipale;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.firstprojet.R;
import com.example.firstprojet.gniral.activtygniral;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editfirstname , editlastname;
    Button buttonlogoin;
    ImageView google,facebook,youtob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editfirstname =findViewById(R.id.editfirstname);
        editlastname=findViewById(R.id.editlastname);
        buttonlogoin=findViewById(R.id.buttonlogoin);
        google=findViewById(R.id.google);
        facebook=findViewById(R.id.facebook);
        youtob=findViewById(R.id.youtob);
        buttonlogoin.setOnClickListener(this);
        google.setOnClickListener(this);
        facebook.setOnClickListener(this);
        youtob.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonlogoin:if(buttonlogoin.isClickable()){
                firstandlasname(editfirstname,editlastname);
            }
            break;
            case R.id.google:if(google.isClickable()){
                Uri go = Uri.parse("https:/www.google.com");
                Intent gointent =new Intent(Intent.ACTION_VIEW,go);
                startActivity(gointent);
            }
            case R.id.facebook:if(facebook.isClickable()){
                Uri fa = Uri.parse("https://www.facebook.com/profile.php?id=100089650553525");
                Intent faintent =new Intent(Intent.ACTION_VIEW,fa);
                startActivity(faintent);
            }
            break;
            case R.id.youtob:if(youtob.isClickable()){
                Uri yo =Uri.parse("https://youtu.be/oaHX1UFHHAU");
                Intent yointent = new Intent(Intent.ACTION_VIEW,yo);
                startActivity(yointent);
            }
        }
    }
    public boolean firstandlasname(EditText editfirstname , EditText editlastname) {
        String firstname = editfirstname.getText().toString();
        String lastname = editlastname.getText().toString();

        if (firstname.isEmpty() && lastname.isEmpty())  {
            Toast.makeText(this, "enter your formation", Toast.LENGTH_LONG).show();
            return false;
        } else if (lastname.isEmpty()) {
            Toast.makeText(this, "enter your Last name", Toast.LENGTH_LONG).show();
            return false;
        } else if (firstname.isEmpty()) {
            Toast.makeText(this, "enter your First name", Toast.LENGTH_LONG).show();
            return false;
        } else {
            Intent intent = new Intent(MainActivity.this, activtygniral.class);
            Bundle bundle = new Bundle();
            bundle.putString("fname", editfirstname.getText().toString());
            bundle.putString("lname", editlastname.getText().toString());
            intent.putExtras(bundle);
            startActivity(intent);
            Toast.makeText(this, "successfull", Toast.LENGTH_LONG).show();
            return true;
        }
    }
}
