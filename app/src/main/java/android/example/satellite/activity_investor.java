package android.example.satellite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_investor extends AppCompatActivity {
    private Button signup_investor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investor);
        signup_investor=findViewById(R.id.signup_investor);
        signup_investor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupInvestorIntent=new Intent(activity_investor.this,idea.class);
                startActivity(signupInvestorIntent);
            }
        });
    }
}
