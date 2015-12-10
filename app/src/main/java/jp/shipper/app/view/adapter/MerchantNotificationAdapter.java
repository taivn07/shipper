package jp.shipper.app.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import jp.shipper.app.R;
import jp.shipper.app.view.item.MerchantNotificationItem;
import jp.shipper.app.view.item.ShipperNotificationItem;

/**
 * Created by QuyTrongNguyen on 10/12/2015.
 */
public class MerchantNotificationAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<MerchantNotificationItem> mData;
    ViewHolder holder;

    public MerchantNotificationAdapter(Context mContext, ArrayList<MerchantNotificationItem> mData) {
        super();
        this.mContext = mContext;
        this.mData = mData;
    }
    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public MerchantNotificationItem getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {

            LayoutInflater vi = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R.layout.item_listview_shipper_notification, null);
            holder = new ViewHolder();
            holder.mImageViewHS = (ImageView) convertView.findViewById(R.id.item_shipper_notification_img_HS);
            holder.mTextViewContent = (TextView) convertView.findViewById(R.id.shipper_notification_tv_content);
            holder.mTextViewDate = (TextView) convertView.findViewById(R.id.shipper_notification_tv_date);
            holder.mImageViewContentType = (ImageView) convertView.findViewById(R.id.shipper_notification_img_contentType);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        MerchantNotificationItem mItem = mData.get(position);
        if (mItem != null) {
            holder.mImageViewHS.setImageResource(R.drawable.ic_homeship);
            holder.mTextViewContent.setText(mItem.getContent());
            holder.mTextViewDate.setText(mItem.getDate());
            switch (mItem.getContentType()) {
                case 1:
                    holder.mImageViewContentType.setImageResource(R.drawable.ic_notification_type_1);
                    break;
                case 2:
                    holder.mImageViewContentType.setImageResource(R.drawable.ic_notification_type_2);
                    break;
                case 3:
                    holder.mImageViewContentType.setImageResource(R.drawable.ic_homeship);
                    break;
                case 4:
                    holder.mImageViewContentType.setImageResource(R.drawable.ic_notification_type_2);
                    break;
                case 5:
                    holder.mImageViewContentType.setImageResource(R.drawable.ic_notification_type_2);
            }
        }
        return convertView;
    }

    public static class ViewHolder {
        public ImageView mImageViewHS;
        public TextView mTextViewContent;
        public TextView mTextViewDate;
        public ImageView mImageViewContentType;
    }
}
