package jp.shipper.app.view.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import jp.shipper.app.R;
import jp.shipper.app.view.item.ChoseItem;

/**
 * Created by PaditechPC1 on 12/10/2015.
 */
public class ChoseAdapter extends BaseAdapter{

    private Context mContext;
    private ArrayList<ChoseItem> mChoseList;

    public ChoseAdapter(Context context, ArrayList<ChoseItem> list){
        this.mContext = context;
        this.mChoseList = list;
    }

    @Override
    public int getCount() {
        return mChoseList.size();
    }

    @Override
    public Object getItem(int position) {
        return mChoseList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.list_shipper_choose, null);
            holder = new ViewHolder();
            holder.btnChose = (Button) convertView.findViewById(R.id.btnchooseshipper);
            holder.title = (TextView) convertView.findViewById(R.id.nameshipper);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final ChoseItem choseItem = (ChoseItem)getItem(position);
        holder.title.setText(choseItem.getTitle());

        holder.btnChose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
//                                    // Get the layout inflater
                                    LayoutInflater inflater = LayoutInflater.from(mContext);;

                                    builder.setView(inflater.inflate(R.layout.dialog_access_shipper, null))
                                            // Add action buttons
                                            .setPositiveButton(R.string.OK, new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int id) {
                                                    Log.d("ducanh", choseItem.getTitle() + " OK");
                                                }
                                            })
                                            .setNegativeButton(R.string.Cancel, new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int id) {
                                                    Log.d("ducanh", choseItem.getTitle() + " Cancel");
                                                }
                                            }).show();
            }
        });
        return convertView;
    }

    public static class ViewHolder {
        Button btnChose;
        TextView title;
    }
}
