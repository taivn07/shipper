package jp.shipper.app.view.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ViewFlipper;

import java.util.ArrayList;

import jp.shipper.app.R;
import jp.shipper.app.acitivty.ChatActivity;
import jp.shipper.app.view.item.HistoryItem;
import jp.shipper.app.view.item.YeuCauMoiItem;

/**
 * Created by PaditechPC1 on 12/11/2015.
 */
public class YeuCauMoiAdapter extends BaseAdapter {

    private static final int LIST_ITEM_TYPE_1 = 0;
    private final Context context;


    int type;
    private ArrayList<YeuCauMoiItem> mListItems = new ArrayList<>();

    public YeuCauMoiAdapter(Context context, ArrayList<YeuCauMoiItem> mListItems) {
        this.context = context;
        this.mListItems = mListItems;
    }

    @Override
    public int getCount() {
        return mListItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mListItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.yeucaumoi_item, null);
            holder = new ViewHolder();
            holder.viewFlipper = (ViewFlipper) convertView.findViewById(R.id.yeucaumoiviewfilper);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        type = ((YeuCauMoiItem) getItem(position)).getType();
        switch (type) {
            case LIST_ITEM_TYPE_1:
                holder.viewFlipper.setDisplayedChild(0);
                // process receiver ship
                Button btnnhanship=(Button) convertView.findViewById(R.id.btnnhanship);
                btnnhanship.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int a=1;
                        if(a==1){
                            AlertDialog.Builder builder = new AlertDialog.Builder(context);
//                                    // Get the layout inflater
                            LayoutInflater inflater = LayoutInflater.from(context);;

                            builder.setView(inflater.inflate(R.layout.dialog_receiver_shipper, null))
                                    // Add action buttons
                                    .setPositiveButton(R.string.OK, new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int id) {

                                        }
                                    })
                                    .setNegativeButton(R.string.Cancel, new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {

                                        }
                                    }).show();
                        } else if (a==0){
                            AlertDialog.Builder builder_cancel = new AlertDialog.Builder(context);
//                                    // Get the layout inflater
                            LayoutInflater inflater_cancel = LayoutInflater.from(context);;

                            builder_cancel.setView(inflater_cancel.inflate(R.layout.dialog_reject_shipper, null))
                                    // Add action buttons
                                    .setPositiveButton(R.string.OK, new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int id) {

                                        }
                                    }).show();
                        }

                    }
                });
                // process chat in "yeu cau moi"
                Button btn_chat_yeucaumoi = (Button) convertView.findViewById(R.id.btn_chat_yeucaumoi);
                btn_chat_yeucaumoi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myIntent = new Intent(context, ChatActivity.class);
                        context.startActivity(myIntent);
                    }
                });
                break;
        }

        return convertView;
    }

    public static class ViewHolder {
        ViewFlipper viewFlipper;
    }
}
