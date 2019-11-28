package android.example.satellite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_inventor extends AppCompatActivity {
     private Button signup_inventor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventor);
        signup_inventor=findViewById(R.id.signup_inventor);
        signup_inventor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupInventorIntent=new Intent(activity_inventor.this,idea.class);
                startActivity(signupInventorIntent);
            }
        });
    }
}
