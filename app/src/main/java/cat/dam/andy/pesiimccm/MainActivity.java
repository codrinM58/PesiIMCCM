package cat.dam.andy.pesiimccm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView pes, metres;
    Button imc;
    EditText textPes, textMetres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pes = (TextView) findViewById(R.id.tv_pes);
        metres = (TextView) findViewById(R.id.tv_metres);
        textPes = (EditText) findViewById(R.id.user_pes);
        textMetres = (EditText) findViewById(R.id.user_metres);
        imc = (Button) findViewById(R.id.btn_mic);
    }
    public void CalcularOnClick(View v){
        try{
            double pes = Double.parseDouble(textPes.getText().toString());
            double metres = Double.parseDouble(textMetres.getText().toString());

            Intent i = new Intent(this, MainActivity3.class);
            i.putExtra("pes",pes);
            i.putExtra("alçada", metres);
            i.putExtra("resultado","Per un pes de " + pes + " quilograms i una alçada de " + metres + " metres.");
            startActivity(i);
        }catch (Exception e){
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        }
    }

}