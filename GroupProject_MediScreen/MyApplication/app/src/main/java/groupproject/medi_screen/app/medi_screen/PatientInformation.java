package groupproject.medi_screen.app.medi_screen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PatientInformation extends AppCompatActivity {

    EditText patientName;
    DatabaseReference reff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_information);

        Button SaveButton = (Button) findViewById(R.id.SavePatientInfo);
        SaveButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                patientName = (EditText)findViewById(R.id.PatientName);

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
