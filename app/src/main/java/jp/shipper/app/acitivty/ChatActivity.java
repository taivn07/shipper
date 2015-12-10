package jp.shipper.app.acitivty;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import jp.shipper.app.R;
import jp.shipper.app.adapter.MessageAdapter;
import jp.shipper.app.object.MessageObject;

/**
 * Created by paditechmacbookair on 12/9/15.
 */
public class ChatActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnBack;
    Button btnAddPeople;
    Button btnSend;
    EditText edtMessage;
    ListView lvMessages;
    MessageAdapter msgAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        btnBack = (Button) findViewById(R.id.btn_back);
        btnAddPeople = (Button) findViewById(R.id.btn_add_people);
        lvMessages = (ListView) findViewById(R.id.lv_message);
        btnSend = (Button) findViewById(R.id.btn_send);
        edtMessage = (EditText) findViewById(R.id.edt_message_content);

        ArrayList<MessageObject> messageArray = new ArrayList<>();
        messageArray.add(new MessageObject("Hello", 1));
        messageArray.add(new MessageObject("This section lists Android Studio keyboard shortcuts", 1));
        messageArray.add(new MessageObject("Hello", 2));
        messageArray.add(new MessageObject("This section lists Android Studio keyboard shortcuts", 2));
        messageArray.add(new MessageObject("Hello", 1));
        messageArray.add(new MessageObject("If you're using Mac OS X, update your keymap to use the Mac OS X ", 2));

        msgAdapter = new MessageAdapter(this, messageArray, 1);
        lvMessages.setAdapter(msgAdapter);

        btnBack.setOnClickListener(this);
        btnSend.setOnClickListener(this);
        scrollMyListViewToBottom();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back:
                finish();
                break;
            case R.id.btn_send:
                String message = edtMessage.getText().toString();
                if (message!=null && !message.equals("")) {
                    MessageObject msgObject = new MessageObject(message,1);
                    msgAdapter.getMessageArray().add(msgObject);
                    msgAdapter.notifyDataSetChanged();
                    scrollMyListViewToBottom();
                    edtMessage.setText("");
                }

                break;
        }
    }

    private void scrollMyListViewToBottom() {
        lvMessages.post(new Runnable() {
            @Override
            public void run() {
                lvMessages.setSelection(msgAdapter.getCount() - 1);
            }
        });
    }


}
