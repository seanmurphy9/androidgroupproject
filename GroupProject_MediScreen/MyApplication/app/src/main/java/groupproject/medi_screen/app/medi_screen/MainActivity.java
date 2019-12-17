package groupproject.medi_screen.app.medi_screen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button EnterButton = (Button) findViewById(R.id.ActivityButton);
        EnterButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                openLoginActivity();
            }
        });
    }

    public void openLoginActivity(){
        Intent intentLogin = new Intent(this, PatientInformation.class);
        startActivity(intentLogin);
    }

}
