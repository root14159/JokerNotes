package athreya.amrnath.jokernotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class notes extends AppCompatActivity {
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        text = (EditText) findViewById(R.id.editText);
    }

    @Override
    protected void onPause() {
        text = (EditText) findViewById(R.id.editText);
        String newNote = text.getText().toString();
        Intent j = new Intent(this,MainActivity.class);
        j.putExtra("note",newNote);
        startActivity(j);
        super.onPause();
    }
}
