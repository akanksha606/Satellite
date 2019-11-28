package android.example.satellite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_signup extends AppCompatActivity {
      private Button button_investor,button_inventor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        button_inventor=findViewById(R.id.button_inventor);
        button_investor=findViewById(R.id.button_investor);
        button_inventor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inventorIntent=new Intent(activity_signup.this,activity_inventor.class);
                startActivity(inventorIntent);
            }
        });
        button_investor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent investorIntent=new Intent(activity_signup.this,activity_investor.class);
                startActivity(investorIntent);
            }
        });

    }
}
