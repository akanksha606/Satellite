package android.example.satellite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private TextView signup;
    private Button button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signup=findViewById(R.id.button_sign);
        button_login=findViewById(R.id.button_login);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupIntent=new Intent(login.this,activity_signup.class);
                startActivity(signupIntent);
            }
        });
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent=new Intent(login.this,idea.class);
                startActivity(loginIntent);
            }
        });


    }
}
