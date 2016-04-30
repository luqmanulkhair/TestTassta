package com.tassta.test.main;

import android.R.id;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.tassta.test.chat.Consumer;
import com.tassta.test.chat.Message;
import com.tassta.test.chat.R;
import com.tassta.test.chat.User;
import com.tassta.test.chat.UserStateChangeHandler;
import com.tassta.test.chat.noimpl.IoManger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends ListActivity  {

    String[] statuses = new String[] {
            "online",
            "offline",
            "online",
            "offline",
            "online"
    };

    String[] users = new String[] {
            "david",
            "paul",
            "fabiyan",
            "Xin",
            "Petra"
    };

    String[] notifications = new String[] {
            "hi,hello",
            "",
            "bye bye",
            "",
            "Yes, all is well."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        List<HashMap<String,String>> contactList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<5;i++){
            HashMap<String, String> contactMap = new HashMap<String,String>();
            contactMap.put("status", "Status : " + statuses[i]);
            contactMap.put("user","User : " + users[i]);
//            contactMap.put("notification","Notification : " + notifications[i]);
            contactMap.put("avatar", Integer.toString(R.drawable.avatar) );
            contactList.add(contactMap);
        }




        // Keys used in Hashmap
        String[] from = { "status","user","notification" };

        // Ids of views in listview_layout
        int[] to = { R.id.status,R.id.username,R.id.avatar};


        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), contactList, R.layout.listview, from, to);
        getListView().setAdapter(adapter);

         ListView listView= (ListView) findViewById(id.list);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Intent intent = new Intent(MainActivity.this,MessageActivity.class);

                intent.putExtra("indexNumber",i);
                intent.putExtra("user",users[i]);
                startActivity(intent);

            }
        });


    }





    public class MsgHandler implements IoManger
    {

        @Override
        public void sendMessage(User receiver, String text) throws Exception {

        }

        @Override
        public void setRecieveMessageHandler(Consumer<Message> handler) {




        }

        @Override
        public void setUserStateChangeHandler(UserStateChangeHandler handler) {

        }

        @Override
        public void setUserAddedHandler(Consumer<User> handler) {

        }

        @Override
        public void setUserRemovedHandler(int userId) {

        }
    }

}
