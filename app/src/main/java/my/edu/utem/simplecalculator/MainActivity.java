package my.edu.utem.simplecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView answerTextView;
    EditText operand1editText, operand2editText;

    double operand1, operand2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerTextView = findViewById(R.id.answer_textView);
        operand1editText = findViewById(R.id.operand1_editText);
        operand2editText = findViewById(R.id.operand2_editText);

    }

    void addPressed(View view){
        operand1 = Double.parseDouble(operand1editText.getText().toString());
        operand2 = Double.parseDouble(operand2editText.getText().toString());
        answerTextView.setText(""+(operand1+operand2));
    }

    void subPressed(View view){
        operand1 = Double.parseDouble(operand1editText.getText().toString());
        operand2 = Double.parseDouble(operand2editText.getText().toString());
        answerTextView.setText(""+(operand1-operand2));
    }

    void mulPressed(View view){
        operand1 = Double.parseDouble(operand1editText.getText().toString());
        operand2 = Double.parseDouble(operand2editText.getText().toString());
        answerTextView.setText(""+(operand1*operand2));
    }

    void divPressed(View view){
        operand1 = Double.parseDouble(operand1editText.getText().toString());
        operand2 = Double.parseDouble(operand2editText.getText().toString());
        if (operand2 == 0){
            Toast.makeText(MainActivity.this, "Number cannot be 0", Toast.LENGTH_LONG).show();
        }
        else{
            answerTextView.setText(""+(operand1/operand2));
        }

    }
}
