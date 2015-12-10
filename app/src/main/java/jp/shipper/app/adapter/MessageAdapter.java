package jp.shipper.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import jp.shipper.app.R;
import jp.shipper.app.object.MessageObject;

/**
 * Created by paditechmacbookair on 12/9/15.
 */
public class MessageAdapter extends BaseAdapter {

    Context mContext;
    ArrayList<MessageObject> messageArray;
    int userId;

    public MessageAdapter(Context mContext, ArrayList<MessageObject> messageArray, int userId) {
        this.mContext = mContext;
        this.messageArray = messageArray;
        this.userId = userId;
    }

    @Override
    public int getCount() {
        return messageArray.size();
    }

    @Override
    public MessageObject getItem(int position) {
        return messageArray.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return messageArray.get(position).getUserId() == userId ? 1 : 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int viewType = getItemViewType(position);
        MessageObject object = getItem(position);
        if (viewType == 1) {

            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_own_message, parent, false);
            setupContent(convertView, object.getMessage(), object.getUserId());

        } else if (viewType == 2) {

            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_client_message, parent, false);
            setupContent(convertView, object.getMessage(), object.getUserId());
        }
        return convertView;
    }

    class OwnViewHolder {
        ImageView imgChatHead;
        TextView txtMessageContent;

        public OwnViewHolder(View v) {
            imgChatHead = (ImageView) v.findViewById(R.id.img_chat_head);
            txtMessageContent = (TextView) v.findViewById(R.id.txt_message_content);
        }
    }

    class ClientViewHolder {
        ImageView imgChatHead;
        TextView txtMessageContent;

        public ClientViewHolder(View v) {
            imgChatHead = (ImageView) v.findViewById(R.id.img_chat_head);
            txtMessageContent = (TextView) v.findViewById(R.id.txt_message_content);
        }
    }

    private void setupContent(View convertView, String message, int type) {
        if (type == 1) {
            ((ImageView) convertView.findViewById(R.id.img_chat_head)).setImageResource(R.drawable.ic_user);
            ((TextView) convertView.findViewById(R.id.txt_message_content)).setText(message);
        } else if (type == 2) {
            ((ImageView) convertView.findViewById(R.id.img_chat_head)).setImageResource(R.drawable.ic_client);
            ((TextView) convertView.findViewById(R.id.txt_message_content)).setText(message);
        }
    }

    public ArrayList<MessageObject> getMessageArray() {
        return messageArray;
    }
}
