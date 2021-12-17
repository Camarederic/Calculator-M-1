package com.camarederic.calculatorm_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    private TextView history;
    private EditText display;

    private ImageView button_0, button_00, button_1, button_2, button_3, button_4, button_5, button_6,
            button_7, button_8, button_9, buttonDot, buttonEqual, buttonPlus, buttonMinus, buttonMultiply,
            buttonDivision, buttonPercent, buttonAddSub, buttonClear, buttonDelete,
            buttonLeftBracket, buttonRightBracket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.edit_text_display);
        history = findViewById(R.id.text_view_history);

        button_0 = findViewById(R.id.image_view_0);
        button_00 = findViewById(R.id.image_view_00);
        button_1 = findViewById(R.id.image_view_1);
        button_2 = findViewById(R.id.image_view_2);
        button_3 = findViewById(R.id.image_view_3);
        button_4 = findViewById(R.id.image_view_4);
        button_5 = findViewById(R.id.image_view_5);
        button_6 = findViewById(R.id.image_view_6);
        button_7 = findViewById(R.id.image_view_7);
        button_8 = findViewById(R.id.image_view_8);
        button_9 = findViewById(R.id.image_view_9);
        buttonDot = findViewById(R.id.image_view_dot);
        buttonEqual = findViewById(R.id.image_view_equal);
        buttonPlus = findViewById(R.id.image_view_plus);
        buttonMinus = findViewById(R.id.image_view_minus);
        buttonMultiply = findViewById(R.id.image_view_multiply);
        buttonDivision = findViewById(R.id.image_view_division);
        buttonPercent = findViewById(R.id.image_view_percent);
        buttonAddSub = findViewById(R.id.image_view_add_sub);
        buttonClear = findViewById(R.id.image_view_C);
        buttonDelete = findViewById(R.id.image_view_delete);
        buttonLeftBracket = findViewById(R.id.image_view_leftP);
        buttonRightBracket = findViewById(R.id.image_view_rightP);

        // Чтобы не появлялась клавиатура
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            display.setShowSoftInputOnFocus(false);
        }

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_zero));

            }
        });

        button_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_two_zero));
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_one));
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_two));
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_three));
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_four));
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_five));
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_six));
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_seven));
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_eight));
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_nine));
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_dot));
            }
        });

        buttonLeftBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_left_bracket));
            }
        });

        buttonRightBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_right_bracket));
            }
        });

        buttonAddSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_add_sub));
            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_percent));
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_plus));
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_minus));
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_multiply));
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClick(getResources().getString(R.string.image_division));
            }
        });


        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("");
                history.setText("");

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userExpression = display.getText().toString();

                history.setText(userExpression);

                userExpression = userExpression.replaceAll(getResources().getString(R.string.image_division), "/");
                userExpression = userExpression.replaceAll(getResources().getString(R.string.image_multiply), "*");

                Expression expression = new Expression(userExpression);
                String result = String.valueOf(expression.calculate());

                display.setText(result);
                display.setSelection(result.length());

            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cursorPosition = display.getSelectionStart();
                int textLength = display.getText().length();

                if (cursorPosition != 0 && textLength != 0) {
                    SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
                    selection.replace(cursorPosition - 1, cursorPosition, "");
                    display.setText(selection);
                    display.setSelection(cursorPosition - 1);
                }
            }
        });
    }

    private void numberClick(String view) {
        String oldText = display.getText().toString();
        int cursorPosition = display.getSelectionStart();
        String leftString = oldText.substring(0, cursorPosition);
        String rightString = oldText.substring(cursorPosition);

        display.setText(String.format("%s%s%s", leftString, view, rightString));
        display.setSelection(cursorPosition + view.length());
    }
}