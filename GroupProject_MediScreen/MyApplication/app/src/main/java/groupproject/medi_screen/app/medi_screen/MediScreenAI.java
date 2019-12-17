package groupproject.medi_screen.app.medi_screen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MediScreenAI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medi_screen_ai);

        Button RunAIButton = (Button) findViewById(R.id.runAIButton);
        RunAIButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(MediScreenAI.this, "Now running the Medi Screen AI...", Toast.LENGTH_SHORT).show();
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
