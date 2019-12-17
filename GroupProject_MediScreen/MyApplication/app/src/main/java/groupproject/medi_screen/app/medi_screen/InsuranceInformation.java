package groupproject.medi_screen.app.medi_screen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class InsuranceInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance_information);

        Button SaveButton = (Button) findViewById(R.id.SaveInsuranceInfo);
        SaveButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
            }
        });

        Button HomeButton = (Button) findViewById(R.id.HomeButton);
        HomeButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                openHome();
            }
        });
    }

    public void openHome(){
        Intent intentHome = new Intent(this, MainActivity.class);
        startActivity(intentHome);
    }
}
