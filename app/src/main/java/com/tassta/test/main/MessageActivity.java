package com.tassta.test.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tassta.test.chat.MessageHistoryModelImpl;
import com.tassta.test.chat.User;
import com.tassta.test.chat.UserImpl;
import com.tassta.test.chat.R;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_activity);

        String userText = (String) getIntent().getExtras().get("user");

        TextView historyTV = (TextView) findViewById(R.id.msg_history);

        /////Dummy code
        MessageHistoryModelImpl messageHistory= new MessageHistoryModelImpl();
        User user= new UserImpl();
        messageHistory.getMessageHistory(user);

        historyTV.setText(userText);


    }
}
