package a12.lab.com.classwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText firstname = (EditText)findViewById(R.id.firstname);
        final EditText lastname = (EditText)findViewById(R.id.lastname);
        final EditText phoneNum = (EditText)findViewById(R.id.phoneNum);
        final EditText email = (EditText)findViewById(R.id.email);
        final Button VIEW= (Button) findViewById(R.id.VIEW);
        VIEW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), firstname.getText().toString() + " " + lastname.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
