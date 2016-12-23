package dishari.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        private Button button;
        private Button button2;
        private Button button3;
        private Button button4;
        private EditText e1;
        private EditText e2;
        private TextView t1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                defineButtons();
        }

        private void defineButtons() {
                button = (Button) findViewById(R.id.button);
                button2 = (Button) findViewById(R.id.button2);
                button3 = (Button) findViewById(R.id.button3);
                button4 = (Button) findViewById(R.id.button4);
                button.setOnClickListener(this);
                button2.setOnClickListener(this);
                button3.setOnClickListener(this);
                button4.setOnClickListener(this);

                e1 = (EditText) findViewById(R.id.editText);
                e2 = (EditText) findViewById(R.id.editText2);
                t1 = (TextView) findViewById(R.id.editText3);
        }

        @Override
        public void onClick(View v) {
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e2.getText().toString());
                switch (v.getId()) {
                        case R.id.button:

                        {

                                int sum = num1 + num2;
                                t1.setText(String.valueOf(sum));
                                break;
                        }
                        case R.id.button2:

                        {

                                int diff = num1 - num2;
                                t1.setText(String.valueOf(diff));
                                break;

                        }
                        case R.id.button3:


                        {
                                int multiply = num1 * num2;
                                t1.setText(String.valueOf(multiply));
                                break;
                        }
                        case R.id.button4:


                        {
                                if (num2 != 0) {
                                        int divide = num1 / num2;
                                        t1.setText(String.valueOf(divide));
                                        break;
                                } else {
                                        Toast.makeText(
                                                MainActivity.this, " not valid", Toast.LENGTH_LONG

                                        ).show();
                                        break;
                                }
                        }


                }
        }


}