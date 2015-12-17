package jp.shipper.app.view.adapter;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import jp.shipper.app.R;
import jp.shipper.app.acitivty.ChatActivity;
import jp.shipper.app.fragment.DialogGiaoHangThanhCong;
import jp.shipper.app.fragment.DialogsFragment;
import jp.shipper.app.fragment.HuyDonDialogFragment;
import jp.shipper.app.view.item.HistoryGoShipperItem;

/**
 * Created by QuyTrongNguyen on 13/12/2015.
 */
public class HistoryGoShipperAdapter extends BaseAdapter {
    public Context mContext;
    ArrayList<HistoryGoShipperItem> mData;
    ViewHolder holder;
    FragmentManager fm;
    private static final int CHO_LAY_HANG = 1;
    private static final int NHAN_HANG = 2;
    private static final int DANG_DI_GIAO = 3;
    private static final int DA_GIAO_HANG = 4;
    private static final int HANG_TRA_LAI = 5;


    public HistoryGoShipperAdapter(Context mContext, ArrayList<HistoryGoShipperItem> mData) {
        super();
        this.mContext = mContext;
        this.mData = mData;
        fm = ((Activity) mContext).getFragmentManager();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public HistoryGoShipperItem getItem(int position) {
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
            convertView = vi.inflate(R.layout.history_shipper_lv_item, null);

            holder = new ViewHolder();
            holder.mImgShop = (ImageView) convertView.findViewById(R.id.history_shipper_img_shop);
            holder.mImageViewStatus = (ImageView) convertView.findViewById(R.id.history_shipper_img_status);
            holder.mImg1 = (ImageView) convertView.findViewById(R.id.history_shipper_img_1);
            holder.mImg2 = (ImageView) convertView.findViewById(R.id.history_shipper_img_2);
            holder.mImg3 = (ImageView) convertView.findViewById(R.id.history_shipper_img_3);
            holder.mImg4 = (ImageView) convertView.findViewById(R.id.history_shipper_img_4);
            holder.mImg5 = (ImageView) convertView.findViewById(R.id.history_shipper_img_5);
            holder.mImg6 = (ImageView) convertView.findViewById(R.id.history_shipper_img_6);
            holder.mImg8 = (ImageView) convertView.findViewById(R.id.history_shipper_img_8);
            holder.mImg7 = (ImageView) convertView.findViewById(R.id.history_shipper_img_7);

            holder.mTv1 = (TextView) convertView.findViewById(R.id.history_shipper_tv1);
            holder.mTv2 = (TextView) convertView.findViewById(R.id.history_shipper_tv2);
            holder.mTv3 = (TextView) convertView.findViewById(R.id.history_shipper_tv3);
            holder.mTv4 = (TextView) convertView.findViewById(R.id.history_shipper_tv4);
            holder.mTv5 = (TextView) convertView.findViewById(R.id.history_shipper_tv5);

            holder.mTvNameShop = (TextView) convertView.findViewById(R.id.item_history_shipper_nameshop);
            holder.mTvSenderAdd = (TextView) convertView.findViewById(R.id.item_history_senderAddress);
            holder.mTvReceiverAdd = (TextView) convertView.findViewById(R.id.item_history_receiverAddress);
            holder.mTvThuHo = (TextView) convertView.findViewById(R.id.item_history_thuho);
            holder.mTvPhiShip = (TextView) convertView.findViewById(R.id.item_history_phiship);
            holder.mTvYeuCau = (TextView) convertView.findViewById(R.id.history_shipper_yeucau);
            holder.mTvKhoangCach = (TextView) convertView.findViewById(R.id.item_history_shipper_khoangcach);
            holder.mTvDate = (TextView) convertView.findViewById(R.id.item_history_shipper_date);

            holder.Rl1_chat = (RelativeLayout) convertView.findViewById(R.id.rl_chat);
            holder.Rl2_goi = (RelativeLayout) convertView.findViewById(R.id.rl_goi);
            holder.Rl3_nhanhang = (RelativeLayout) convertView.findViewById(R.id.rl_nhanhang);
            holder.Rl4_nguoinhan = (RelativeLayout) convertView.findViewById(R.id.rl_nguoinhan);
            holder.Rl5_huydon = (RelativeLayout) convertView.findViewById(R.id.rl_huydon);
            holder.Rl6_giaohang = (RelativeLayout) convertView.findViewById(R.id.rl_giaohang);
            holder.Rl7_trahang = (RelativeLayout) convertView.findViewById(R.id.rl_trahang);
            holder.Rl8_danhgia = (RelativeLayout) convertView.findViewById(R.id.rl_danhgia);
            holder.RL9_nhatky = (RelativeLayout) convertView.findViewById(R.id.rl_nhatky);
            holder.Rl10_huygiao = (RelativeLayout) convertView.findViewById(R.id.rl_huygiao);


            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        HistoryGoShipperItem mItem = mData.get(position);
        if (mItem != null) {
            setViewVisibile();
            switch (mItem.getStatus()) {

                case CHO_LAY_HANG:
                    // set image status cho lay hang

                    holder.mImageViewStatus.setImageResource(R.drawable.dangdigiao);
                    holder.Rl6_giaohang.setVisibility(View.GONE);
                    holder.Rl7_trahang.setVisibility(View.GONE);
                    holder.Rl8_danhgia.setVisibility(View.GONE);
                    holder.RL9_nhatky.setVisibility(View.GONE);
                    holder.Rl10_huygiao.setVisibility(View.GONE);
                    break;
                case NHAN_HANG:
                    // set image status nhan hang
                    holder.mImageViewStatus.setImageResource(R.drawable.dagiaohang);
                    holder.Rl6_giaohang.setVisibility(View.GONE);
                    holder.Rl7_trahang.setVisibility(View.GONE);
                    holder.Rl8_danhgia.setVisibility(View.GONE);
                    holder.RL9_nhatky.setVisibility(View.GONE);
                    holder.Rl10_huygiao.setVisibility(View.GONE);


                    break;
                case DANG_DI_GIAO:
                    // set image status dang di giao

                    holder.mImageViewStatus.setImageResource(R.drawable.img_tralai);
                    holder.Rl3_nhanhang.setVisibility(View.GONE);
                    holder.Rl5_huydon.setVisibility(View.GONE);
                    holder.Rl8_danhgia.setVisibility(View.GONE);
                    holder.RL9_nhatky.setVisibility(View.GONE);
                    holder.Rl10_huygiao.setVisibility(View.GONE);
                    break;
                case DA_GIAO_HANG:
                    // set image status cho da giao hang

                    holder.Rl3_nhanhang.setVisibility(View.GONE);
                    holder.Rl6_giaohang.setVisibility(View.GONE);
                    holder.Rl7_trahang.setVisibility(View.GONE);
                    holder.Rl5_huydon.setVisibility(View.GONE);
                    holder.Rl10_huygiao.setVisibility(View.GONE);
                    holder.mImageViewStatus.setImageResource(R.drawable.img_cholayhang);
                    break;
                case HANG_TRA_LAI:
                    // set image status cho hang tra lai
                    holder.Rl3_nhanhang.setVisibility(View.GONE);
                    holder.Rl5_huydon.setVisibility(View.GONE);
                    holder.Rl6_giaohang.setVisibility(View.GONE);
                    holder.Rl8_danhgia.setVisibility(View.GONE);
                    holder.RL9_nhatky.setVisibility(View.GONE);
                    holder.mImageViewStatus.setImageResource(R.drawable.img_nhanlaihang);
                    break;
                default:
                    break;

            }
            holder.mImgShop.setImageResource(R.drawable.img_user);
            holder.mTvNameShop.setText(mItem.getNameShop());
            holder.mTvSenderAdd.setText(mItem.getAddressOfSender());
            holder.mTvReceiverAdd.setText(mItem.getAddressOfReceiver());
            holder.mTvPhiShip.setText("Phí Ship: " + mItem.getPhiShip() + " status " + mItem.getStatus());
            holder.mTvThuHo.setText("Thu Hộ: " + mItem.getThuHo() + "");
            holder.mTvYeuCau.setText("Yêu Cầu: " + mItem.getYeuCau() + "");
            holder.mTvKhoangCach.setText("Cách Bạn: " + mItem.getKhoangCach());
            holder.mTvDate.setText("Ngày Tháng: " + mItem.getDate());
        }

        holder.Rl3_nhanhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DialogsFragment dialogFragment = new DialogsFragment();
                dialogFragment.show(fm, "nhanhang");
            }
        });

        holder.Rl6_giaohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogGiaoHangThanhCong dialogGiaoHangThanhCong = new DialogGiaoHangThanhCong();
                dialogGiaoHangThanhCong.show(fm, "giaohangthanhcong");
            }
        });
        holder.Rl5_huydon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HuyDonDialogFragment huyDonDialogFragment = new HuyDonDialogFragment();
                huyDonDialogFragment.show(fm, "huydon");
            }
        });
        holder.Rl1_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ChatActivity.class);
                mContext.startActivity(intent);
            }
        });
        return convertView;
    }

    private void setViewVisibile() {
        holder.Rl1_chat.setVisibility(View.VISIBLE);
        holder.Rl2_goi.setVisibility(View.VISIBLE);
        holder.Rl3_nhanhang.setVisibility(View.VISIBLE);
        holder.Rl4_nguoinhan.setVisibility(View.VISIBLE);
        holder.Rl5_huydon.setVisibility(View.VISIBLE);
        holder.Rl6_giaohang.setVisibility(View.VISIBLE);
        holder.Rl7_trahang.setVisibility(View.VISIBLE);
        holder.Rl8_danhgia.setVisibility(View.VISIBLE);
        holder.RL9_nhatky.setVisibility(View.VISIBLE);
        holder.Rl10_huygiao.setVisibility(View.VISIBLE);
    }


    public static class ViewHolder {
        ImageView mImageViewStatus;
        ImageView mImg1, mImg2, mImg3, mImg4, mImg5, mImg6, mImg7, mImg8;
        TextView mTv1, mTv2, mTv3, mTv4, mTv5, mTvNameShop, mTvSenderAdd,
                mTvReceiverAdd, mTvThuHo, mTvPhiShip, mTvYeuCau, mTvKhoangCach, mTvDate;
        ImageView mImgShop;
        RelativeLayout Rl1_chat, Rl2_goi, Rl3_nhanhang, Rl4_nguoinhan, Rl5_huydon, Rl6_giaohang, Rl7_trahang, Rl8_danhgia, RL9_nhatky, Rl10_huygiao;
    }

}
