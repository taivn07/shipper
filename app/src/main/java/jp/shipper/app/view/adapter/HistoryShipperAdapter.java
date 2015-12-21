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
import jp.shipper.app.view.item.HistoryShipperObject;

/**
 * Created by QuyTrongNguyen on 13/12/2015.
 */
public class HistoryShipperAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<HistoryShipperObject> mData;
    private ViewHolder mViewHolder;
    private FragmentManager mFragmentManager;
    private static final int CHO_LAY_HANG = 1;
    private static final int NHAN_HANG = 2;
    private static final int DANG_DI_GIAO = 3;
    private static final int DA_GIAO_HANG = 4;
    private static final int HANG_TRA_LAI = 5;


    public HistoryShipperAdapter(Context mContext, ArrayList<HistoryShipperObject> mData) {
        super();
        this.mContext = mContext;
        this.mData = mData;
        mFragmentManager = ((Activity) mContext).getFragmentManager();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public HistoryShipperObject getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public void setData(ArrayList<HistoryShipperObject> m ){
        this.mData = m;
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater vi = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R.layout.item_history_shipper, null);

            mViewHolder = new ViewHolder();
            mViewHolder.mImgShop = (ImageView) convertView.findViewById(R.id.history_shipper_img_shop);
            mViewHolder.mImageViewStatus = (ImageView) convertView.findViewById(R.id.history_shipper_img_status);
            mViewHolder.mImg1 = (ImageView) convertView.findViewById(R.id.history_shipper_img_1);
            mViewHolder.mImg2 = (ImageView) convertView.findViewById(R.id.history_shipper_img_2);
            mViewHolder.mImg3 = (ImageView) convertView.findViewById(R.id.history_shipper_img_3);
            mViewHolder.mImg4 = (ImageView) convertView.findViewById(R.id.history_shipper_img_4);
            mViewHolder.mImg5 = (ImageView) convertView.findViewById(R.id.history_shipper_img_5);
            mViewHolder.mImg6 = (ImageView) convertView.findViewById(R.id.history_shipper_img_6);
            mViewHolder.mImg8 = (ImageView) convertView.findViewById(R.id.history_shipper_img_8);
            mViewHolder.mImg7 = (ImageView) convertView.findViewById(R.id.history_shipper_img_7);

            mViewHolder.mTv1 = (TextView) convertView.findViewById(R.id.history_shipper_tv1);
            mViewHolder.mTv2 = (TextView) convertView.findViewById(R.id.history_shipper_tv2);
            mViewHolder.mTv3 = (TextView) convertView.findViewById(R.id.history_shipper_tv3);
            mViewHolder.mTv4 = (TextView) convertView.findViewById(R.id.history_shipper_tv4);
            mViewHolder.mTv5 = (TextView) convertView.findViewById(R.id.history_shipper_tv5);

            mViewHolder.mTvNameShop = (TextView) convertView.findViewById(R.id.item_history_shipper_nameshop);
            mViewHolder.mTvSenderAdd = (TextView) convertView.findViewById(R.id.item_history_senderAddress);
            mViewHolder.mTvReceiverAdd = (TextView) convertView.findViewById(R.id.item_history_receiverAddress);
            mViewHolder.mTvThuHo = (TextView) convertView.findViewById(R.id.item_history_thuho);
            mViewHolder.mTvPhiShip = (TextView) convertView.findViewById(R.id.item_history_phiship);
            mViewHolder.mTvYeuCau = (TextView) convertView.findViewById(R.id.history_shipper_yeucau);
            mViewHolder.mTvKhoangCach = (TextView) convertView.findViewById(R.id.item_history_shipper_khoangcach);
            mViewHolder.mTvDate = (TextView) convertView.findViewById(R.id.item_history_shipper_date);

            mViewHolder.Rl1_chat = (RelativeLayout) convertView.findViewById(R.id.rl_chat);
            mViewHolder.Rl2_goi = (RelativeLayout) convertView.findViewById(R.id.rl_goi);
            mViewHolder.Rl3_nhanhang = (RelativeLayout) convertView.findViewById(R.id.rl_nhanhang);
            mViewHolder.Rl4_nguoinhan = (RelativeLayout) convertView.findViewById(R.id.rl_nguoinhan);
            mViewHolder.Rl5_huydon = (RelativeLayout) convertView.findViewById(R.id.rl_huydon);
            mViewHolder.Rl6_giaohang = (RelativeLayout) convertView.findViewById(R.id.rl_giaohang);
            mViewHolder.Rl7_trahang = (RelativeLayout) convertView.findViewById(R.id.rl_trahang);
            mViewHolder.Rl8_danhgia = (RelativeLayout) convertView.findViewById(R.id.rl_danhgia);
            mViewHolder.RL9_nhatky = (RelativeLayout) convertView.findViewById(R.id.rl_nhatky);
            mViewHolder.Rl10_huygiao = (RelativeLayout) convertView.findViewById(R.id.rl_huygiao);


            convertView.setTag(mViewHolder);

        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }
        HistoryShipperObject mItem = mData.get(position);
        if (mItem != null) {
            setViewVisibile();
            switch (mItem.getStatus()) {

                case CHO_LAY_HANG:
                    // set image status cho lay hang

                    mViewHolder.mImageViewStatus.setImageResource(R.drawable.img_cholayhang);
                    mViewHolder.Rl6_giaohang.setVisibility(View.GONE);
                    mViewHolder.Rl7_trahang.setVisibility(View.GONE);
                    mViewHolder.Rl8_danhgia.setVisibility(View.GONE);
                    mViewHolder.RL9_nhatky.setVisibility(View.GONE);
                    mViewHolder.Rl10_huygiao.setVisibility(View.GONE);
                    break;
                case NHAN_HANG:
                    // set image status nhan hang
                    mViewHolder.mImageViewStatus.setImageResource(R.drawable.img_nhanlaihang);
                    mViewHolder.Rl6_giaohang.setVisibility(View.GONE);
                    mViewHolder.Rl7_trahang.setVisibility(View.GONE);
                    mViewHolder.Rl8_danhgia.setVisibility(View.GONE);
                    mViewHolder.RL9_nhatky.setVisibility(View.GONE);
                    mViewHolder.Rl10_huygiao.setVisibility(View.GONE);


                    break;
                case DANG_DI_GIAO:
                    // set image status dang di giao

                    mViewHolder.mImageViewStatus.setImageResource(R.drawable.dangdigiao);
                    mViewHolder.Rl3_nhanhang.setVisibility(View.GONE);
                    mViewHolder.Rl5_huydon.setVisibility(View.GONE);
                    mViewHolder.Rl8_danhgia.setVisibility(View.GONE);
                    mViewHolder.RL9_nhatky.setVisibility(View.GONE);
                    mViewHolder.Rl10_huygiao.setVisibility(View.GONE);
                    break;
                case DA_GIAO_HANG:
                    // set image status cho da giao hang

                    mViewHolder.Rl3_nhanhang.setVisibility(View.GONE);
                    mViewHolder.Rl6_giaohang.setVisibility(View.GONE);
                    mViewHolder.Rl7_trahang.setVisibility(View.GONE);
                    mViewHolder.Rl5_huydon.setVisibility(View.GONE);
                    mViewHolder.Rl10_huygiao.setVisibility(View.GONE);
                    mViewHolder.mImageViewStatus.setImageResource(R.drawable.dagiaohang);
                    break;
                case HANG_TRA_LAI:
                    // set image status cho hang tra lai
                    mViewHolder.Rl3_nhanhang.setVisibility(View.GONE);
                    mViewHolder.Rl5_huydon.setVisibility(View.GONE);
                    mViewHolder.Rl6_giaohang.setVisibility(View.GONE);
                    mViewHolder.Rl8_danhgia.setVisibility(View.GONE);
                    mViewHolder.RL9_nhatky.setVisibility(View.GONE);
                    mViewHolder.mImageViewStatus.setImageResource(R.drawable.img_tralai);
                    break;
                default:
                    break;

            }
            mViewHolder.mImgShop.setImageResource(R.drawable.img_user);
            mViewHolder.mTvNameShop.setText(mItem.getNameShop());
            mViewHolder.mTvSenderAdd.setText(mItem.getAddressOfSender());
            mViewHolder.mTvReceiverAdd.setText(mItem.getAddressOfReceiver());
            mViewHolder.mTvPhiShip.setText("Phí Ship: " + mItem.getPhiShip() + " status " + mItem.getStatus());
            mViewHolder.mTvThuHo.setText("Thu Hộ: " + mItem.getThuHo() + "");
            mViewHolder.mTvYeuCau.setText("Yêu Cầu: " + mItem.getYeuCau() + "");
            mViewHolder.mTvKhoangCach.setText("Cách Bạn: " + mItem.getKhoangCach());
            mViewHolder.mTvDate.setText("Ngày Tháng: " + mItem.getDate());
        }

        mViewHolder.Rl3_nhanhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DialogsFragment dialogFragment = new DialogsFragment();
                dialogFragment.show(mFragmentManager, "nhanhang");
            }
        });

        mViewHolder.Rl6_giaohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogGiaoHangThanhCong dialogGiaoHangThanhCong = new DialogGiaoHangThanhCong();
                dialogGiaoHangThanhCong.show(mFragmentManager, "giaohangthanhcong");
            }
        });
        mViewHolder.Rl5_huydon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HuyDonDialogFragment huyDonDialogFragment = new HuyDonDialogFragment();
                huyDonDialogFragment.show(mFragmentManager, "huydon");
            }
        });
        mViewHolder.Rl1_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ChatActivity.class);
                mContext.startActivity(intent);
            }
        });
        return convertView;
    }

    private void setViewVisibile() {
        mViewHolder.Rl1_chat.setVisibility(View.VISIBLE);
        mViewHolder.Rl2_goi.setVisibility(View.VISIBLE);
        mViewHolder.Rl3_nhanhang.setVisibility(View.VISIBLE);
        mViewHolder.Rl4_nguoinhan.setVisibility(View.VISIBLE);
        mViewHolder.Rl5_huydon.setVisibility(View.VISIBLE);
        mViewHolder.Rl6_giaohang.setVisibility(View.VISIBLE);
        mViewHolder.Rl7_trahang.setVisibility(View.VISIBLE);
        mViewHolder.Rl8_danhgia.setVisibility(View.VISIBLE);
        mViewHolder.RL9_nhatky.setVisibility(View.VISIBLE);
        mViewHolder.Rl10_huygiao.setVisibility(View.VISIBLE);
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
