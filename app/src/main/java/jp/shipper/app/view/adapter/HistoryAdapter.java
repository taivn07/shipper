package jp.shipper.app.view.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

import jp.shipper.app.R;
import jp.shipper.app.acitivty.ChatActivity;
import jp.shipper.app.acitivty.GiaoHangVaNhanTienActivity;
import jp.shipper.app.view.item.HistoryItem;

/**
 * Created by PaditechPC1 on 12/9/2015.
 */
public class HistoryAdapter extends BaseAdapter {
    private static final int LIST_ITEM_TYPE_1 = 0;
    private static final int LIST_ITEM_TYPE_2 = 1;
    private static final int LIST_ITEM_TYPE_3 = 2;
    private static final int LIST_ITEM_TYPE_4 = 3;
    private static final int LIST_ITEM_TYPE_5 = 4;
    private static final int LIST_ITEM_TYPE_6 = 5;
    private final Context context;


    int type;
    private ArrayList<HistoryItem> mListItems = new ArrayList<>();

    public HistoryAdapter(Context context, ArrayList<HistoryItem> mListItems) {
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
    public View getView(int position, View convertView, final ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.history_item, null);
            holder = new ViewHolder();
            holder.viewFlipper = (ViewFlipper) convertView.findViewById(R.id.viewfilper);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        type = ((HistoryItem) getItem(position)).getType();
        switch (type) {
            case LIST_ITEM_TYPE_1:

                holder.viewFlipper.setDisplayedChild(0);
                Button btntimship = (Button) convertView.findViewById(R.id.chooseship);
                final LinearLayout llChonShipper = (LinearLayout) convertView.findViewById(R.id.ll_chonshipper);
                final ListView lvchoose;
                lvchoose = (ListView) convertView.findViewById(R.id.lvchooseship);
                final Button btncancel = (Button) convertView.findViewById(R.id.cancel);
                ChoseAdapter choseAdapter = new ChoseAdapter(context, ((HistoryItem) getItem(position)).getChoseItemList());
                lvchoose.setAdapter(choseAdapter);

                btntimship.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        llChonShipper.setVisibility(View.VISIBLE);
                        btncancel.setVisibility(View.VISIBLE);

                    }
                });

                btncancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        llChonShipper.setVisibility(View.GONE);
                        btncancel.setVisibility(View.GONE);
                    }
                });
                break;
            case LIST_ITEM_TYPE_2:
                holder.viewFlipper.setDisplayedChild(1);
                Button btngiaohang = (Button)convertView.findViewById(R.id.btn_giaohang_cholayhang);
//                final LinearLayout llgiaohang = (LinearLayout) convertView.findViewById(R.id.ll_giaohang);
                btngiaohang.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        llgiaohang.setVisibility(View.VISIBLE);
                        Intent myIntentGiaohang = new Intent(context, GiaoHangVaNhanTienActivity.class);
                        context.startActivity(myIntentGiaohang);
                    }
                });
                Button btnchat =(Button)convertView.findViewById(R.id.btn_chat_cholayhang);
                btnchat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myIntent = new Intent(context, ChatActivity.class);
                        context.startActivity(myIntent);
                    }
                });
                break;
            case LIST_ITEM_TYPE_3:
                holder.viewFlipper.setDisplayedChild(2);
                break;
            case LIST_ITEM_TYPE_4:
                holder.viewFlipper.setDisplayedChild(3);
                break;
            case LIST_ITEM_TYPE_5:
                holder.viewFlipper.setDisplayedChild(4);
                break;
            case LIST_ITEM_TYPE_6:
                holder.viewFlipper.setDisplayedChild(5);
                break;
        }

        return convertView;

    }

//    private void initiatePopupWindow() {
//        String[] lines ={"1","2","3"};
//
//        ListView lvchoose =(ListView)layout.findViewById(R.id.lvchooseship);
//        ArrayAdapter<String> adapterBieuTuong = new ArrayAdapter<String>(context.getApplicationContext(),R.layout.list_shipper_choose,lines);
//        lvchoose.setAdapter(adapterBieuTuong);
//
//    }

    public static class ViewHolder {
        ViewFlipper viewFlipper;
    }
}
